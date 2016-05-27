package org.fundacionjala.automation.admin.execution;

import java.util.ArrayList;
import manage.execution.ManageDriverScript;
import org.fundacionjala.automation.admin.actions.CommonAction;
import org.fundacionjala.automation.admin.actions.LocationAction;
import org.fundacionjala.automation.admin.actions.LoginAction;

public class LocationDriverScript {
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
			case "click_Locations": CommonAction.click_Locations();
	        						break;
			case "click_AddLocation": LocationAction.click_AddLocation(CommonAction.driver);
									  break;
			case "input_LocationName": LocationAction.input_LocationName(CommonAction.driver, manage.manageInputParameter(nameTest, "input_LocationName"));
									   break;
			case "edit_LocationName": LocationAction.edit_LocationName(CommonAction.driver, manage.manageInputParameter(nameTest, "edit_LocationName"));
			   						   break;
			case "input_LocationDisplayName": LocationAction.input_LocationDisplayName(CommonAction.driver, manage.manageInputParameter(nameTest, "input_LocationDisplayName"));
									          break;
			case "input_LocationDescription": LocationAction.input_LocationDescription(CommonAction.driver, manage.manageInputParameter(nameTest, "input_LocationDescription"));
	          								  break;
			case "click_SaveLocation": LocationAction.click_SaveLocation(CommonAction.driver);
			  						   break;
			case "click_refresh": CommonAction.click_refresh();
			   					  break;
			case "check_LocationCheckBox": LocationAction.check_LocationCheckBox(CommonAction.driver);
				  				  		   break;
			case "doubleClick_Location": LocationAction.doubleClick_Location(CommonAction.driver);
	  		   							   break;
			case "click_RemoveLocation": LocationAction.click_RemoveLocation(CommonAction.driver);
	  		   							 break;
			case "click_RemoveLocationConfirmation": LocationAction.click_RemoveLocationConfirmation(CommonAction.driver);
				 						 			 break;
			case "verify_LocationEdited": LocationAction.verify_LocationEdited(CommonAction.driver);
										  break;
			}
	     }
     }
}
