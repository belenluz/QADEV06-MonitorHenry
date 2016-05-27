package org.fundacionjala.automation.admin.tests.login;

import manage.execution.ManageDriverScript;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.fundacionjala.automation.admin.actions.CommonAction;

public class SignIn {
	
  @Test
  public void VerifyLoginRoomManager() throws Exception {
	ManageDriverScript managerScript = new ManageDriverScript();
	managerScript.manageTest("Login_01");
  }
  
  @AfterMethod
  public void tearDown(ITestResult result){
	  if(ITestResult.FAILURE == result.getStatus()){
		  utility.ScreenShootUtils.takeScreen(CommonAction.driver, "edit-code-error"); 
	  }
  }
}
