package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByVisibleText(WebElement element, String visibletext) {
		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
		
	}
	public void selectDragDropWithIndex(WebElement element,int index) {
	    Select object=new Select(element);
	    object.selectByIndex(index); 
	}
	
	public void mouseover(WebElement element,WebDriver driver) {
		Actions a= new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	public void click(WebElement element) {
		element.click();
	}
	public void click(WebElement element,String value) {
		element.sendKeys(value);
	}

}


