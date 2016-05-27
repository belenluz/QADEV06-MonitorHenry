package org.fundacionjala.automation.tablet.tests.login;

import manage.execution.ManageDriverScript;

import org.fundacionjala.automation.tablet.actions.CommonTabletAction;
import org.fundacionjala.automation.tablet.actions.HomeTabletAction;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SignIn {
	 private String error = "Tablet’s home page does not have the name of the Room selected";
	
	 @Test
	  public void VerifySignIn() throws Exception {
		System.out.println("Title: Verify that home page of tablet is created with the corresponding Conference Room’s name selected");
		ManageDriverScript managerScript = new ManageDriverScript();
		managerScript.manageTest("Login_02");
		Assert.assertTrue(HomeTabletAction.verifyRoomName, error); 
	  }
	  
	  @AfterMethod
	  public void tearDown(ITestResult result){
		  if(ITestResult.FAILURE == result.getStatus()){
			  utility.ScreenShootUtils.takeScreen(CommonTabletAction.driver, error); 
		  }
	  }
}
