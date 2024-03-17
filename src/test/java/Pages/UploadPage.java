package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {
    WebDriver driver;
    WebElement chooseButton;
WebElement uploadedImagePath;
WebElement downloadButton;
    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getChooseButton() {

        return driver.findElement(By.id("uploadFile"));
    }
    public WebElement getUploadedImagePath() {

        return driver.findElement(By.id("uploadedFilePath"));
    }


    public void chooseFile () {
        String imageLocation = "C:\\Users\\user\\Desktop\\IT Bootcamp\\new_ui-2x-12.png";
        getChooseButton().sendKeys(imageLocation);

    }




}
