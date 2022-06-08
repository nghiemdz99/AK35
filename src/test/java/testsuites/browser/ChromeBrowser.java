package testsuites.browser;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeBrowser {
        @Test
        void navigateToGoogle(){
            // set Chrome driver path
            //System.setProperty("webdriver.chrome.driver","drives/chromedriver.exe");
            WebDriverManager.chromedriver().setup();

// enable headless mode
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setHeadless(true);

            // launch chrome app
            WebDriver driver = new ChromeDriver(chromeOptions);

            //navigate to google.com.vn
            driver.navigate().to("https://google.com.vn"); //navigate to google.com.vn

            // validate the current url match expected
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com.vn/");

            //exit browser
            //driver.quit();
        }

    }

