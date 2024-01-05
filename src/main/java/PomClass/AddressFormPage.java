package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage {
public WebDriver driver;
	
	public AddressFormPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(id="Name")
	private WebElement nameTextField;
	
	@FindBy(id="House/Office Info")
	private WebElement houseOfficeInformationTextField;
	
	@FindBy(id="Street Info")
	private WebElement streetInformationTextField;
	
	@FindBy(id="Landmark")
	private WebElement LandmarkTextField;
	
	@FindBy(id="Country")
	private WebElement CountryDropDown;
	
	@FindBy(id="State")
	private WebElement StateDropDown;
	
	@FindBy(id="City")
	private WebElement CityDropDown;
	
	@FindBy(id="Pincode")
	private WebElement PincodeTextField;
	
	@FindBy(id="Phone Number")
	private WebElement PhoneNumberTextField;
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressButton;

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseOfficeInformationTextField() {
		return houseOfficeInformationTextField;
	}

	public WebElement getStreetInformationTextField() {
		return streetInformationTextField;
	}

	public WebElement getLandmarkTextField() {
		return LandmarkTextField;
	}

	public WebElement getCountryDropDown() {
		return CountryDropDown;
	}

	public WebElement getStateDropDown() {
		return StateDropDown;
	}

	public WebElement getCityDropDown() {
		return CityDropDown;
	}

	public WebElement getPincodeTextField() {
		return PincodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return PhoneNumberTextField;
	}

	public WebElement getAddAddressButton() {
		return addAddressButton;
	}
	


}
