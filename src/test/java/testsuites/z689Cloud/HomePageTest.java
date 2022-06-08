package testsuites.z689Cloud;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage.HomePage;
import support.SeleniumOwnerMethods;
import java.util.concurrent.TimeUnit;

public class HomePageTest extends BaseTest {
    WebDriver driver;
    HomePage homePage;

    @BeforeTest
    void setUp() {
        driver = SeleniumOwnerMethods.openBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    void TC0GoToHomePage() throws InterruptedException {

        homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.navigatetoHomePage();
//        homePage.Language("JA"); //(Support 3 language: VI,EN,JA) // bug when Reload page per case language default is EN

    }
    @Test
    void TC1_ContactUsNowpopup_HomePage() throws InterruptedException {
        homePage.fullfillContactUsNowForm();
    }

    @Test
    void TC2_GetInTouchForm_HomePage() throws InterruptedException {
        homePage.fullfillGetInTouchForm();

    }

    @Test
    void TC03_GoToSecureDrivePage() throws InterruptedException {
        homePage.navigateToSecureDrivePage();
    }

    @Test
    void TC04_TrialRequestForm() throws InterruptedException {
        homePage.fullfillTrialRequest();
    }

    @Test
    void TC05_ContactUsForQuotationForm() throws InterruptedException {
        homePage.fullfillEnterprisePlan();
    }

    @Test
    void TC06_GoToSecureMailPage() throws InterruptedException {
        homePage.navigateToSecureMailPage();
    }

    @Test
    void TC07_GoToSupport_SecureDrivePage() throws InterruptedException {
        homePage.navigateToSupportCenterSecureDrivePage();
    }

    @Test
    void TC08_GoToSupport_SecureMailPage() throws InterruptedException {
        homePage.navigateToSupportCenterSecureMailPage();
    }

    @Test
    void TC09_GoToFAQ_SecureDrivePage() throws InterruptedException {
        homePage.navigateToFAQSecureDrivePage();
    }

    @Test
    void TC10_GoToFAQ_SecureMailPage() throws InterruptedException {
        homePage.navigateToFAQSecureMailPage();
    }

    @Test
    void TC11_OtherQuestionsForm() throws InterruptedException {
        homePage.fullfillOtherQuestion();
    }

    @Test
    void TC12_GoToDownloadPage() throws InterruptedException {
        homePage.navigateToFAQSecureMailPage();
    }

    @Test
    void TC13_GoToNewPage() throws InterruptedException {
        homePage.navigateToNEWPage();
    }

    @Test
    void TC14_GoToBLOGSPage() throws InterruptedException {
        homePage.navigateToBLOGSPage();
    }

    @Test
    void TC15_GoToCompanyInformation() throws InterruptedException {
        homePage.navigateToCompanyInformationPage();
    }

    @Test
    void TC16_GoToPrivacyPolicy() throws InterruptedException {
        homePage.navigateToPrivacyPolicyPage();
    }

    @Test
    void TC17_GoToTermsAndCondition() throws InterruptedException {
        homePage.navigateToTermsAndConditionsPage();
    }

    @Test
    void TC18_GoToCONTACTUSPage() throws InterruptedException {
        homePage.navigateToContactUsPage();
    }

    @Test
    void TC19_GetInTouchForm_CONTACTUS() throws InterruptedException {
        homePage.fullfillGetInTouchForm_CONTACUS();
    }
}







