package org.fundacionjala.automation.admin.tests.room;

import manage.execution.ManageDriverScript;

import org.fundacionjala.automation.admin.actions.CommonAction;
import org.fundacionjala.automation.admin.actions.RoomAction;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EditRoomCapacity {
	  private String error = "The Conference Room’s capacity does not have the new capacity assignment";
	
	  @Test
	  public void VerifyEditRoomCapacity() throws Exception {
		System.out.println("Title: Verify that the Conference Room’s capacity can be edited");
		ManageDriverScript managerScript = new ManageDriverScript();
		managerScript.manageTest("Room_01");
		Assert.assertTrue(RoomAction.verificationEditRoomCapacity, error);
	  }
	  
	  @AfterMethod
	  public void tearDown(ITestResult result){
		  if(ITestResult.FAILURE == result.getStatus()){
			  utility.ScreenShootUtils.takeScreen(CommonAction.driver, error); 
		  }
	  }
}
