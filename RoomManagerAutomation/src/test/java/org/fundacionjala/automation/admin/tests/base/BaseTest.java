package org.fundacionjala.automation.admin.tests.base;

import org.fundacionjala.automation.admin.actions.CommonAction;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
	public static String mainBrowser;
	@BeforeSuite
	@Parameters("browser")
	public void startTest(String browser){
		System.out.println("Test Suit: ADMIN");
		CommonAction.openBrowser(browser);
	}
	 
	@AfterSuite
	public void endTest(){
		CommonAction.closeBrowser();
	}

}
