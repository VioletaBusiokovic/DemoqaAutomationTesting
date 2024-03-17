package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class RadioButtonPage {
    WebDriver driver;
    WebElement radioButtonYes,radioButtonImpressive, radioButtonNo;


    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;

    }


    public WebElement getRadioButtonYes() {

        return driver.findElement(By.id("yesRadio"));
    }

    public WebElement getRadioButtonImpressive() {

        return driver.findElement(By.id("impressiveRadio"));
    }

    public WebElement getRadioButtonNo() {

        return driver.findElement(By.id("noRadio"));
    }

    public void clickOnButtonYes () {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", getRadioButtonYes());
    }





}
