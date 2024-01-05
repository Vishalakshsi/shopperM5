package Utilitiyes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/** AUthor : vishalakshi
	 *  When we get ElementClickInterceptedException (when element is hidden by other element)
	 * then we will use java script click 
	 * @param driver
	 * @param ele
	 */
		public void javaScriptClick(WebDriver driver,WebElement ele) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			
			jse.executeScript("arguments[0].click();",ele);
		}
		
		
		/**
		 * to avoid ElementClickInterceptedException
		 * @param driver
		 * @param ele
		 * @param data
		 */
		public void javaScriptSendKeys(WebDriver driver,WebElement ele,String data) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].value=arguments[1];",ele,data);
		}
		
		
		/**Author :vishakshi
		 * this method will scroll the webpage till the given element
		 * @param driver
		 * @param ele
		 */
		public void javaScriptScrollTillWebElement(WebDriver driver, WebElement ele) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",ele);
		}
		
		/**Author : vishalakshi
		 * this method will scroll the webpage with given coordinates
		 * @param driver
		 * @param xCordinate
		 * @param yCordinate
		 */
	public void javaScriptScrollByCoordinates(WebDriver driver,int xCordinate,int yCordinate) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("scrollBy("+xCordinate+","+yCordinate+");");
		}

	/**Author : vishalakshi
	 * this method will highlight the WebElemet border with 2px red color
	 * @param driver
	 * @param ele
	 */
	public void javaScriptHighLightWebElement(WebDriver driver , WebElement ele) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border='2px solid red';",ele);
	}


	/**
	 * To perform mouse over operation on webElement
	 * @param driver
	 * @param ele
	 */
	public void mouseOverAction(WebDriver driver, WebElement ele) {
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
	}

	/**
	 * To perform right operation on webElement
	 * @param driver
	 * @param ele
	 */
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions action=new Actions(driver);
		action.contextClick(ele).perform();
	}

	/**
	 * To perform double click operation on webElement
	 * @param driver
	 * @param ele
	 */
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions action=new Actions(driver);
		action.doubleClick(ele).perform();
	}

	/**
	 * To perform drag and drop operation between two elements
	 * @param driver
	 * @param ele
	 */
	public void dragAndDrop(WebDriver driver, WebElement draggingELement, WebElement dropingElement) {
		Actions action=new Actions(driver);
		action.dragAndDrop(draggingELement,dropingElement).perform();
	}

	/**
	 * To perform click and hold operation on webElement
	 * @param driver
	 * @param ele
	 */
	public void clickAndHold(WebDriver driver,WebElement ele) {
		Actions action=new Actions(driver);
		action.clickAndHold(ele).perform();
	}


	/**
	 * To perform scrolling of webpage till the webElement
	 * @param driver
	 * @param ele
	 */
	public void scrollToWebELementByActionsClass(WebDriver driver,WebElement ele) {
		Actions action=new Actions(driver);
		action.scrollToElement(ele).perform();	
	}

	/**
	 * this method will wait until given element reaches to click able state
	 * @param driver
	 * @param locator
	 */
	public void explicitlyWaitForElementToBeClickable(WebDriver driver,By locator,int timeDelay) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * this method will wait until given element is visible 
	 * @param driver
	 * @param locator
	 */
	public void explicitlyWaitForElementToBeVisible(WebDriver driver,WebElement ele,int timeDelay) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	/**
	 * this method will wait until alert is present
	 * @param driver
	 * @param locator
	 */
	public void explicitlyWaitForAlert(WebDriver driver,int timeDelay) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.alertIsPresent());
	}


	/**
	 * this method will wait until particular page or particular(given) url is appears
	 * @param driver
	 * @param locator
	 */
	public void explicitlyWaitForUrl(WebDriver driver,int timeDelay,String Completeurl) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.urlToBe(Completeurl));
	}

	/**
	 * this method will wait until particular page is displayed/appears
	 * @param driver
	 * @param locator
	 */
	public void explicitlyWaitForTitle(WebDriver driver,int timeDelay,String CompleteTitle) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.titleIs(CompleteTitle));
	}


}
