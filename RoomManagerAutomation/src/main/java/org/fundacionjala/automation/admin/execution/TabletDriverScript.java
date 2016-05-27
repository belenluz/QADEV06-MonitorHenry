package org.fundacionjala.automation.admin.execution;

import java.util.ArrayList;
import manage.execution.ManageDriverScript;
import org.fundacionjala.automation.admin.actions.CommonAction;
import org.fundacionjala.automation.admin.actions.LoginAction;
import org.fundacionjala.automation.admin.actions.TabletAction;
import org.fundacionjala.automation.tablet.actions.HomeTabletAction;
import org.fundacionjala.automation.tablet.actions.LoginTabletAction;
import org.fundacionjala.automation.tablet.actions.ScheduleTabletAction;

public class TabletDriverScript {
	private static ManageDriverScript manage = new ManageDriverScript();
	String username;
	
	public void execute(ArrayList<String> list, String nameTest) throws Exception {
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
            case "click_Tablets": CommonAction.click_Tablets();
			   					  break;
            case "click_Appearance": TabletAction.click_Appearance(CommonAction.driver);
				  				  	 break;
            case "select_PaletteColor": TabletAction.select_PaletteColor(CommonAction.driver, manage.manageInputParameter(nameTest, "select_PaletteColor"));
            							break;
            case "click_SaveTablet": TabletAction.click_SaveTablet(CommonAction.driver);
			  	 					 break;			 
            case "navigate_Tablet": CommonAction.navigateTablet();
			    				    break;
            case "input_Service": LoginTabletAction.input_Service(CommonAction.driver, manage.manageInputParameter(nameTest, "input_Service"));
			 	  				  break; 
            case "input_AdministratorName": LoginTabletAction.input_AdministratorName(CommonAction.driver, manage.manageInputParameter(nameTest, "input_AdministratorName"));
				       			            break;
            case "input_PasswordTablet": LoginTabletAction.input_Password(CommonAction.driver, manage.manageInputParameter(nameTest, "input_Password"));
					   					 break;
            case "click_SignIn": LoginTabletAction.click_SignIn(CommonAction.driver);
								 break; 
            case "click_SelectorRoomButton": LoginTabletAction.click_SelectorRoomButton(CommonAction.driver);
			 					 			 break; 
            case "click_WorkingRoom": LoginTabletAction.click_WorkingRoom(CommonAction.driver, manage.manageInputParameter(nameTest, "click_WorkingRoom"));
 			 						  break;
            case "click_StartButton": LoginTabletAction.click_StartButton(CommonAction.driver);
 			 						  break; 
            case "click_AvailableElement": HomeTabletAction.click_AvailableElement(CommonAction.driver);
			  						       break;
            case "verify_ThemeColor": ScheduleTabletAction.verify_ThemeColor(CommonAction.driver, manage.manageInputParameter(nameTest, "verify_ThemeColor"));
				 				 	  break;
            }
		}
			
	}
}
