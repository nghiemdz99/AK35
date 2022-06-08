package testsuites.theInternet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baitap {
    WebDriver driver;
    String URL = "https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
    @BeforeMethod
        void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(URL);

        }
        @Test
    void CreateSuccessful(){
            fillAllfields();
            //driver.findElement(By.linkText("help")).click();
        String curentURL = driver.getCurrentUrl();
        String replaceURL = curentURL.replace("?",",");
        String[] newURL = replaceURL.split(",");
        Assert.assertEquals(newURL[0],"https://www.amazon.com/ap/cvf/request");
    }

    private void fillAllfields() {
        driver.findElement(By.name("customerName")).sendKeys("Nghiem Truong");
        driver.findElement(By.name("email")).sendKeys("0347994701");
        driver.findElement(By.className("country-display-text")).click();
        driver.findElement(By.id("auth-country-picker_221")).click();
        driver.findElement(By.id("ap_password")).sendKeys("@Abc123456");
        driver.findElement(By.id("ap_password_check")).sendKeys("@Abc123456");
        driver.findElement(By.id("continue")).click();
    }

    @Test
    void CreareEmptyPassword(){
            driver.findElement(By.name("customerName")).sendKeys("Nghiem Truong");
            driver.findElement(By.name("email")).sendKeys("0347994701");
            driver.findElement(By.className("country-display-text")).click();
            driver.findElement(By.id("auth-country-picker_221")).click();
            driver.findElement(By.id("continue")).click();
            WebElement alertmessage = driver.findElement(By.id("auth-password-missing-alert"));
            Assert.assertTrue(alertmessage.isDisplayed());

        }


}
