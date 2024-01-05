package Utilitiyes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomClass.AccountSettingPage;
import PomClass.HomePage;
import PomClass.LoginPage;
import PomClass.WelComePage;

public class BaseClass {
	public static WebDriver driver;
	public	DataUtility du = new 	DataUtility();
	public WebDriverUtility wu=new WebDriverUtility();
	public DropDownUtility drpU=new DropDownUtility();

	@BeforeClass
	public void lanchingBrowser() throws Throwable {
	System.out.println("---------lanchingBrowser------------");	
	String BROWSER=du.dataFromPropertiesFile("browser");

	if(BROWSER.equals("chrome")) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
	}
	else if(BROWSER.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(BROWSER.equals("edge")) {
		driver=new EdgeDriver();
	}
	else {
		driver=new ChromeDriver();
	}
	String URL=du.dataFromPropertiesFile("url");
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@BeforeMethod
	public void loginToApplication() throws Throwable {
	System.out.println("---------login TO application----------");

	WelComePage WLpage = new WelComePage(driver);
	WLpage.getMainLoginButton().click();

	LoginPage Lpage = new LoginPage(driver);

	String emailId = du.dataFromPropertiesFile("email");
	Lpage.getEmailTextField().sendKeys(emailId);

	String Password=du.dataFromPropertiesFile("password");
	Lpage.getPasswordTextField().sendKeys(Password);

	Lpage.getLoginButton().click();

	}

	@AfterMethod
	public void logoutFromApplication() throws Throwable {
		System.out.println("----------logout from application-------");
		Thread.sleep(6000);
		HomePage Hpage=new HomePage(driver);
		
		Hpage.javaScriptClick(driver);
		Thread.sleep(3000);
		AccountSettingPage as=new AccountSettingPage(driver);
		as.getLogoutIcon().click();
	}

	@AfterClass
	public void quitBrowser() {
	System.out.println("----------quit the browser----------");	
	driver.quit();
	}



}
