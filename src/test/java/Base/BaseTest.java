package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    public HomePage homePage;

    public ElementsPage elementsPage;
    public RadioButtonPage radioButtonPage;
    public WebDriverWait wait;

    public WebtablesPage webtablesPage;
    public RegistrationForm registrationForm;
    public ExcelReader excelReader;
    public LinksPage linksPage;
    public AlertsPage alertsPage;
    public AutoCompletePage autoCompletePage;
    public ProgressBarPage progressBarPage;
    public SelectMenuPage selectMenuPage;
    public InteractionsPage interactionsPage;
    public DroppablePage droppablePage;
    public CheckBoxPage checkBoxPage;
    public TextBoxPage textBoxPage;
    public TextBoxPageAfterSubmitting textBoxPageAfterSubmitting;
    public UploadPage uploadAndDownloadPage;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");


        homePage = new HomePage(driver);
        elementsPage = new ElementsPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webtablesPage = new WebtablesPage(driver);
        registrationForm = new RegistrationForm(driver);
        excelReader = new ExcelReader("src\\test\\java\\tests\\TestData.xlsx");
        linksPage = new LinksPage(driver);
        alertsPage = new AlertsPage(driver);
        autoCompletePage = new AutoCompletePage(driver);
        progressBarPage = new ProgressBarPage(driver);
        selectMenuPage = new SelectMenuPage(driver);
        interactionsPage = new InteractionsPage(driver);
        droppablePage = new DroppablePage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        textBoxPage = new TextBoxPage(driver);
        textBoxPageAfterSubmitting = new TextBoxPageAfterSubmitting(driver);
        uploadAndDownloadPage = new UploadPage(driver);


    }

    @AfterMethod
    public void tearDown () {
        driver.manage().deleteAllCookies();
        driver.quit();
    }




}
