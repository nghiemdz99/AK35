package testsuites.amazon;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.amazon.SignUpPages;
import support.JavaUntills;
import support.SeleniumOwnerMethods;

public class SignUpTest extends BaseTest {

    static private WebDriver driver;
    SignUpPages signUpPages;

    @BeforeMethod
    void setUp() {
        this.driver = SeleniumOwnerMethods.openBrowser("chrome");

    }

    @Test
    void TcSignUp() {
        signUpPages = new SignUpPages(driver);
        signUpPages.navigateTo();
        signUpPages.fillRegistrationForm(JavaUntills.gerenateCustomerName(),JavaUntills.gerenateEmail(),JavaUntills.gerenatePassword());
        Assert.assertTrue(signUpPages.isPuzzleChallengeDisplayed());
    }



}
