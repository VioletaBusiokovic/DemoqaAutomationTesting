package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    WebDriver driver;
    List<WebElement> homepageButtons;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public List<WebElement> getHomepageButtons() {

        return driver.findElements(By.cssSelector(".card.mt-4.top-card"));
    }
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void selectButton (String buttonName) {
        for (int i = 0; i< getHomepageButtons().size(); i++)
            if (getHomepageButtons().get(i).getText().equalsIgnoreCase(buttonName)) {
                scrollToElement(getHomepageButtons().get(i));
                getHomepageButtons().get(i).click();
            }
    }
}
