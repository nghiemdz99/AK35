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

public class Dropdown {
    WebDriver driver;
    String URL = "https://the-internet.herokuapp.com/dropdown";

    @BeforeMethod
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(URL);
    }
    @Test
    void selectOption1(){
        Select select = new Select(driver.findElement(By.id("dropdown")));
        //select.selectByVisibleText("Option 1");
        WebElement option1 = driver.findElement(By.xpath("//option[.='Option 1']"));
        WebElement option2 = driver.findElement(By.xpath("//option[.='Option 2']"));
        option2.click();
        Assert.assertTrue(option2.isSelected());


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

