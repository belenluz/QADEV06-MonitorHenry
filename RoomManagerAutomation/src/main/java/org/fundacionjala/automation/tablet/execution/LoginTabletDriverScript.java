package org.fundacionjala.automation.tablet.execution;

import java.util.ArrayList;

import manage.execution.ManageDriverScript;

import org.fundacionjala.automation.tablet.actions.CommonTabletAction;
import org.fundacionjala.automation.tablet.actions.HomeTabletAction;
import org.fundacionjala.automation.tablet.actions.LoginTabletAction;

public class LoginTabletDriverScript {
	private static ManageDriverScript manage = new ManageDriverScript();
	public void execute(ArrayList<String> list, String nameTest) throws Exception {
		for (int i=0;i<list.size();i++){
			String value = list.get(i);
			
			switch (value) {
            case "navigate": CommonTabletAction.navigate();
                     		 break;
            case "input_Service": LoginTabletAction.input_Service(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_Service"));
    		 				 	  break; 
            case "input_AdministratorName": LoginTabletAction.input_AdministratorName(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_AdministratorName"));
	  		 				       break;
            case "input_Password": LoginTabletAction.input_Password(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_Password"));
		       					   break;
            case "click_SignIn": LoginTabletAction.click_SignIn(CommonTabletAction.driver);
			   					 break;
			case "click_SelectorRoomButton": LoginTabletAction.click_SelectorRoomButton(CommonTabletAction.driver);
						 			         break; 
			case "click_WorkingRoom": LoginTabletAction.click_WorkingRoom(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "click_WorkingRoom"));
							          break;
			case "click_StartButton": LoginTabletAction.click_StartButton(CommonTabletAction.driver);
							          break; 
			case "verify_RoomName": HomeTabletAction.verify_RoomName(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "verify_RoomName"));
	          						break; 
							          
            }
		}
			
	}

}
