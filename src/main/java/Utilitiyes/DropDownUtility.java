package Utilitiyes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility {
	public void selectDropDownByVisibleText(String textOfOption,WebElement selectTagOfDropDown) {
		Select select=new Select(selectTagOfDropDown);
		select.selectByVisibleText(textOfOption);
	}
	
	public void selectDropDownByValueattributeValue(String ValueattributeValue,WebElement selectTagOfDropDown) {
		Select select=new Select(selectTagOfDropDown);
		select.selectByValue(ValueattributeValue);
	}
	
	public void selectDropDownBIndex(int index,WebElement selectTagOfDropDown) {
		Select select=new Select(selectTagOfDropDown);
		select.selectByIndex(index);
	}
	
	
	public void deselectDropDownByVisibleText(String textOfOption,WebElement selectTagOfDropDown) {
		Select select=new Select(selectTagOfDropDown);
		select.deselectByVisibleText(textOfOption);
	}
	
public void deselectDropDownByValueattributeValue(String ValueattributeValue,WebElement selectTagOfDropDown) {
		Select select=new Select(selectTagOfDropDown);
		select.deselectByValue(ValueattributeValue);
	}
	
	public void deselectDropDownBIndex(int index,WebElement selectTagOfDropDown) {
		Select select=new Select(selectTagOfDropDown);
		select.deselectByIndex(index);
	}
	
	public ArrayList<String> ToGetAllOptionsText(WebElement selectTagOfDropDown) {
		Select select=new Select(selectTagOfDropDown);
		List<WebElement> allOPtions = select.getOptions();		
		ArrayList<String> allOPtionsTexts = new ArrayList<String>();
		for(WebElement ele:allOPtions) {
			allOPtionsTexts.add(ele.getText());
		}
		return allOPtionsTexts;
	}
	
	public WebElement ToGetPerticularOptiononIndex(WebElement selectTagOfDropDown,int indexOfOption) {
		Select select=new Select(selectTagOfDropDown);
		List<WebElement> allOPtions = select.getOptions();
		WebElement perticularOptionWebElement=allOPtions.get(indexOfOption);
	   return	perticularOptionWebElement;	
	}
	
	


}
