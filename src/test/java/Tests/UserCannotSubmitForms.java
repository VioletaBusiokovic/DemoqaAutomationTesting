package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserCannotSubmitForms extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        homePage.selectButton("Elements");
        elementsPage.selectButtonFromElements("Text Box");
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    @Test
    public void UserCannotSubmitFormWithoutAtLeastOneField() {
        scrollToElement(textBoxPage.getSubmitButton());
        textBoxPage.clickOnSubmitButton();
        try {
            WebElement output = driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
            Assert.assertTrue(output.isDisplayed());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
