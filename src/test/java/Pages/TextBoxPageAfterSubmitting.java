package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPageAfterSubmitting {
    WebDriver driver;
    WebElement output, nameOutput, emailOutput, currentAddressOutput, permanentAddressOutput;

    public TextBoxPageAfterSubmitting(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getOutput() {
        return driver.findElement(By.id("output"));
    }

    public WebElement getNameOutput() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getEmailOutput() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getCurrentAddressOutput() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddressOutput() {
        return driver.findElement(By.id("permanentAddress"));
    }
}

