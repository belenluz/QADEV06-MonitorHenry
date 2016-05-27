package org.fundacionjala.automation.admin.execution;

import java.util.ArrayList;
import manage.execution.ManageDriverScript;
import org.fundacionjala.automation.admin.actions.CommonAction;
import org.fundacionjala.automation.admin.actions.LoginAction;
import org.fundacionjala.automation.admin.actions.RoomAction;

public class RoomDriverScript {
private static ManageDriverScript manage = new ManageDriverScript();
	
	public void execute(ArrayList<String> list, String nameTest) throws Exception{
		for (int i=0;i<list.size();i++){
			String value = list.get(i);
			
			switch (value) {
            case "navigate": CommonAction.navigate();
                     		 break;
            case "input_Username": LoginAction.input_Username(CommonAction.driver, manage.manageInputParameter(nameTest, "input_Username"));
		                           break;
			case "input_Password": LoginAction.input_Password(CommonAction.driver, manage.manageInputParameter(nameTest, "input_Password"));
						           break;
			case "click_Login": LoginAction.click_Login(CommonAction.driver);
						        break;
			case "click_ConferenceRooms": CommonAction.click_ConferenceRooms();
			 							  break;
			case "doubleClick_ConferenceRoom": RoomAction.doubleClick_ConferenceRoom(CommonAction.driver, manage.manageInputParameter(nameTest, "doubleClick_ConferenceRoom"));
										 	   break;
			case "input_Capacity": String capacity = manage.manageInputParameter(nameTest, "input_Capacity").toString();
								   RoomAction.input_Capacity(CommonAction.driver,capacity);
			 					   break;
			case "click_Disabled": RoomAction.click_Disabled(CommonAction.driver);
			   					   break;
			case "click_Enabled": RoomAction.click_Enabled(CommonAction.driver);
			   					  break;
			case "click_SaveRoom": RoomAction.click_SaveRoom(CommonAction.driver);
								   break;
			case "verify_Capacity": RoomAction.verify_Capacity(CommonAction.driver);
								    break;
			case "verify_RoomDisabled": RoomAction.verify_RoomDisabled(CommonAction.driver);
		    							break;
		 	}
		}
	}
}
