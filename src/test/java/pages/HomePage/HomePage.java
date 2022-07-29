package pages.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

public class HomePage {
    WebDriver driver;
    String URL = "https://689cloud.com/";
    String URL_SecureDrive = "https://689cloud.com/secure-drive.html";
    String URL_SecureMail = "https://689cloud.com/secure-mail.html";
    String URL_SupportCenter_SecureDrive = "https://689cloud.com/sd-support-center.html";
    String URL_SupportCenter_SecureMail ="https://689cloud.com/sm-support-center.html";
    String URL_SupportCenter_Download = "https://689cloud.com/support-center-download.html";
    String URL_FAQ_SecureDrive = "https://689cloud.com/sd-faq.html";
    String URL_FAQ_SecureMail = "https://689cloud.com/sm-faq.html";
    String URL_NEW = "https://689cloud.com/news-company.html";
    String URL_BLOGS = "https://689cloud.com/blog-company.html";
    String URL_CompanyInformation = "https://689cloud.com/our-team.html";
    String ULR_PrivacyPolicy = "https://689cloud.com/private-policy.html";
    String URL_TemsAndConditions = "https://689cloud.com/terms-and-conditions.html";
    String URL_CONTACTUS = "https://689cloud.com/contact-us.html";
    /**
     * Prefix:
     * txt --> text box
     * rad --> radio button
     * chk --> check box
     * btn ---> button
     * lbl  --> label
     * link --> hyperlink
     */
    // Language
    private  By Language = By.id("lang");
    private  By japanese = By.xpath("//option[@value='ja']");
    private  By vietnamese = By.xpath("//option[@value='vi']");
    //Contact Us Now Form
    private By ContactUsbtn = By.xpath("(//*[.='CONTACT US NOW'])[1]");
    private By Near_ContactUsbtn = By.xpath("//*[.='2 Factor Authentication']");
    private By Email_ContactUstxt = By.id("popup-email");
    private By FirstName_ContactUstxt = By.id("popup-firstName");
    private By LastName_ContactUstxt = By.id("popup-lastName");
    private By CompanyName_ContactUstxt = By.id("popup-company");
    private By PhoneNumber_ContactUstxt = By.id("popup-phone");
    private By Message_ContactUsarea = By.id("popup-message");
    private By Close_Contactbtn = By.xpath("//input[@value='Close']");
    private By MessageSubmitContactUspopupSuccess = By.id("popup-submitFrmSuccess");
    //Get In Touch Form/ Other Question ?
    private By Near_GetInTouchForm = By.xpath("//*[.='Get In Touch']");
    private By Near_OtherQuestionForm = By.xpath("(//div[@class='card-header zol-accordion__card-header'])[5]");
    private By OpenOtherQuestionForm = By.xpath("//*[@id=\"accordionExample\"]/div[6]");
    private By Emailtxt = By.id("email");
    private By FirstNametxt = By.id("firstName");
    private By LastNametxt = By.id("lastName");
    private By Companytxt = By.id("company");
    private By Company_OtherQuestiontxt = By.id("companyName");
    private By Phonetxt = By.id("phone");
    private By Messagearea = By.id("message");
    private By MessageSubmitGetInTouchSuccess = By.xpath("//div[@id='submitFrmSuccess']");
    private By MessageSubmitOtherQuestionSuccess = By.id("submitFrmSuccess");

//    //Trial Request Form
    private By Near_Pakega = By.xpath("//*[.='Pricing']");
    private By TrialRequestbtn = By.xpath("//*[@id=\"pricing\"]/div/div[2]/div/button");
    private By Email_Trialtxt = By.id("popup-email-sd-trial");
    private By FirstName_Trialtxt = By.id("popup-firstName-sd-trial");
    private By LastName_Trialtxt = By.id("popup-lastName-sd-trial");
    private By Company_Trialtxt = By.id("popup-company-sd-trial");
    private By Phone_Trialtxt = By.id("popup-phone-sd-trial");
    private By NumberOfUser_Trialotp = By.id("popup-nu-user-sd-trial");
    private By Message_Trialarea = By.id("popup-message-sd-trial");
    private By Close_Trialbtn = By.xpath("(//input[@value='Close'])[3]");
    private By MessageSubmitTrialRequestSuccesspopup = By.id("popup-submitFrmSuccess-sd-trial");
    //Enterprise Plan Form
    private By EnterprisePlantbtn = By.xpath("//*[@id=\"pricing\"]/div/div[4]/div/button");
    private By Email_EnterprisePlantxt = By.id("popup-email-sd-pro");// bug Enterprise not Trial
    private By FirstName_EnterprisePlantxt = By.id("popup-firstName-sd-pro");
    private By LastName_EnterprisePlantxt = By.id("popup-lastName-sd-pro");
    private By Company_EnterprisePlantxt = By.id("popup-company-sd-pro");
    private By Phone_EnterprisePlantxt = By.id("popup-phone-sd-pro");
    private By NumberOfUser_EnterprisePlantxt = By.id("popup-nu-user-sd-pro");
    private By Message_EnterprisePlanarea = By.id("popup-message-sd-pro");
    private By Close_EnterprisePlanbtn = By.xpath("(//input[@value='Close'])[2]");
    private By MessageSubmitEnterprisePlanpopup = By.id("popup-submitFrmSuccess-sd-pro");
    //Submit Button ALL PAGE
    private By Submit_GetInTouchbtn_CONTACTUS = By.xpath("//input[@value='Submit']");
    private By Submit_OtherQuestionbtn = By.xpath("//input[@value='Submit']");
    private By Submit_ContactUsPopupbtn = By.xpath("(//input[@value='Submit'])[2]");
    private By Submit_GetInTouchbtn = By.xpath("(//input[@value='Submit'])[1]");
    private By Submit_Trialbtn = By.xpath("(//input[@value='Submit'])[3]");
    private By Submit_EnterprisePlanbtn = By.xpath("(//input[@value='Submit'])[2]");
    //Verify Navigate page
    private By HomePage_Success = By.xpath("/html/body/div[2]/div/div/div/h1");
    private By SecureDrivePage_Success = By.xpath("//*[.='Secure Drive']");
    private By SecureMailPage_Success = By.xpath("/html/body/div[3]/div/div[1]/h2");
    private By SupportSecureMailPage_Success = By.xpath("(//*[.='SecureMail'])[1]");
    private By SupportSecureDrivePage_Success = By.xpath("(//*[.='SecureDrive'])[1]");
    private By DownloadPage_Success = By.xpath("(//*[.='Downloads'])[1]");
    private By NewsPage_Success = By.xpath("//*[.='News']");
    private By BlogsPage_Success = By.xpath("//*[.='Blogs']");
    private By FAQPage_Success = By.xpath("//*[.='Frequently Asked Questions']");
    private By CompanyInformation_Success = By.xpath("/html/body/div[2]/div/div/div/h1");
    private By PrivacyPolicy_Success = By.xpath("/html/body/div[2]/div/div/div/h1");
    private By TermsAndCondition_Success = By.xpath("/html/body/div[2]/div/div/div/h1");
    private By ContactUsPage_Success = By.xpath("//*[.='Get In Touch']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigatetoHomePage() throws InterruptedException {
        driver.navigate().to(URL);
        Thread.sleep(5000);
    }
    public void Language(String name){
        if (name.equalsIgnoreCase("EN")){
            System.out.println("Language default is English");
        }else if (name.equalsIgnoreCase("JA")){
            driver.findElement(Language).click();
            driver.findElement(japanese).click();
        }
        else if (name.equalsIgnoreCase("VI")){
            driver.findElement(Language).click();
            driver.findElement(vietnamese).click();
        }else {
            throw new IllegalArgumentException("The Language" + name + "does not support");
        }
    }

    public void fullfillContactUsNowForm() throws InterruptedException {
        WebElement moveToContactUsNowForm = driver.findElement(Near_ContactUsbtn);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", moveToContactUsNowForm);
        Thread.sleep(5000);
        driver.findElement(ContactUsbtn).click();
        Thread.sleep(1000);
        driver.findElement(Email_ContactUstxt).sendKeys("nghiem.truong@689cloud.asia");
        driver.findElement(FirstName_ContactUstxt).sendKeys("Nghiem");
        driver.findElement(LastName_ContactUstxt).sendKeys("Truong");
        driver.findElement(CompanyName_ContactUstxt).sendKeys("689Cloud");
        driver.findElement(PhoneNumber_ContactUstxt).sendKeys("0347994701");
        driver.findElement(Message_ContactUsarea).sendKeys("Monitoring by Automation Test");
        driver.findElement(Submit_ContactUsPopupbtn).click();
        Thread.sleep(3000);
        WebElement VerifyContactUsNowFormSuccess = driver.findElement(MessageSubmitContactUspopupSuccess);
        Assert.assertTrue(VerifyContactUsNowFormSuccess.isDisplayed());
        driver.findElement(Close_Contactbtn).click();
    }
    public void fullfillGetInTouchForm() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement moveToGetInTouchForm = driver.findElement(Near_GetInTouchForm);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", moveToGetInTouchForm);
        Thread.sleep(2000);
        driver.findElement(Emailtxt).sendKeys("nghiem.truong@689cloud.asia");
        driver.findElement(FirstNametxt).sendKeys("Nghiem");
        driver.findElement(LastNametxt).sendKeys("Truong");
        driver.findElement(Companytxt).sendKeys("689Cloud");
        driver.findElement(Phonetxt).sendKeys("0347994701");
        driver.findElement(Messagearea).sendKeys("Monitoring by Automation Test");
        Thread.sleep(3000);
        WebElement moveToNearSubmitbtn = driver.findElement(Near_GetInTouchForm);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", moveToNearSubmitbtn);
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(Submit_GetInTouchbtn));
        Thread.sleep(2000);
        driver.findElement(Submit_GetInTouchbtn).click();
        Thread.sleep(3000);
        WebElement VerifyGetInTouchSuccess = driver.findElement(MessageSubmitGetInTouchSuccess);
        Assert.assertTrue(VerifyGetInTouchSuccess.isDisplayed());
    }
    public void fullfillTrialRequest() throws InterruptedException {
        WebElement moveToNearPakega = driver.findElement(Near_Pakega);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", moveToNearPakega);
        Thread.sleep(3000);
        driver.findElement(TrialRequestbtn).click();
        driver.findElement(Email_Trialtxt).sendKeys("nghiem.truong@689cloud.asia");
        driver.findElement(FirstName_Trialtxt).sendKeys("Nghiem");
        driver.findElement(LastName_Trialtxt).sendKeys("Truong");
        driver.findElement(Company_Trialtxt).sendKeys("689Cloud");
        driver.findElement(Phone_Trialtxt).sendKeys("0347994701");
        driver.findElement(Message_Trialarea).sendKeys("Monitoring by Automation Test");
        driver.findElement(Submit_Trialbtn).click();
        Thread.sleep(3000);
        WebElement VerifySubmitTrialRequestSuccess = driver.findElement(MessageSubmitTrialRequestSuccesspopup);
        Assert.assertTrue(VerifySubmitTrialRequestSuccess.isDisplayed());
        driver.findElement(Close_Trialbtn).click();
    }

    public void fullfillEnterprisePlan() throws InterruptedException {
        WebElement moveToNearPakega = driver.findElement(Near_Pakega);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", moveToNearPakega);
        Thread.sleep(3000);
        driver.findElement(EnterprisePlantbtn).click();
        Thread.sleep(1000);
        driver.findElement(Email_EnterprisePlantxt).sendKeys("nghiem.truong@689cloud.asia");
        driver.findElement(FirstName_EnterprisePlantxt).sendKeys("Nghiem");
        driver.findElement(LastName_EnterprisePlantxt).sendKeys("Truong");
        driver.findElement(Company_EnterprisePlantxt).sendKeys("689Cloud");
        driver.findElement(Phone_EnterprisePlantxt).sendKeys("0347994701");
        driver.findElement(Message_EnterprisePlanarea).sendKeys("Monitoring by Automation Test");
        driver.findElement(Submit_EnterprisePlanbtn).click();
        Thread.sleep(3000);
        WebElement VerifySubmitEnterprisePlanSuccess = driver.findElement(MessageSubmitEnterprisePlanpopup);
        Assert.assertTrue(VerifySubmitEnterprisePlanSuccess.isDisplayed());
        Thread.sleep(2000);
        driver.findElement(Close_EnterprisePlanbtn).click();
    }
    public void fullfillOtherQuestion() throws InterruptedException {
        WebElement moveToNearOtherQuestionFor = driver.findElement(Near_OtherQuestionForm);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", moveToNearOtherQuestionFor);
        Thread.sleep(2000);
        driver.findElement(OpenOtherQuestionForm).click();
        Thread.sleep(1000);
        driver.findElement(Emailtxt).sendKeys("nghiem.truong@689cloud.asia");
        driver.findElement(FirstNametxt).sendKeys("Nghiem");
        driver.findElement(LastNametxt).sendKeys("Truong");
        driver.findElement(Company_OtherQuestiontxt).sendKeys("689Cloud");
        driver.findElement(Phonetxt).sendKeys("0347994701");
        driver.findElement(Messagearea).sendKeys("Monitoring by Automation Test");
        WebElement moveToSubmitbtn_OtherQuestions = driver.findElement(Company_OtherQuestiontxt);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", moveToSubmitbtn_OtherQuestions);
        Thread.sleep(2000);
        driver.findElement(Submit_OtherQuestionbtn).click();
        Thread.sleep(2000);
        WebElement VerifySubmitOtherQuestionSuccess = driver.findElement(MessageSubmitOtherQuestionSuccess);
        Assert.assertTrue(VerifySubmitOtherQuestionSuccess.isDisplayed());
    }
    public void fullfillGetInTouchForm_CONTACUS() throws InterruptedException {
        driver.findElement(Emailtxt).sendKeys("nghiem.truong@689cloud.asia");
        driver.findElement(FirstNametxt).sendKeys("Nghiem");
        driver.findElement(LastNametxt).sendKeys("Truong");
        driver.findElement(Companytxt).sendKeys("689Cloud");
        driver.findElement(Phonetxt).sendKeys("0347994701");
        driver.findElement(Messagearea).sendKeys("Monitoring by Automation Test");
        WebElement moveToSubmitbtn_OtherQuestions = driver.findElement(Companytxt);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", moveToSubmitbtn_OtherQuestions);
        Thread.sleep(2000);
        driver.findElement(Submit_GetInTouchbtn_CONTACTUS).click();
        Thread.sleep(3000);
        WebElement VerifySubmitGetInTouchForm_CONTACUS = driver.findElement(MessageSubmitGetInTouchSuccess);
        Assert.assertTrue(VerifySubmitGetInTouchForm_CONTACUS.isDisplayed());
    }
    public void navigateToSecureDrivePage() throws InterruptedException {
        driver.navigate().to(URL_SecureDrive);
        Thread.sleep(2000);
        WebElement VerifySecureDrivePageIsWoking = driver.findElement(SecureDrivePage_Success);
        Assert.assertTrue(VerifySecureDrivePageIsWoking.isDisplayed());

    }
    public void navigateToSecureMailPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(URL_SecureMail);
        Thread.sleep(2000);
        WebElement VerifySecureMailPageIsWoking = driver.findElement(SecureMailPage_Success);
        Assert.assertTrue(VerifySecureMailPageIsWoking.isDisplayed());
    }
    public void navigateToSupportCenterSecureDrivePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(URL_SupportCenter_SecureDrive);
        Thread.sleep(2000);
        WebElement VerifySupportCenterSecureDrivePageIsWoking = driver.findElement(SupportSecureDrivePage_Success);
        Assert.assertTrue(VerifySupportCenterSecureDrivePageIsWoking.isDisplayed());
    }
    public void navigateToSupportCenterSecureMailPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(URL_SupportCenter_SecureMail);
        Thread.sleep(2000);
        WebElement VerifySupportCenterSecureMailPageIsWoking = driver.findElement(SupportSecureMailPage_Success);
        Assert.assertTrue(VerifySupportCenterSecureMailPageIsWoking.isDisplayed());
    }
    public void navigateToFAQSecureDrivePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(URL_FAQ_SecureDrive);
        Thread.sleep(2000);
        WebElement VerifyFAQSecureDrivePageIsWoking = driver.findElement(FAQPage_Success);
        Assert.assertTrue(VerifyFAQSecureDrivePageIsWoking.isDisplayed());
    }
    public void navigateToFAQSecureMailPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(URL_FAQ_SecureMail);
        Thread.sleep(2000);
        WebElement VerifyFAQSecureMailPageIsWoking = driver.findElement(FAQPage_Success);
        Assert.assertTrue(VerifyFAQSecureMailPageIsWoking.isDisplayed());
    }
    public void navigateToDownloadPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(URL_SupportCenter_Download);
        Thread.sleep(2000);
        WebElement VerifyDowmloadPageIsWoking = driver.findElement(DownloadPage_Success);
        Assert.assertTrue(VerifyDowmloadPageIsWoking.isDisplayed());
    }
    public void navigateToNEWPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(URL_NEW);
        Thread.sleep(2000);
        WebElement VerifyDowmloadPageIsWoking = driver.findElement(NewsPage_Success);
        Assert.assertTrue(VerifyDowmloadPageIsWoking.isDisplayed());
    }
    public void navigateToBLOGSPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(URL_BLOGS);
        Thread.sleep(2000);
        WebElement VerifyBlogsPageIsWoking = driver.findElement(BlogsPage_Success);
        Assert.assertTrue(VerifyBlogsPageIsWoking.isDisplayed());
    }
    public void navigateToCompanyInformationPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(URL_CompanyInformation);
        Thread.sleep(2000);
        WebElement VerifyCompanyInformationPageIsWoking = driver.findElement(CompanyInformation_Success);
        Assert.assertTrue(VerifyCompanyInformationPageIsWoking.isDisplayed());
    }
    public void navigateToPrivacyPolicyPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(ULR_PrivacyPolicy);
        Thread.sleep(2000);
        WebElement VerifyPrivacyPolicyPageIsWoking = driver.findElement(PrivacyPolicy_Success);
        Assert.assertTrue(VerifyPrivacyPolicyPageIsWoking.isDisplayed());

    }
    public void navigateToTermsAndConditionsPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(URL_TemsAndConditions);
        Thread.sleep(2000);
        WebElement VerifyTermsAndConditionsPageIsWoking = driver.findElement(TermsAndCondition_Success);
        Assert.assertTrue(VerifyTermsAndConditionsPageIsWoking.isDisplayed());
    }
    public void navigateToContactUsPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to(URL_CONTACTUS);
        Thread.sleep(2000);
        WebElement VerifyContactUsPagePageIsWoking = driver.findElement(ContactUsPage_Success);
        Assert.assertTrue(VerifyContactUsPagePageIsWoking.isDisplayed());
    }










}
