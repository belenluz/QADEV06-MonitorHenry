package org.fundacionjala.automation.admin.tests.room;

import manage.execution.ManageDriverScript;

import org.fundacionjala.automation.admin.actions.CommonAction;
import org.fundacionjala.automation.admin.actions.RoomAction;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EnabledRoom {
	 private String error = "The Room has been not enabled";
	
	 @Test
	  public void VerifyEnabledRoom() throws Exception {
		System.out.println("Title: Verify that a Conference Room can be disabled");
		ManageDriverScript managerScript = new ManageDriverScript();
		managerScript.manageTest("Room_02");
		Assert.assertTrue(RoomAction.verificationResultRoomDisabled, error);
	  }
	 
	 @AfterMethod
	  public void tearDown(ITestResult result){
		  if(ITestResult.FAILURE == result.getStatus()){
			  utility.ScreenShootUtils.takeScreen(CommonAction.driver, error); 
		  }
	  }
}
