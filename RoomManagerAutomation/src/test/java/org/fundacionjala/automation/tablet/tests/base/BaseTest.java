package org.fundacionjala.automation.tablet.tests.base;

import org.fundacionjala.automation.tablet.actions.CommonTabletAction;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
	@BeforeSuite
	@Parameters("browser")
	public void startTest(String browser){
		System.out.println("Test Suit: TABLET");
		CommonTabletAction.openBrowser(browser);
	}
	
	@AfterSuite
	public void endTest(){
		CommonTabletAction.closeBrowser();
	}

}
