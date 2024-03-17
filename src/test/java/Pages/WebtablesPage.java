package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebtablesPage {
    WebDriver driver;
    WebElement addNowRecordButton;
    List<WebElement> tableRows;

    public WebtablesPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getAddNowRecordButton() {

        return driver.findElement(By.id("addNewRecordButton"));
    }

    public void clickOnAddButton () {

        getAddNowRecordButton().click();
    }

    public List<WebElement> getTableRows() {

        return driver.findElements(By.className("rt-tr-group"));
    }
}
