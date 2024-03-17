package Tests;

import Base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        homePage.selectButton("Alerts, Frame & Windows");
        elementsPage.selectButtonFromElements("Alerts");
    }

    @Test (priority = 10)
    public void userCanAcceptAlert () {
        alertsPage.clickOnAlertButton();
        Assert.assertTrue(driver.switchTo().alert().getText().equalsIgnoreCase("You clicked a button"));
        driver.switchTo().alert().accept();
        try {
           Assert.assertTrue(driver.switchTo().alert().getText().equalsIgnoreCase("You clicked a button"));

        } catch (Exception e) {
           System.out.println(e);
        }
    }

    @Test (priority = 20)
    public void alertShowsUp5secondsAfterClick () {
        alertsPage.clickOnTimerAlertButton();
        double startTime = System.currentTimeMillis();
        wait.until(ExpectedConditions.alertIsPresent());
        double duration = System.currentTimeMillis() - startTime;
        Assert.assertTrue(duration>5);
        driver.switchTo().alert().accept();
        try {
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (Exception e) {
            System.out.println("Alert is accepted");
        }
    }

    @Test (priority = 30)
    public void userCanFillInAlertPromptBox () {
        alertsPage.clickOnPromptBoxButton();
        driver.switchTo().alert().sendKeys("John");
        driver.switchTo().alert().accept();
        String prompt = alertsPage.getPromptResult().getText();
        Assert.assertEquals(prompt, "You entered John");
    }



}
