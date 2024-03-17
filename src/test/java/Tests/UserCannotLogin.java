package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserCannotLogin extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        homePage.selectButton("Elements");
        elementsPage.selectButtonFromElements("Web Tables");
    }
    @Test
    public void userCannotLoginWithoutFillingInAllFields () {
        webtablesPage.clickOnAddButton();
        String firstname = excelReader.getStringData("input", 1, 0);
        String lastname = excelReader.getStringData("input", 1, 1);
        String email = excelReader.getStringData("input", 1, 2);
        Integer age = excelReader.getIntegerData("input", 1, 3);
        Integer salary = excelReader.getIntegerData("input", 1, 4);

        registrationForm.inputFirstname(firstname);
        registrationForm.inputLastname(lastname);
        registrationForm.inputEmail(email);
        registrationForm.inputAge(String.valueOf(age));
        registrationForm.inputSalary(String.valueOf(salary));
        registrationForm.clickOnSubmitButton();

        Assert.assertTrue(registrationForm.getSubmitButton().isDisplayed());
    }
}
