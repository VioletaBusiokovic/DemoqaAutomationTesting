package Tests;

import Base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTest {
    @BeforeMethod
    public void pageSetUp () {
        homePage.selectButton("Interactions");
        elementsPage.selectButtonFromElements("Droppable");
    }
    @Test
    public void userCanDragElementAndDropItToOtherElement () {
        droppablePage.dragAndDropElement();
        wait.until(ExpectedConditions.attributeContains(droppablePage.getDropElement(),"class", "drop-box ui-droppable ui-state-highlight"));
    }
}
