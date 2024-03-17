package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class InteractionsPage {
    WebDriver driver;
    //List<WebElement> options;



    WebElement option;
    WebElement tabContent;

    public InteractionsPage(WebDriver driver) {

        this.driver = driver;
    }
    public WebElement getOption() {
        return driver.findElement(By.cssSelector(".mt-2.list-group-item.active.list-group-item-action"));
    }
    public WebElement getTabContent() {

        return driver.findElement(By.className("tab-content"));
    }

    public List<WebElement> getOptions() {
        return driver.findElements(By.cssSelector(".mt-2.list-group-item.active.list-group-item-action"));
    }

    public void selectMultipleOptions() {

        Select s = new Select(getTabContent());
        s.selectByVisibleText("Porta ac consectetur ac");
        s.selectByVisibleText("Morbi leo risus");




        }


}



