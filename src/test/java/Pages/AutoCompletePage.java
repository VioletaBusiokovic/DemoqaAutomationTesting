package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoCompletePage {
    WebDriver driver;
    WebElement autocompleteSingleColorField;
    WebElement input;



    public AutoCompletePage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getAutocompleteSingleColorField() {

        return driver.findElement(By.id("autoCompleteSingleInput"));
    }
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void fillInAutocompleteSingleColorField (String firstLetter) {
        scrollToElement(getAutocompleteSingleColorField());
        getAutocompleteSingleColorField().click();
        getAutocompleteSingleColorField().sendKeys(firstLetter);
    }


    public WebElement getInput() {
        return driver.findElement(By.cssSelector(".auto-complete__single-value.css-1uccc91-singleValue"));
    }
}
