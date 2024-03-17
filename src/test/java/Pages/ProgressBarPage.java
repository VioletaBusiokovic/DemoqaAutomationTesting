package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProgressBarPage {


    WebDriver driver;
    WebElement progressBar;
    WebElement startAndStopButton;
    WebElement resetButton;


    public ProgressBarPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getProgressBar() {

        return driver.findElement(By.cssSelector(".progress-bar.bg-info"));
    }

    public WebElement getStartAndStopButton() {

        return driver.findElement(By.id("startStopButton"));
    }
    public WebElement getResetButton() {

        return driver.findElement(By.id("resetButton"));
    }

    public void clickOnStartAndStopButton () {

        getStartAndStopButton().click();
    }
}
