package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage {
    WebDriver driver;
    WebElement alertButton;
    WebElement timerAlertButton;
    WebElement promptBoxButton;
    WebElement promptResult;

    public AlertsPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getAlertButton() {

        return driver.findElement(By.id("alertButton"));
    }

    public void clickOnAlertButton() {

        getAlertButton().click();
    }

    public WebElement getTimerAlertButton() {

        return driver.findElement(By.id("timerAlertButton"));
    }
    public void clickOnTimerAlertButton() {

        getTimerAlertButton().click();
    }

    public WebElement getPromptBoxButton() {

        return driver.findElement(By.id("promtButton"));
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void clickOnPromptBoxButton() {
        scrollToElement(getPromptBoxButton());
        getPromptBoxButton().click();
    }

    public WebElement getPromptResult() {

        return driver.findElement(By.id("promptResult"));
    }
}
