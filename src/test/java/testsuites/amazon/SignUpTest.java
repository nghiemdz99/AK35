package testsuites.amazon;

import Base.BaseTest;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.amazon.SignUpPages;
import support.JavaUntills;
import support.SeleniumOwnerMethods;

import java.util.Locale;

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
