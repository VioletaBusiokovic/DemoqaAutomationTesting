package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class RedirectionLink extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        homePage.selectButton("Elements");
        elementsPage.selectButtonFromElements("Links");
    }
    @Test
    public void userIsRedirectedToHomePageInNewTab() {
        linksPage.clickOnLink();
        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(listaTabova.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }
}
