package org.fundacionjala.automation.tablet.execution;

import java.util.ArrayList;
import manage.execution.ManageDriverScript;
import org.fundacionjala.automation.admin.actions.LoginAction;
import org.fundacionjala.automation.admin.actions.ResourceAction;
import org.fundacionjala.automation.tablet.actions.CommonTabletAction;
import org.fundacionjala.automation.tablet.actions.HomeTabletAction;
import org.fundacionjala.automation.tablet.actions.LoginTabletAction;
import org.fundacionjala.automation.tablet.actions.SearchTabletAction;

public class SearchTabletDriverScript {
	private static ManageDriverScript manage = new ManageDriverScript();
	public void execute(ArrayList<String> list, String nameTest) throws Exception {
		for (int i=0;i<list.size();i++){
			String value = list.get(i);
			
			switch (value) {
			case "navigate": CommonTabletAction.navigateAdmin();
							 break;
			case "input_Username": LoginAction.input_Username(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_Username"));
			                  	   break;
			case "input_Password": LoginAction.input_Password(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_Password"));
					               break;
			case "click_Login": LoginAction.click_Login(CommonTabletAction.driver);
					            break;
			case "click_Resources": CommonTabletAction.click_Resources();
								    break;
			case "click_ConferenceRooms": CommonTabletAction.click_ConferenceRooms();
									      break;
			case "doubleClick_ConferenceRoom": ResourceAction.doubleClick_ConferenceRoom(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "doubleClick_ConferenceRoom"));
											   break;
			case "click_AddResource": ResourceAction.click_AddResource(CommonTabletAction.driver);
								      break;
			case "click_Icon": ResourceAction.click_Icon(CommonTabletAction.driver);
						       break;
			case "click_TypeResource": ResourceAction.click_TypeResource(CommonTabletAction.driver);
									   break;
			case "input_ResourceName": ResourceAction.input_ResourceName(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_ResourceName"));
								          break;
			case "input_ResourceDisplayName": ResourceAction.input_ResourceDisplayName(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_ResourceDisplayName"));
											  break;
			case "click_SaveResource": ResourceAction.click_SaveResource(CommonTabletAction.driver);
									   break;
			case "click_refresh": CommonTabletAction.click_refresh();
				  				  break;
			case "click_ResourceAssociations": ResourceAction.click_ResourceAssociations(CommonTabletAction.driver);
											   break;
			case "click_ResourceAssignment": ResourceAction.click_ResourceAssignment(CommonTabletAction.driver);
					 						 break;
			case "click_SaveResourceAssignment": ResourceAction.click_SaveResourceAssignment(CommonTabletAction.driver);
						 	 					 break;
            case "navigate_Tablet": CommonTabletAction.navigate();
                     		 		break;
            case "input_Service": LoginTabletAction.input_Service(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_Service"));
    		 				 	  break; 
            case "input_AdministratorName": LoginTabletAction.input_AdministratorName(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_AdministratorName"));
	  		 				       break;
            case "input_PasswordTablet": LoginTabletAction.input_Password(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "input_Password"));
		       					   		 break;
            case "click_SignIn": LoginTabletAction.click_SignIn(CommonTabletAction.driver);
			   					 break;
			case "click_SelectorRoomButton": LoginTabletAction.click_SelectorRoomButton(CommonTabletAction.driver);
						 			         break; 
			case "click_WorkingRoom": LoginTabletAction.click_WorkingRoom(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "click_WorkingRoom"));
							          break;
			case "click_StartButton": LoginTabletAction.click_StartButton(CommonTabletAction.driver);
							          break; 
			case "click_SearchElement": HomeTabletAction.click_SearchElement(CommonTabletAction.driver);
									    break;
			case "click_ChekboxResource": ResourceAction.click_ChekboxResource(CommonTabletAction.driver);
	  		   							  break;
			case "click_Resource": SearchTabletAction.click_Resource(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "click_Resource"));
		    					   break;
			case "click_RemoveResource": ResourceAction.click_RemoveResource(CommonTabletAction.driver);
				  						 break;
			case "click_RemoveResourceConfirmation": ResourceAction.click_RemoveResourceConfirmation(CommonTabletAction.driver);
				 			 						 break;
			case "verify_SearchByResource": SearchTabletAction.verify_SearchByResource(CommonTabletAction.driver, manage.manageInputParameter(nameTest, "verify_SearchByResource"));
				 							break;
							          
            }
		}
			
	}
}
