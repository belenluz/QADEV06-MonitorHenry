package org.fundacionjala.automation.tablet.tests.search;

import manage.execution.ManageDriverScript;

import org.fundacionjala.automation.tablet.actions.CommonTabletAction;
import org.fundacionjala.automation.tablet.actions.SearchTabletAction;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FindRoomByResourceSearch {
	 private String error = "The search by Resource not displays the meetings that have assignment Rooms with resources";
	
	 @Test
	  public void VerifyFindRoomByResourceSearch() throws Exception {
		System.out.println("Title: Verify that a Meeting can be searched by Resource");
		ManageDriverScript managerScript = new ManageDriverScript();
		managerScript.manageTest("Search_01");
		Assert.assertTrue(SearchTabletAction.verificationSearchResource, error);
	  }
	  
	  @AfterMethod
	  public void tearDown(ITestResult result){
		  if(ITestResult.FAILURE == result.getStatus()){
			  utility.ScreenShootUtils.takeScreen(CommonTabletAction.driver, error); 
		  }
	  }
}
