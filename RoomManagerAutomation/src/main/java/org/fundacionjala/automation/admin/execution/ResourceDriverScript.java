package org.fundacionjala.automation.admin.execution;

import java.util.ArrayList;

import manage.execution.ManageDriverScript;

import org.fundacionjala.automation.admin.actions.CommonAction;
import org.fundacionjala.automation.admin.actions.LoginAction;
import org.fundacionjala.automation.admin.actions.ResourceAction;
import org.fundacionjala.automation.admin.actions.RoomAction;

public class ResourceDriverScript {
	
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
			case "click_Resources": CommonAction.click_Resources();
	        						break;
			case "click_ConferenceRooms": CommonAction.click_ConferenceRooms();
										 break;
			case "click_AddResource": ResourceAction.click_AddResource(CommonAction.driver);
									  break;
			case "click_Icon": ResourceAction.click_Icon(CommonAction.driver);
							   break;
			case "click_TypeResource": ResourceAction.click_TypeResource(CommonAction.driver);
			   						   break;
			case "input_ResourceName": ResourceAction.input_ResourceName(CommonAction.driver, manage.manageInputParameter(nameTest, "input_ResourceName"));
									          break;
			case "input_ResourceDisplayName": ResourceAction.input_ResourceDisplayName(CommonAction.driver, manage.manageInputParameter(nameTest, "input_ResourceDisplayName"));
	          								  break;
			case "click_SaveResource": ResourceAction.click_SaveResource(CommonAction.driver);
			  						   break;
			case "click_refresh": CommonAction.click_refresh();
			   					  break;
			case "click_ChekboxResource": ResourceAction.click_ChekboxResource(CommonAction.driver);
				  				  		   break;
			case "click_RemoveResource": ResourceAction.click_RemoveResource(CommonAction.driver);
	  		   							  break;
			case "click_RemoveResourceConfirmation": ResourceAction.click_RemoveResourceConfirmation(CommonAction.driver);
	  		   							 			 break;
			case "doubleClick_ConferenceRoom": ResourceAction.doubleClick_ConferenceRoom(CommonAction.driver, manage.manageInputParameter(nameTest, "doubleClick_ConferenceRoom"));
	 			 							   break;
			case "click_ResourceAssociations": ResourceAction.click_ResourceAssociations(CommonAction.driver);
			   									break;
			case "click_ResourceAssignment": ResourceAction.click_ResourceAssignment(CommonAction.driver);
											 break;
			case "click_SaveResourceAssignment": ResourceAction.click_SaveResourceAssignment(CommonAction.driver);
			 								 	 break;

			case "verify_RoomResourceAssignment": RoomAction.verify_RoomResourceAssignment(CommonAction.driver);
									    		  break;
			}
	     }
   }
}
