package testscript;


	import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
	import org.testng.annotations.Test;

import automationcore.TestNGBase;
import constants.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;


	public class LoginTest extends TestNGBase {

      @Test(description="user trying to login with valid credentials")
	    public void validLoginTest () throws IOException {
	        
	    	String usernamevalue=ExcelUtility.readStringData(0, 0, "Sheet1");
			String passwordvalue=ExcelUtility.readStringData(0, 1, "Sheet1");
			
	        LoginPage lp =new LoginPage(driver);
			lp.enterUserNameOnUserNameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue).clickOnSigninButton();

			String expected="7rmart supermarket";
			String actual=lp.titleGet();
			Assert.assertEquals(actual, expected, Constant.VALIDATEWITHVALIDCREDENTIALS);
	        
	    }
    
	 @Test(description="user trying to login with invalid credentials" )
	    public void invalidLoginTest() throws IOException {
	    	String usernamevalue=ExcelUtility.readStringData(1, 0, "Sheet1");
			String passwordvalue=ExcelUtility.readStringData(1, 1, "Sheet1");
	        
	        LoginPage lp =new LoginPage(driver);
	        lp.enterUserNameOnUserNameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue).clickOnSigninButton();
	        String expected="7rmart supermarket";
			String actual=lp.titleGet();
			Assert.assertEquals(actual, expected, Constant.VALIDATEWITHINVALIDCREDENTIALS);
	        
	    }
	}
