package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TestNGWrappers;

public class LoginPage extends TestNGWrappers{

	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Login Page", "FAIL");
		}		
	}

	public LoginPage enterUserName(String data){
		enterById("username", data);
		return this;
	}
	
	
	public LoginPage enterPassword(String data) {		
		enterByName("PASSWORD", data);	
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	
	public LoginPage verifyMsg(String text){
		verifyTextContainsById("errorDiv", text);
		return this;
	}

}