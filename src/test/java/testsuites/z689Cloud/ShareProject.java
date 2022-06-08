package testsuites.z689Cloud;

import Base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShareProject {
    protected WebDriver driver;
    protected String URL = "https://www.dropbox.com/login";


    @BeforeMethod
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(URL);
    }
    @Test
    void TCShareProjectDRM() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='login_email']")).sendKeys("nghiemdz99@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("login_password")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.className("signin-text")).click();
    }

}
