package Tests;

import Base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserCanSubmitForms extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        homePage.selectButton("Elements");
        elementsPage.selectButtonFromElements("Text Box");
    }


    @Test
    public void userCanSubmitFormsFillingInAllFields () {
        wait.until(ExpectedConditions.elementToBeClickable(textBoxPage.getUsernameField()));
        textBoxPage.inputValidUsername("Tom Smith");
        textBoxPage.inputValidEmail("toms@gmail.com");
        textBoxPage.inputCurrentAddress("Livingstone Street 9");
        textBoxPage.inputPermanentAddress("Redwood 47");
        wait.until(ExpectedConditions.elementToBeClickable(textBoxPage.getSubmitButton()));
        textBoxPage.clickOnSubmitButton();

        wait.until(ExpectedConditions.visibilityOf(textBoxPageAfterSubmitting.getNameOutput()));
        Assert.assertTrue(textBoxPageAfterSubmitting.getNameOutput().isDisplayed());
        Assert.assertEquals(textBoxPageAfterSubmitting.getNameOutput().getText(), "Name:" + "Tom Smith");
        Assert.assertEquals(textBoxPageAfterSubmitting.getEmailOutput().getText(), "Email:" + "toms@gmail.com");
        //wait.until(ExpectedConditions.visibilityOf(textBoxPageAfterSubmitting.getCurrentAddressOutput()));
        //Assert.assertEquals(textBoxPageAfterSubmitting.getCurrentAddressOutput().getText(),"Current Address :Livingstone Street 9");
        //wait.until(ExpectedConditions.visibilityOf(textBoxPageAfterSubmitting.getPermanentAddressOutput()));
       // Assert.assertEquals(textBoxPageAfterSubmitting.getPermanentAddressOutput().getText(), "Permananet Address :" + "Redwood 47");

        Assert.assertTrue(textBoxPageAfterSubmitting.getOutput().isDisplayed());
    }

    @Test
    public void UserCanSubmitFormsWithAtLeastOneField() {
        wait.until(ExpectedConditions.elementToBeClickable(textBoxPage.getUsernameField()));
        textBoxPage.inputValidUsername("Tom Smith");
        wait.until(ExpectedConditions.elementToBeClickable(textBoxPage.getSubmitButton()));
        textBoxPage.clickOnSubmitButton();
        Assert.assertTrue(textBoxPageAfterSubmitting.getNameOutput().isDisplayed());
        Assert.assertEquals(textBoxPageAfterSubmitting.getNameOutput().getText(), "Name:" + "Tom Smith");
    }

}
