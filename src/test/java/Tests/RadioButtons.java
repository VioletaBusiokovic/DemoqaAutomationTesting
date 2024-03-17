package Tests;

import Base.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RadioButtons extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        homePage.selectButton("Elements");
        elementsPage.selectButtonFromElements("Radio Button");
}
    @Test(priority=10)
    public void userCanSelectJustOneButton () {
        radioButtonPage.clickOnButtonYes();
        Assert.assertTrue(radioButtonPage.getRadioButtonYes().isSelected());
        Assert.assertFalse(radioButtonPage.getRadioButtonNo().isSelected());
        Assert.assertFalse(radioButtonPage.getRadioButtonImpressive().isSelected());
        new Actions(driver).click(radioButtonPage.getRadioButtonImpressive()).perform();
        Assert.assertTrue(radioButtonPage.getRadioButtonImpressive().isSelected());
        Assert.assertFalse(radioButtonPage.getRadioButtonNo().isSelected());
        Assert.assertFalse(radioButtonPage.getRadioButtonYes().isSelected());

    }



}
