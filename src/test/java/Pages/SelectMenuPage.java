package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

public class SelectMenuPage {
    public AssertJUnit Assert;
    WebDriver driver;

    WebElement standardMultiSelect;
    WebElement selectedOption;

    public WebElement getSelectedOption() {

        return selectedOption;
    }


    public SelectMenuPage(WebDriver driver) {
        this.driver = driver;
    }


    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
     }


    public WebElement getStandardMultiSelect() {
        return driver.findElement(By.id("cars"));
     }



    public void selectFromMultiSelect (String option) {
        Select selectCar = new Select(getStandardMultiSelect());
        selectCar.selectByVisibleText(option);
        selectedOption = selectCar.getFirstSelectedOption();

    }



}

