package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectMenu extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        homePage.selectButton("Widgets");
        elementsPage.selectButtonFromElements("Select Menu");
    }

    @Test
    public void userCanSelectFromMultiSelect () {
        selectMenuPage.selectFromMultiSelect("Audi");
        Assert.assertEquals(selectMenuPage.getSelectedOption().getText(), "Audi");
    }
}
