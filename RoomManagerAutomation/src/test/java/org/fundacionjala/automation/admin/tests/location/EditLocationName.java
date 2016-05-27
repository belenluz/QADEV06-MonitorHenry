package org.fundacionjala.automation.admin.tests.location;

import manage.execution.ManageDriverScript;

import org.fundacionjala.automation.admin.actions.CommonAction;
import org.fundacionjala.automation.admin.actions.LocationAction;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EditLocationName {
	  private String error = "The Location’s name does not have the new name assignment";
	  
	  @Test
	  public void VerifyLocationNameEdited() throws Exception {
		System.out.println("Title: Verify that the Location’s name can be edited");
		ManageDriverScript managerScript = new ManageDriverScript();
		managerScript.manageTest("Location_01");
		Assert.assertTrue(LocationAction.verificationLocationNameEdited, error);
	  }
	  
	  @AfterMethod
	  public void tearDown(ITestResult result){
		  if(ITestResult.FAILURE == result.getStatus()){
			  utility.ScreenShootUtils.takeScreen(CommonAction.driver, error); 
		  }
	  }
}
