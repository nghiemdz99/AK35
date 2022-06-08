package pages.Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BodyMassIndex {
    String URL = "https://www.calculator.net";
    WebDriver driver;
    /**
     * Prefix:
     * txt --> text box
     * rad --> radio button
     * chk --> check box
     * btn ---> button
     * lbl  --> label
     * link --> hyperlink
     */
    private By MetricUnitTab = By.xpath("//a[.='Metric Units']");
    private By ageTxt = By.id("cage");
    private By maleRad = By.xpath("//label[@for='csex1']");
    private By fmaleRad = By.xpath("//label[@for='csex2']");
    private By heightTxt = By.id("cheightmeter");
    private By weightTxt = By.id("ckg");
    private By resultLbl = By.xpath("//input[@value='Calculate']");

    public BodyMassIndex(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo() {
        driver.navigate().to(URL + "/bmi-calculator.html");
    }

    public void selectMetricTab(){
        driver.findElement(MetricUnitTab).click();

    }
    public void fillForm(String age,String genger,String height, String weight){
        driver.findElement(ageTxt).clear();
        driver.findElement(ageTxt).sendKeys(age);
        if (genger.equalsIgnoreCase("male")){
            driver.findElement(maleRad).click();
        }
        else driver.findElement(fmaleRad).click();
        driver.findElement(weightTxt).clear();
        driver.findElement(weightTxt).sendKeys(weight);
        driver.findElement(heightTxt).clear();
        driver.findElement(heightTxt).sendKeys(height);
        driver.findElement(resultLbl).click();

    }
    public String getResult(){
        return driver.findElement(By.className("bigtext")).getText();
    }
}
