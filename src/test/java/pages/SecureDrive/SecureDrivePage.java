package pages.SecureDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import static support.JavaUntillDrive.gerenateCurrentdate;


public class SecureDrivePage {
     WebDriver driver;
    //URL
    String URL = "https://app.689cloud.com/#/login";
    String HomePageLink = "https://app.689cloud.com/#/project";
    String VerifyLoginSuccess = "https://app.689cloud.com/#/project";
    /**
     * Prefix:
     * txt --> text box
     * rad --> radio button
     * chk --> check box
     * btn ---> button
     * lbl  --> label
     * link --> hyperlink
     */

    // fill Login page
    private  By EnterYourEmailtxt = By.id("sing-in-email");
    private  By Nextbtn = By.className("p-button-label");
    private  By EnterYourPasswordtxt = By.id("login-password");
    private  By Loginbtn = By.className("p-button-label");
    // fill Create Project page
    private  By NewProjectbtn = By.xpath("//span[.='New']");
    private  By CreateProjectWithSettingslink = By.xpath("//span[.='Create Project with Settings']");
    private  By ProjectNametxt = By.id("name");
    private  By AutomaticallyapplyDRMchk = By.className("p-checkbox-box");
    private  By SetDocumentExpirydatechk = By.xpath("//label[.=' Set document expiry date ']");
    private  By Printable_CreateProjectchk = By.xpath("//label[.=' Printable ']");
    private  By Editable_CreateProjectchk = By.xpath("//label[.=' Editable ']");
    private  By AddWatermarktoViewOnline_CreateProjectchk = By.xpath("//label[.=' Add watermark to online view ']");
    private  By SetWatermarkContent_CreateProjectrad = By.xpath("//label[.='Set watermark content']");
    private  By SetWaterMarkContent_CreateProjecttxt = By.id("custom");
    private  By Save_CreateProjectbtn = By.xpath("//span[.='SAVE']");
    private  By VerifygoToProjectDetdails = By.xpath("//div[.='Project Details']");
    private  By FirstProjectOnList = By.xpath("//*[@id=\"content-wrapper\"]/div[2]/app-project/app-project-list/p-table/div/div[2]/table/tbody/tr[1]");
    //Upload File from Computer
    private  By UploadFileFromCpmutericon = By.id("fileUpload");
    private  By FindToInput = By.xpath("//input[@type=\"file\"]");
    private  By CloseUploadFilepopup = By.xpath("//button[@tabindex='-1']");
    //Upload Folder
    private  By UploadFoldericon = By.id("file-input");
    private  By ListFiles = By.xpath("//tbody[@class='p-datatable-tbody']");
    private  By Encodingicon = By.xpath("//i[@title='Encoding']");
    //Create Folder
    private  By CreateNewFoldericon = By.xpath("//i[@title='New folder']");
    private  By FolderNametxt = By.id("name");
    private  By Save_CreateFolderbtn = By.xpath("//span[.='SAVE']");
    //Move File to Folder
    private  By MoveOptions = By.xpath("(//span[.='Move to'])[2]");
    private  By ToFolderTestNG = By.xpath("//span[.='Foler testNG']");
    private  By MOVETObtn = By.xpath("//span[.='MOVE TO']");
    // Invite Collaboratorsicon
    private  By InviteCollaboratorsicon = By.xpath("//i[@title='Add collaborators']");
    private  By SelectMemberGroupicon = By.xpath("//button[contains(@title,'Select Member Group')]");
    private  By SelectGroupTest = By.xpath("//*[.='Automation Members Group']");
    private  By AddInviteCollaboratorGroupicon = By.xpath("//button[@type='submit']");
    private  By SaveInviteCollaboratorGroupbtn = By.xpath("//*[.='SAVE']");
    private  By CloseInviteCollaboratorsiconpopup = By.xpath("//button[@tabindex='-1']");
    //View Online File
    private  By FilesList = By.className("p-datatable-tbody");
    private  By Mp4File = By.xpath("//span[@title='Hỏi Thăm Nhau - Lê Bảo Bình.mp4']");
    private  By Demopdf = By.xpath("//span[@title='Demo.pdf']");
    private  By Demodox = By.xpath("//span[@title='Demo.docx']");
    private  By TestDownloadpdf = By.xpath("//span[@title='TestDownload.pdf']");
    private  By TestDownloaddocx = By.xpath("//span[@title='TestDownload.docx']");
        private  By CloseViewOnlineicon = By.xpath("//*[@id=\"content-wrapper\"]/div[2]/app-project/app-project-detail/app-view-online-form/p-sidebar/div/div/app-view-online/p-button/button");
    //Disable DRM/ SetDRM
    private  By MoreActionicon = By.xpath("//i[@title='More options']");
    private  By ViewDRMSettingsoption = By.xpath("(//span[.='View DRM settings'])[2]");
    private  By SecurityDRMoption = By.xpath("(//span[.='Security (DRM)'])[2]");
    private  By DisableDRMbtn = By.xpath("//*[.='DISABLE DRM']");
    private  By EnCodebtn = By.xpath("//*[.='ENCODE']");
    //View Internal Team Tracking Report
    private  By ViewInternalTrackingFile = By.xpath("//*[@id=\"dragZone\"]/p-table/div/div/table/tbody/tr[8]");
    private  By FileTrackingicon = By.xpath("//i[@title='File Tracking']");
    private  By EmailRegisterLicense = By.xpath("//span[@title='user006@689cloud.asia']");
    //Share Project
    private  By ShareProjecticon = By.xpath("//button[@title='Share']");
    private  By SettingsProjecticon = By.xpath("//button[@title='Settings']");
    private  By Allowpublicviewchk = By.name("allowedViewPublic");
    private  By CreateLinkbtn = By.xpath("//*[.='CREATE LINK']");
    private  By Emailtxt = By.xpath("//input[@aria-autocomplete='list']");
    private  By Printable_ShareProjectchk = By.name("printable");
    private  By Editable_ShareProjectchk = By.name("editable");
    private  By AddWatermarktoViewOnline_ShareProjectchk = By.name("showWatermark");
    private  By Donebtn = By.xpath("//*[.='DONE']");
    // Create AddressBook
    private  By AddressBookmenu = By.xpath("(//*[.='Address Books'])[5]");
    private  By ADD_AddressBookbtn = By.xpath("//*[.='ADD']");
    private  By FirstName_AddressBooktxt = By.id("firstNameJa");
    private  By LastName_AddressBooktxt = By.id("lastNameEn");
    private  By Email_AddressBooktxt = By.id("mailAddress");
    private  By ADDNEW_AddressBookbtn = By.xpath("(//button[.='ADD'])[2]");
    //Delete AddressBook
    private  By SelectFirstAddressBook = By.xpath("//span[@title='Nghiem']");
    private  By DELETE_AddressBookbtn = By.xpath("//span[.='DELETE']");
    private  By DELETE_AddressBookbtnpopup = By.xpath("//span[.='Delete']");
    private  By VerifyCreateFolderSuccessful = By.xpath("//span[@title='Foler testNG']");
    private  By VerifyDisableDRM = By.xpath("//i[@title='DRM Settings']");
    private  By VerifyEncodeSuccess = By.xpath("//i[@title='Encoded']");
    private  By VerifyCreateLink = By.xpath("//*[.='SHARE LINK']");
    private  By VerifyCollaborators = By.xpath("//*[.='Project Details']");
    private  By VerifyViewOnlFilePDF = By.xpath("(//div[.='TestDownload.docx'])[5]");
    private  By VerifyViewOnlFileDOCX = By.xpath("(//div[.='TestDownload.pdf'])[5]");
    private  By VerifyViewOnline = By.xpath("//*[@id=\"content-wrapper\"]/div[2]/app-project/app-project-detail/app-view-online-form/p-sidebar/div/div/app-view-online");
    private  By MessageSuccessfully = By.xpath("/html/body/app-root/p-toast/div/p-toastitem/div/div/div/div[2]");
    private  By ErrorMessageEncoding = By.xpath("/html/body/app-root/p-toast/div/p-toastitem/div/div");

    public SecureDrivePage(WebDriver driver) {
        this.driver = driver;
    }
    // Go to Login Page
    public void navigateToLoginPage() {
        driver.navigate().to(URL);
    }
    //Login to system
    public void fillLoginpages() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(EnterYourEmailtxt));
        driver.findElement(EnterYourEmailtxt).sendKeys("user001@689cloud.asia");
        Thread.sleep(2000);
        driver.findElement(Nextbtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(EnterYourPasswordtxt));
        driver.findElement(EnterYourPasswordtxt).sendKeys("01234567");
        driver.findElement(Loginbtn).click();
        Thread.sleep(4000);
        Assert.assertEquals(driver.getCurrentUrl(), VerifyLoginSuccess);
    }
    // Fulfill Create Project
    public void fillCreateProjectpages() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        Thread.sleep(4000);
        driver.findElement(NewProjectbtn).click();
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CreateProjectWithSettingslink));
        driver.findElement(CreateProjectWithSettingslink).click();
        Thread.sleep(500);
        driver.findElement(ProjectNametxt).sendKeys("Monitoring " + gerenateCurrentdate());
        driver.findElement(AutomaticallyapplyDRMchk).click();
        driver.findElement(SetDocumentExpirydatechk).click();
        driver.findElement(Printable_CreateProjectchk).click();
        driver.findElement(Editable_CreateProjectchk).click();
        driver.findElement(AddWatermarktoViewOnline_CreateProjectchk).click();
        driver.findElement(SetWatermarkContent_CreateProjectrad).click();
        driver.findElement(SetWaterMarkContent_CreateProjecttxt).sendKeys("Watermark Automation Test");
        Thread.sleep(1000);
        driver.findElement(Save_CreateProjectbtn).click();
        WebElement VerifyCreateProject = wait.until(ExpectedConditions.visibilityOfElementLocated(MessageSuccessfully));
        Assert.assertTrue(VerifyCreateProject.isDisplayed());
    }
    // Go to Project Details
    public void goToProjectDetails() throws InterruptedException {
        //Go to Project details
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        Actions doubleClick = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(FirstProjectOnList));
        WebElement Project = driver.findElement(FirstProjectOnList);
        doubleClick.doubleClick(Project).perform();
        Thread.sleep(2000);
        WebElement VerifygoToProjectDetailsSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(VerifygoToProjectDetdails));
        Assert.assertTrue(VerifygoToProjectDetailsSuccess.isDisplayed());
    }
    //Upload Files
    public void uploadFiles() throws InterruptedException {
        //Upload File to Project
        WebElement UploadFromComputerIcon = driver.findElement(UploadFileFromCpmutericon);
        UploadFromComputerIcon.findElement(FindToInput).sendKeys("D:\\filetest\\Demo.pdf");
        UploadFromComputerIcon.findElement(FindToInput).sendKeys("D:\\filetest\\TestDownload.pdf");
        UploadFromComputerIcon.findElement(FindToInput).sendKeys("D:\\filetest\\Demo.docx");
        UploadFromComputerIcon.findElement(FindToInput).sendKeys("D:\\filetest\\TestDownload.docx");
        UploadFromComputerIcon.findElement(FindToInput).sendKeys("D:\\filetest\\z.xlsx");
        UploadFromComputerIcon.findElement(FindToInput).sendKeys("D:\\filetest\\excel16.xlsx");
        UploadFromComputerIcon.findElement(FindToInput).sendKeys("D:\\filetest\\test.pptx");
        UploadFromComputerIcon.findElement(FindToInput).sendKeys("D:\\filetest\\MP3.mp3");
        UploadFromComputerIcon.findElement(FindToInput).sendKeys("D:\\filetest\\Hỏi Thăm Nhau - Lê Bảo Bình.mp4");
        Thread.sleep(5000);
    }
    //Upload Folder
    public void uploadFolder() throws InterruptedException {
        //Upload Folder
        driver.findElement(UploadFoldericon).sendKeys("D:\\Test Upload Folder");
        Thread.sleep(5000);
        driver.findElement(CloseUploadFilepopup).click();
        System.out.println("WAITING FOR ENCODE FILES ...");
        WebElement Listfiles = driver.findElement(ListFiles);
        WebElement Encoding = null;
        do {
            try {
                Encoding = Listfiles.findElement(Encodingicon);
            }catch (Exception ex){
                System.out.println("No normal files available for encryption");
                break;
            }
        }while (Encoding !=null);
            System.out.println("ENCOEDING IS COMPLETE");
        WebElement VerifyEncodeisWorking = driver.findElement(VerifyEncodeSuccess);
        Assert.assertTrue(VerifyEncodeisWorking.isDisplayed());
        Thread.sleep(5000);
    }
    public void createFolder() throws InterruptedException {
        //Create Folder
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(CreateNewFoldericon));
        driver.findElement(CreateNewFoldericon).click();
        Thread.sleep(1000);
        driver.findElement(FolderNametxt).sendKeys("Foler testNG");
        Thread.sleep(1000);
        driver.findElement(Save_CreateFolderbtn).click();
        Thread.sleep(4000);
        WebElement VerifyCreateFolderSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyCreateFolderSuccessful));
        Assert.assertTrue(VerifyCreateFolderSuccess.isDisplayed());
    }
    public void inviteCollaborators() throws InterruptedException {
        // Invite Collaborators
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Thread.sleep(10000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(InviteCollaboratorsicon));
        driver.findElement(InviteCollaboratorsicon).click();
        Thread.sleep(1000);
        driver.findElement(SelectMemberGroupicon).click();
        Thread.sleep(2000);
        driver.findElement(SelectGroupTest).click();
        Thread.sleep(2000);
        driver.findElement(AddInviteCollaboratorGroupicon).click();
        Thread.sleep(2000);
        driver.findElement(SaveInviteCollaboratorGroupbtn).click();
        Thread.sleep(5000);
        driver.findElement(CloseInviteCollaboratorsiconpopup).click();
        WebElement VerifyNavigateProjectDetails = driver.findElement(VerifyCollaborators);
        Assert.assertTrue(VerifyNavigateProjectDetails.isDisplayed());
    }
    //Move File from Project to Folder
    public void MoveFileToFolder() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Thread.sleep(10000);
        driver.findElement(Mp4File).click();
        Thread.sleep(2000);
        driver.findElement(MoreActionicon).click();
        Thread.sleep(1000);
        driver.findElement(MoveOptions).click();
        Thread.sleep(3000);
        driver.findElement(ToFolderTestNG).click();
        Thread.sleep(1000);
        driver.findElement(MOVETObtn).click();
        Thread.sleep(3000);
        WebElement VerifyMoveFileToFolderSuccess = driver.findElement(MessageSuccessfully);
        Assert.assertTrue(VerifyMoveFileToFolderSuccess.isDisplayed());
    }
    // View Online File (PDF, Office)
    public void viewOnlineFile() throws InterruptedException {
        Actions doubleClick = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(TestDownloadpdf));
        WebElement ViewOnline01 = driver.findElement(TestDownloadpdf);
        doubleClick.doubleClick(ViewOnline01).perform();
        Thread.sleep(5000);
        WebElement VerifyViewOnlinePDFSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyViewOnline));
        Assert.assertTrue(VerifyViewOnlinePDFSuccess.isDisplayed());
        Thread.sleep(4000);
        driver.findElement(CloseViewOnlineicon).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(TestDownloaddocx));
        WebElement ViewOnline02 = driver.findElement(TestDownloaddocx);
        doubleClick.doubleClick(ViewOnline02).perform();
        Thread.sleep(5000);
        WebElement VerifyViewOnlineDOCXSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyViewOnline));
        Assert.assertTrue(VerifyViewOnlineDOCXSuccess.isDisplayed());
        Thread.sleep(4000);
        driver.findElement(CloseViewOnlineicon).click();
    }
    // Disable DRM (PDF, Office)
    public void DisableDRM() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Demodox));
        driver.findElement(Demodox).click();
        Thread.sleep(2000);
        driver.findElement(MoreActionicon).click();
        Thread.sleep(2000);
        driver.findElement(ViewDRMSettingsoption).click();
        Thread.sleep(1000);
        driver.findElement(DisableDRMbtn).click();
        Thread.sleep(3000);
        WebElement VerifyDisableDRMSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyDisableDRM));
        Assert.assertTrue(VerifyDisableDRMSuccess.isDisplayed());
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(Demopdf));
        driver.findElement(Demopdf).click();
        driver.findElement(MoreActionicon).click();
        Thread.sleep(2000);
        driver.findElement(ViewDRMSettingsoption).click();
        Thread.sleep(1000);
        driver.findElement(DisableDRMbtn).click();
        Thread.sleep(3000);
        WebElement VerifyDisableDRMSuccessPDF = wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyDisableDRM));
        Assert.assertTrue(VerifyDisableDRMSuccessPDF.isDisplayed());
    }
    public void internalTeamTrackingReport() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        Thread.sleep(2000);
        WebElement ViewTrackingReporticon = driver.findElement(ViewInternalTrackingFile);
        ViewTrackingReporticon.findElement(FileTrackingicon).click();
        Thread.sleep(4000);
        WebElement VerifyLicenseInternalTrackingIsWorking = driver.findElement(EmailRegisterLicense);
        Assert.assertTrue(VerifyLicenseInternalTrackingIsWorking.isDisplayed());
    }
    //Create new Address Book
    public void addNewAddressBook() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(AddressBookmenu).click();
        Thread.sleep(3000);
        driver.findElement(ADD_AddressBookbtn).click();
        Thread.sleep(1000);
        driver.findElement(FirstName_AddressBooktxt).sendKeys("Nghiem");
        driver.findElement(LastName_AddressBooktxt).sendKeys("Truong");
        driver.findElement(Email_AddressBooktxt).sendKeys("user055@689cloud.asia");
        driver.findElement(ADDNEW_AddressBookbtn).click();
        Thread.sleep(1000);
        WebElement VerifyCreateAddresBookSuccess = driver.findElement(MessageSuccessfully);
        Assert.assertTrue(VerifyCreateAddresBookSuccess.isDisplayed());
    }
    // Delete AddressBook
    public void deleteAddressBook() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(5000);
        driver.findElement(SelectFirstAddressBook).click();
        Thread.sleep(1000);
        driver.findElement(DELETE_AddressBookbtn).click();
        Thread.sleep(2000);
        driver.findElement(DELETE_AddressBookbtnpopup).click();
        Thread.sleep(1000);
        WebElement VerifyDeleteAddressBookSuccess = driver.findElement(MessageSuccessfully);
        Assert.assertTrue(VerifyDeleteAddressBookSuccess.isDisplayed());
    }
    // Update Project info
    public void updateProject() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.navigate().to(HomePageLink);
        Thread.sleep(5000);
        driver.findElement(FirstProjectOnList).click();
        Thread.sleep(2000);
        driver.findElement(SettingsProjecticon).click();
        Thread.sleep(2000);
        driver.findElement(ProjectNametxt).clear();
        Thread.sleep(1000);
        driver.findElement(ProjectNametxt).sendKeys("Update Project by Automation " + gerenateCurrentdate());
        driver.findElement(AutomaticallyapplyDRMchk).click();//uncheck
//        driver.findElement(Printable_ShareProjectchk).click();//uncheck
//        driver.findElement(Editable_ShareProjectchk).click();//uncheck
        Thread.sleep(2000);
        driver.findElement(Save_CreateProjectbtn).click();
        WebElement VerifyUpdateProjectSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(MessageSuccessfully));
        Assert.assertTrue(VerifyUpdateProjectSuccess.isDisplayed());
    }
    //Share project
    public void shareProjectDRM() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Thread.sleep(5000);
        driver.findElement(FirstProjectOnList).click();
        Thread.sleep(1000);
        driver.findElement(ShareProjecticon).click();
        Thread.sleep(1000);
        driver.findElement(Allowpublicviewchk).click();
        Thread.sleep(1000);
        driver.findElement(CreateLinkbtn).click();
        Thread.sleep(3000);
//          WebElement VerifyCreateLinkSuccessful = driver.findElement(VerifyCreateLink);
//          Assert.assertTrue(VerifyCreateLinkSuccessful.isDisplayed());
        WebElement InputRecipient = driver.findElement(Emailtxt);
        InputRecipient.sendKeys("vannghiem689@gmail.com");
        Thread.sleep(1000);
        InputRecipient.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(Printable_ShareProjectchk).click();
        driver.findElement(Editable_ShareProjectchk).click();
        Thread.sleep(1000);
        driver.findElement(AddWatermarktoViewOnline_ShareProjectchk).click();
        Thread.sleep(1000);
        driver.findElement(Donebtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MessageSuccessfully));
        WebElement VerifyShareProjectSuccess = driver.findElement(MessageSuccessfully);
        Assert.assertTrue(VerifyShareProjectSuccess.isDisplayed());
    }
}
