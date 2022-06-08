package testsuites.z689Cloud;
import Base.BaseTest;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SecureDrive.SecureDrivePage;
import support.SeleniumOwnerMethods;
import java.util.concurrent.TimeUnit;


public class SecureDriveTest extends BaseTest {

    WebDriver driver;
    SecureDrivePage secureDrivePage;

    @BeforeTest
    void setUp() {
        driver = SeleniumOwnerMethods.openBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    void goToURL() throws InterruptedException {
        secureDrivePage = new SecureDrivePage(driver);
        secureDrivePage.navigateToLoginPage();
        Thread.sleep(2000);

    }
    @Test
    void TC01_Login() throws InterruptedException {
        secureDrivePage.fillLoginpages();
    }
    @Test
    void TC02_CreateProjectWithAutoApplyDRM() throws InterruptedException {
        secureDrivePage.fillCreateProjectpages();
    }
    @Test
    void TC03_GoToProjectDetails() throws InterruptedException {
        secureDrivePage.goToProjectDetails();
    }
    @Test
    void TC04_UploadFiles() throws InterruptedException {
        secureDrivePage.uploadFiles();
    }
    @Test
    void TC05_UploadFolder() throws InterruptedException {
        secureDrivePage.uploadFolder();
    }
    @Test
    void TC06_CreateFolder() throws InterruptedException {
        secureDrivePage.createFolder();
    }
    @Test
    void TC07_MoveFileToFolder() throws InterruptedException {
        secureDrivePage.MoveFileToFolder();
    }
    @Test
    void TC08_InviteCollaborators() throws InterruptedException {
        secureDrivePage.inviteCollaborators();
    }
    @Test
    void TC09_ViewOnlineFileOnProjectList() throws InterruptedException {
        secureDrivePage.viewOnlineFile();
    }
    @Test
    void TC10_SetDRM_DisableDRM() throws InterruptedException {
        secureDrivePage.DisableDRM();
    }
    @Test
    void TC11ViewInternalTrackingReport() throws InterruptedException {
        secureDrivePage.internalTeamTrackingReport();
    }
    @Test
    void TC12_AddNewAddressBook() throws InterruptedException {
        secureDrivePage.addNewAddressBook();
    }
    @Test
    void TC13_DeleteAddressBook() throws InterruptedException {
        secureDrivePage.deleteAddressBook();
    }
    @Test
    void TC14_UpdateProjectSetting() throws InterruptedException {
        secureDrivePage.updateProject();
    }
    @Test
    void TC15_ShareProject() throws InterruptedException {
        secureDrivePage.shareProjectDRM();
    }
}
