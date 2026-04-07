package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); //to initialise elements initElements is used
		
	}
	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;
	@FindBy(xpath="//span[@class='brand-text font-weight-light']")WebElement title;
	public LoginPage enterUserNameOnUserNameField(String usernamevalue) {
		username.sendKeys(usernamevalue);
		return new LoginPage(driver);
		
	}
	public LoginPage enterPasswordOnPasswordField(String passwordvalue) {
		password.sendKeys(passwordvalue);
		return new LoginPage(driver);
	}
	public HomePage clickOnSigninButton() {
		signin.click();
		return new HomePage(driver);
		
	}
	public String titleGet() {
		
		return title.getText();
	}
	


}
