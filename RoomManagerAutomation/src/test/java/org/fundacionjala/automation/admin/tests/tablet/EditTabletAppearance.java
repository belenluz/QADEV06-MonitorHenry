package org.fundacionjala.automation.admin.tests.tablet;

import manage.execution.ManageDriverScript;

import org.fundacionjala.automation.admin.actions.CommonAction;
import org.fundacionjala.automation.tablet.actions.ScheduleTabletAction;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EditTabletAppearance {
	private String error = "Tablet’s appearance does not change with the corresponding color";
	
	@Test
	  public void VerifyEditTabletAppearance() throws Exception {
		System.out.println("Title: Verify that Tablet’s appearance can be edited when a specific color is used");
		ManageDriverScript managerScript = new ManageDriverScript();
		managerScript.manageTest("Tablet_01");
		Assert.assertTrue(ScheduleTabletAction.verificationColorTheme, error);
	  }
	
	@AfterMethod
	  public void tearDown(ITestResult result){
		  if(ITestResult.FAILURE == result.getStatus()){
			  utility.ScreenShootUtils.takeScreen(CommonAction.driver, error); 
		  }
	  }
}
