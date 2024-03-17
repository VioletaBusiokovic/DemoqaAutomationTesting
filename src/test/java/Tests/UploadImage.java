package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadImage extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        homePage.selectButton("Elements");
        elementsPage.selectButtonFromElements("Upload and Download");
    }

    @Test
    public void userCanUploadImage() {
        uploadAndDownloadPage.chooseFile();
        Assert.assertEquals(uploadAndDownloadPage.getUploadedImagePath().getText(),
        "C:\\fakepath\\new_ui-2x-12.png");
    }
}


