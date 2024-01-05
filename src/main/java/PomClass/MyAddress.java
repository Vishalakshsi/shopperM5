package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress {
public WebDriver driver;
	
	public MyAddress(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='/addressform']")
	private WebElement addressformbutton;
		
	public WebElement getaddressformbutton() {
		return addressformbutton;
	}
	
	
	@FindBy(xpath="//div[@class='addressListContainer']//h3")
	private WebElement addedAddrres;
	
	public WebElement getaddedAddrres() {
		return addedAddrres;
	}

}
