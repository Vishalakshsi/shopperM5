package Utilitiyes;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtility extends BaseClass implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		String failedMethod=result.getMethod().getMethodName().toString();
		
		TakesScreenshot ts	=(TakesScreenshot)driver;
		File tempFile=ts.getScreenshotAs(OutputType.FILE);
		String currentTime = LocalDateTime.now().toString().replace(':','-');
		
File permanentFile =
new File("./src/test/resources/screenshots/"+currentTime+failedMethod+".png");
		
		try {
			FileHandler.copy(tempFile,permanentFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
}
