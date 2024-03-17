package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {
    WebDriver driver;
    WebElement homeCheckBox;
    WebElement openDropdownMenuButton;

    public CheckBoxPage(WebDriver driver) {

        this.driver = driver;
    }


    public WebElement getHomeCheckBox() {

        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-check"));
    }

    public WebElement getOpenDropdownMenuButton() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-open"));
    }

    public void clickOnExpandButton () {

        getOpenDropdownMenuButton().click();
    }
    public void clickOnHomeButton () {

        getHomeCheckBox().click();
    }
}
