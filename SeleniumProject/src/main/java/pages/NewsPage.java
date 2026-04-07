package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsPage {
public WebDriver driver;
public NewsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements( driver,this);
}
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement news;
@FindBy(xpath="//textarea[@id='news']")WebElement newstitle;
@FindBy(xpath="//button[@class='btn btn-danger']") WebElement save;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
public void newsAdding() {
	news.click();
}
public NewsPage newstitle(String newstitlevalue) {
	newstitle.sendKeys(newstitlevalue);
	return this;
}
public NewsPage savebutton() {
	save.click();
	return this;
}

public Boolean alertDisplayed() {
	
	return alert.isDisplayed();
}

}

