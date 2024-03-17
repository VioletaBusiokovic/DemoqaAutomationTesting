package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DroppablePage {
    WebDriver driver;
    WebElement dragElement;
    WebElement dropElement;

    public DroppablePage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getDragElement() {

        return driver.findElement(By.id("draggable"));
    }

    public WebElement getDropElement() {

        return driver.findElement(By.id("droppable"));
    }
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void dragAndDropElement () {
        Actions builder =  new Actions(driver);
        scrollToElement(getDragElement());
        Action dragAndDrop = builder.clickAndHold(getDragElement()).
        moveToElement(getDropElement()).release(getDropElement()).build();
        dragAndDrop.perform();

}
}
