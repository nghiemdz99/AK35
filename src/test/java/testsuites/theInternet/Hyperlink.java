package testsuites.theInternet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hyperlink {
    WebDriver driver;
    String URL = "https://the-internet.herokuapp.com/status_codes";

    @BeforeMethod
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(URL);
    }
    @Test
    void clickStatuscde200(){
        driver.findElement(By.linkText("200")).click();
//

    }

}
