package pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPages {
    String URL = "https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
    WebDriver driver;

     By customerNameTextfield = By.name("customerName");
     By EmailTextfield = By.name("email");
     By PasswordTextfield = By.name("password");
     By passwordCheckTextfield = By.name("passwordCheck");
     By continueBtn = By.id("continue");
     By puzzleChallengeMessageSuccessful = By.xpath("//*[contains(text(),'Solve this puzzle to protect your account')]");

    public SignUpPages(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo() {
        driver.navigate().to(URL);
    }

    public void fillRegistrationForm(String customerName, String email, String password) {
        driver.findElement(customerNameTextfield).sendKeys(customerName);
        driver.findElement(EmailTextfield).sendKeys(email);
        driver.findElement(PasswordTextfield).sendKeys(password);
        driver.findElement(passwordCheckTextfield).sendKeys(password);
        driver.findElement(continueBtn).click();
    }

    public boolean isPuzzleChallengeDisplayed() {
        return this.driver.findElement(puzzleChallengeMessageSuccessful).isDisplayed();
    }

}
