package testsuites.theInternet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FromAuthencation {
    WebDriver driver;
    String URL = "https://the-internet.herokuapp.com";

    @BeforeMethod
    void setUp(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.navigate().to(URL + "/login");

    }

    /**Login successful with valid credentials
    * Steps:
    * Open browser - Chrome
    * Navigate to https://the-internet.herokuapp.com/login
    * Fill in username with tomsmith
    * Fill in the password with SuperSecretPassword!
    * Click on Login button
    * And the home page is appear
     */
    @Test
    void LoginsuccessfullyWithvalid(){

        submitCredentials("tomsmith","SuperSecretPassword!");
        Assert.assertEquals(driver.getCurrentUrl(),URL + "/secure");
        WebElement successMessageLbl1 = driver.findElement(By.className("success"));
        Assert.assertTrue(successMessageLbl1.isDisplayed());



    }
    @Test
    void LoginWithInvalid(){
        submitCredentials("tomsmith","SuperSecretPassword");
        WebElement errorMessageLbl = driver.findElement(By.className("error"));
        Assert.assertTrue(errorMessageLbl.isDisplayed());    }

    void submitCredentials(String username,String password){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @AfterMethod
    void tearDown(){

        driver.quit();
    }

}
