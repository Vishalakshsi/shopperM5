package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethod {
public WebDriver driver;
	
	public PaymentMethod(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@value='COD']")
	private WebElement cashOndeliveryRadioButton;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement ProceedButton;
	
	@FindBy(xpath="//input[@value='Net Banking']")
	private WebElement NetBankingButton;
	
	public WebElement getNetBankingButton() {
		return NetBankingButton;
	}
	
	public WebElement getcashOndeliveryRadioButton() {
		return cashOndeliveryRadioButton;
	}
	
	public WebElement getProceedButton() {
		return ProceedButton;
	}
	
	


}
