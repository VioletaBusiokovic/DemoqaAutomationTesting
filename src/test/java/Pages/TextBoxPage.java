package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
    WebDriver driver;
    WebElement usernameField, emailField, curentAddressField, permanentAddressField, submitButton;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameField() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurentAddressField() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddressField() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public void inputValidUsername (String username) {
        getUsernameField().sendKeys(username);
    }
    public void inputValidEmail (String email) {
        getEmailField().sendKeys(email);
    }
    public void inputCurrentAddress (String currentAddress) {
        getCurentAddressField().sendKeys(currentAddress);
    }
    public void inputPermanentAddress (String permanentAddress) {
        getPermanentAddressField().sendKeys(permanentAddress);
    }
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void clickOnSubmitButton () {
        scrollToElement(getSubmitButton());
        getSubmitButton().click();
    }

}
