package org.fundacionjala.automation.admin.execution;

import java.util.ArrayList;
import manage.execution.ManageDriverScript;
import org.fundacionjala.automation.admin.actions.CommonAction;
import org.fundacionjala.automation.admin.actions.LoginAction;

public class LoginDriverScript {
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
            }
		}
			
	}
}
