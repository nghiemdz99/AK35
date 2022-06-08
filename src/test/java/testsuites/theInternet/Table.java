package testsuites.theInternet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Table {
    WebDriver driver;
    String URL = "https://the-internet.herokuapp.com/dropdown";

    @BeforeMethod
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(URL);
    }
    @Test
    void table1(){
        WebElement table1 = driver.findElement(By.id("table1"));
        List<WebElement> cells = table1.findElements(By.tagName("td"));
        for (WebElement cell : cells){
            System.out.println(cell.getText());
        }


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
