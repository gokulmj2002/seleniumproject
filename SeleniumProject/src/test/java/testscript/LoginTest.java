package testscript;


	import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
	import org.testng.annotations.Test;

import automationcore.TestNGBase;
import pages.LoginPage;
import utilities.ExcelUtility;


	public class LoginTest extends TestNGBase {

      @Test
	    public void validLoginTest () throws IOException {
	        
	    	String usernamevalue=ExcelUtility.readStringData(0, 0, "Sheet1");
			String passwordvalue=ExcelUtility.readStringData(0, 1, "Sheet1");
			
	        LoginPage lp =new LoginPage(driver);
			lp.enterUserNameOnUserNameField(usernamevalue);
	        lp.enterPasswordOnPasswordField(passwordvalue);
	        lp.clickOnSigninButton();

	        
	        
	    }
     @Test
	    public void invalidLoginTest() throws IOException {
	    	String usernamevalue=ExcelUtility.readStringData(1, 0, "Sheet1");
			String passwordvalue=ExcelUtility.readStringData(1, 1, "Sheet1");
	        
	        LoginPage lp =new LoginPage(driver);
	        lp.enterUserNameOnUserNameField(usernamevalue);
	        lp.enterPasswordOnPasswordField(passwordvalue);
	        lp.clickOnSigninButton();
	        
	    }
	}
