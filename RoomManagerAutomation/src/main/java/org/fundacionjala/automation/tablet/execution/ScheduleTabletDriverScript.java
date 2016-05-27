package org.fundacionjala.automation.tablet.execution;

import java.util.ArrayList;

import manage.execution.ManageDriverScript;

import org.fundacionjala.automation.tablet.actions.CommonTabletAction;
import org.fundacionjala.automation.tablet.actions.HomeTabletAction;
import org.fundacionjala.automation.tablet.actions.LoginTabletAction;
import org.fundacionjala.automation.tablet.actions.ScheduleTabletAction;

public class ScheduleTabletDriverScript {
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
			case "click_AvailableElement": HomeTabletAction.click_AvailableElement(CommonTabletAction.driver);
		       							   break;
			case "input_Organizer": ScheduleTabletAction.input_Organizer(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_Organizer"));
			   						break;
			case "input_Subject": ScheduleTabletAction.input_Subject(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_Subject"));
								  break;
			case "input_TimeInitial": ScheduleTabletAction.input_TimeInitial(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_TimeInitial"));
								      break;
			case "input_TimeEnd": ScheduleTabletAction.input_TimeEnd(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_TimeEnd"));
			  					  break;
			case "click_CreateButton": ScheduleTabletAction.click_CreateButton(CommonTabletAction.driver);
								  	   break;
			case "input_UsernameCredential": ScheduleTabletAction.input_UsernameCredential(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_UsernameCredential"));
		  	   						   		 break;
			case "input_PasswordCredential": ScheduleTabletAction.input_PasswordCredential(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_PasswordCredential"));
		   		 						     break;
			case "click_SaveMeeting": ScheduleTabletAction.click_SaveMeeting(CommonTabletAction.driver);
									  break;
			case "click_Meeting": ScheduleTabletAction.click_Meeting(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "click_Meeting"));
			  					  break;
			case "click_RemoveMeeting": ScheduleTabletAction.click_RemoveMeeting(CommonTabletAction.driver);
			  					  		break;
			case "verify_MeetingRemoved": ScheduleTabletAction.verify_MeetingRemoved(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "verify_MeetingRemoved"));
		  							      break;
            }
		}
			
	}
}
