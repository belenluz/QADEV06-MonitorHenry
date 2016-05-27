package org.fundacionjala.automation.tablet.tests.schedule;

import manage.execution.ManageDriverScript;

import org.fundacionjala.automation.tablet.actions.CommonTabletAction;
import org.fundacionjala.automation.tablet.actions.ScheduleTabletAction;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RemoveMeeting {
	 private String error = "The meeting have been not removed";
	
	 @Test
	  public void VerifyRemoveMeeting() throws Exception {
		System.out.println("Title: Verify that a Meeting can be removed");
		ManageDriverScript managerScript = new ManageDriverScript();
		managerScript.manageTest("Schedule_01");
		Assert.assertTrue(ScheduleTabletAction.verificationMeetingRemoved, error);
	  }
	  
	  @AfterMethod
	  public void tearDown(ITestResult result){
		  if(ITestResult.FAILURE == result.getStatus()){
			  utility.ScreenShootUtils.takeScreen(CommonTabletAction.driver, error); 
		  }
	  }
}
