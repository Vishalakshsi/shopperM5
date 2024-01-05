package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addressPage {

	public WebDriver driver;
	public addressPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='/addressform']")
	private WebElement addAddressForm;
	
	@FindBy(xpath="//strong[text()='LOveBirds']/../../..//input")
	private WebElement lovwebirdAddress;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement procedButton;
	
	public WebElement getprocedButton() {
		return procedButton;
	}
	
	public WebElement getlovwebirdAddress() {
		return lovwebirdAddress;
	}
	
	public WebElement getaddAddressForm() {
		return addAddressForm;
	}
	
	


}
