package testsuites.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirefoxBorwser {
    @Test
    void navigateToFirefox(){

        // set firefox driver path
        //System.setProperty("webdriver.gecko.driver","drives/geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();

// enable headless mode
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setHeadless(true);

        // launch firefox app
        WebDriver driver = new FirefoxDriver(firefoxOptions);

        //navigate to google.com.vn
        driver.navigate().to("https://google.com.vn"); //navigate to google.com.vn

        // validate the current url match expected
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com.vn/");

        //exit browser
        //driver.quit();

    }

}
