package testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.TestNGBase;
import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.NewsPage;
import utilities.ExcelUtility;

public class NewsTest extends TestNGBase{
	NewsPage np;
	HomePage hp;
	@Test(description="user trying to add newstitle on newspage")
public void validNewsTest() throws IOException {
	
	
	String usernamevalue=ExcelUtility.readStringData(0, 0, "Sheet1");
	String passwordvalue=ExcelUtility.readStringData(0, 1, "Sheet1");
	
	LoginPage lp=new LoginPage(driver);
	
	
	
	lp.enterUserNameOnUserNameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
hp=lp.clickOnSigninButton();
   np=hp.manageNewsMoreInfo();
    
	np.newsAdding();
	String newstitle=ExcelUtility.readStringData(0, 0, "News");
	np.newstitle(newstitle).savebutton();
	Boolean alertdisplayed=np.alertDisplayed();
	Assert.assertTrue(alertdisplayed, Constant.VALIDATEWHETHERNEWSTITLECANBEADDED);
}
}
