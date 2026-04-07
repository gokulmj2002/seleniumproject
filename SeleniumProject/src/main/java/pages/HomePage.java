package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); //to initialise elements initElements is used
	}
	
	

	@FindBy(xpath="//a[@class=\"small-box-footer\" and @href='https://groceryapp.uniqassosiates.com/admin/list-news']") WebElement managenewsmoreinfo;
	@FindBy(xpath="//h1[@class='m-0 text-dark']") WebElement newstitle;
	
	public NewsPage manageNewsMoreInfo() {
		managenewsmoreinfo.click();
		return new NewsPage(driver);
	
	}
	public Boolean viewTitle() {
		return newstitle.isDisplayed();
	
	}
	

}