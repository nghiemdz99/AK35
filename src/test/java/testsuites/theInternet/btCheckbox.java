package testsuites.theInternet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class btCheckbox {
    WebDriver driver;
    String URL = "https://the-internet.herokuapp.com/checkboxes";

    @BeforeMethod
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(URL);

    }

    // Check checkbox1
    // verify
    // uncheck checkbox 2
    // verify

    @Test
    void validateCheckbox1IsChecked(){
        WebElement checkbox = driver.findElement(By.id("checkboxes"));
        WebElement checkbox1 = checkbox.findElement(By.xpath("//input[1]"));
        WebElement checkbox2 = checkbox.findElement(By.xpath("//input[2]"));
        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected());
        Assert.assertTrue(checkbox2.isSelected());
    }


    @Test
    void validateCheckbox2IsChecked(){
        WebElement checkbox = driver.findElement(By.id("checkboxes"));
        WebElement checkbox2 = checkbox.findElement(By.xpath("//input[2]"));
        checkbox2.click();
        Assert.assertFalse(checkbox2.isSelected());
    }
}
