package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsPage {
    WebDriver driver;
    List<WebElement> elementsDropdownList;


    public ElementsPage(WebDriver driver) {

        this.driver = driver;
    }

    public List<WebElement> getElementsDropdownList() {

        return driver.findElements(By.cssSelector(".btn.btn-light"));
    }
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void selectButtonFromElements (String elementButtonName) {
        for (int i = 0; i< getElementsDropdownList().size(); i++) {
            if (getElementsDropdownList().get(i).getText().equalsIgnoreCase(elementButtonName)) {
                scrollToElement(getElementsDropdownList().get(i));
                getElementsDropdownList().get(i).click();
            }
        }

    }
}
