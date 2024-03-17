package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProgressBar extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        homePage.selectButton("Widgets");
        elementsPage.selectButtonFromElements("Progress Bar");
    }

    @Test
    public void userCanInitiateProgressBar() {
        WebElement progress = driver.findElement(By.cssSelector("div[aria-valuenow = '0']"));
        wait.until(ExpectedConditions.attributeToBe(By.cssSelector("div[aria-valuenow = '0']"), "aria-valuenow", "0"));
        progressBarPage.clickOnStartAndStopButton();
        wait.until(ExpectedConditions.attributeToBe(By.cssSelector("div[aria-valuenow = '100']"), "aria-valuenow", "100"));
        Assert.assertTrue(progressBarPage.getResetButton().isDisplayed());




    }
}