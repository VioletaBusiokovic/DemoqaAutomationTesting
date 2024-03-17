package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage {
    WebDriver driver;
    WebElement link;

    public LinksPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getLink() {

        return driver.findElement(By.linkText("Home"));
    }

    public void clickOnLink () {
        getLink().click();
    }
}
