package testsuites.theInternet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class Content {
    WebDriver driver;
    String URL = "https://the-internet.herokuapp.com/dropdown";

    @BeforeMethod
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(URL);
    }







    @AfterMethod
        // run after all test method
    void tearDown(ITestResult result) throws IOException {
        /**
         * Capture screenshot when test failed only
         */
        if(!result.isSuccess()) {
            String testName = result.getMethod().getMethodName();
            testName = testName +"-"+System.currentTimeMillis();
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(String.format("./target/screen-shots/%s.png",testName)));
        }

        //driver.quit();
    }
}
