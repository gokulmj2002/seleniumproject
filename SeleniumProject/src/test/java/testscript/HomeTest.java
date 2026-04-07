package testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.TestNGBase;
import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends TestNGBase {
	HomePage hp;
@Test (description="user able to select news title")

	public void HomeTest() throws IOException {
	
	String usernamevalue=ExcelUtility.readStringData(0, 0, "Sheet1");
	String passwordvalue=ExcelUtility.readStringData(0, 1, "Sheet1");
		LoginPage lp=new LoginPage(driver);
		
	lp.enterUserNameOnUserNameField(usernamevalue);
	lp.enterPasswordOnPasswordField(passwordvalue);
	hp=lp.clickOnSigninButton();
    hp.manageNewsMoreInfo();
	
	Boolean pagetitledisplayed=hp.viewTitle();
	Assert.assertTrue(pagetitledisplayed,Constant.VALIDATEUSERABLETOSELECTMANAGENEWSTITLE);
	
}
	
}
