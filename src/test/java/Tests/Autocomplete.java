package Tests;

import Base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.ENTER;

    public class Autocomplete extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        homePage.selectButton("Widgets");
        elementsPage.selectButtonFromElements("Auto Complete");
    }

    @Test
    public void singleColorNameAppearsAfterTypingTheFirstLetter () throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(autoCompletePage.getAutocompleteSingleColorField()));
        autoCompletePage.fillInAutocompleteSingleColorField("r");
        autoCompletePage.getAutocompleteSingleColorField().sendKeys(ENTER);
        Assert.assertEquals(autoCompletePage.getInput().getText(), "Red");

    }
}
