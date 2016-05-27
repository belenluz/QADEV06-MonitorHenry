package org.fundacionjala.automation.admin.tests.resource;

import manage.execution.ManageDriverScript;

import org.fundacionjala.automation.admin.actions.CommonAction;
import org.fundacionjala.automation.admin.actions.RoomAction;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UnassignedResourceOfRoom {
	  private String error = "The Resource has been not unassigned";
	  
	  @Test
	  public void VerifyUnassignedResourceOfRoom() throws Exception {
		System.out.println("Title: Verify that a Resource can be unassigned of a specific Conference Room");
		ManageDriverScript managerScript = new ManageDriverScript();
		managerScript.manageTest("Resource_01");
		Assert.assertTrue(RoomAction.verificationResourceRoomAssignment, error);
	  }
	  
	  @AfterMethod
	  public void tearDown(ITestResult result){
		  if(ITestResult.FAILURE == result.getStatus()){
			  utility.ScreenShootUtils.takeScreen(CommonAction.driver, error); 
		  }
	  }
}
