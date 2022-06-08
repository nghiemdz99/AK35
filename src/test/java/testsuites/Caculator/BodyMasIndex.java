package testsuites.Caculator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Calculator.BodyMassIndex;

public class BodyMasIndex {
     WebDriver driver;
     BodyMassIndex bmiPage;

    @BeforeMethod
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }


    @Test
    void TC01(){
        //
        bmiPage = new BodyMassIndex(driver);
        bmiPage.navigateTo();
        bmiPage.selectMetricTab();
        bmiPage.fillForm("23","male","167","60");
        Assert.assertTrue(bmiPage.getResult().contains("21.5 kg/m2"));

    }
    public static long caculatorBMI(String height, String weight){
        int weightInt = Integer.parseInt(weight);
        double heightM = Double.valueOf(height)/100;

        double bmi = weightInt/(heightM*heightM);
        return Math.round(bmi);
    }

}
