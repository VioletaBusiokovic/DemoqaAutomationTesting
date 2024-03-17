package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationForm {
    WebDriver driver;
    WebElement firstnameField, lastnameField, emailField, ageField, salaryField, departmentField, submitButton;

    public RegistrationForm(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getFirstnameField() {

        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastnameField() {

        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmailField() {

        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAgeField() {

        return driver.findElement(By.id("age"));
    }

    public WebElement getSalaryField() {

        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartmentField() {

        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton() {

        return driver.findElement(By.id("submit"));
    }

    public void inputFirstname (String firstname) {
        getFirstnameField().clear();
        getFirstnameField().sendKeys(firstname);
    }

    public void inputLastname (String lastname) {
        getLastnameField().clear();
        getLastnameField().sendKeys(lastname);
    }

    public void inputEmail (String email) {
        getEmailField().clear();
        getEmailField().sendKeys(email);
    }
    public void inputAge (String age) {
        getAgeField().clear();
        getAgeField().sendKeys(String.valueOf(age));
    }
    public void inputSalary (String salary){
        getSalaryField().clear();
        getSalaryField().sendKeys(String.valueOf(salary));
    }

    public void inputDepartment (String department) {
        getDepartmentField().clear();
        getDepartmentField().sendKeys(department);
    }

    public void clickOnSubmitButton () {

        getSubmitButton().click();
    }
}

