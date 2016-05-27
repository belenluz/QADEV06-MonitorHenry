package manage.actions;

import java.util.ArrayList;

import org.fundacionjala.automation.admin.execution.LocationDriverScript;
import org.fundacionjala.automation.admin.execution.LoginDriverScript;
import org.fundacionjala.automation.admin.execution.ResourceDriverScript;
import org.fundacionjala.automation.admin.execution.RoomDriverScript;
import org.fundacionjala.automation.admin.execution.TabletDriverScript;
import org.fundacionjala.automation.tablet.execution.LoginTabletDriverScript;
import org.fundacionjala.automation.tablet.execution.ScheduleTabletDriverScript;
import org.fundacionjala.automation.tablet.execution.SearchTabletDriverScript;

public class ManageAction {
	
	public void manageActions(ArrayList<String> list, String nameTest) throws Exception{
		switch (nameTest) {
    	case "Login_01": LoginDriverScript login = new LoginDriverScript();
						 login.execute(list, nameTest);
	    				 break;
    	case "Login_02": LoginTabletDriverScript loginTablet = new LoginTabletDriverScript();
    					 loginTablet.execute(list, nameTest);
						 break;
    	case "Location_01": LocationDriverScript location = new LocationDriverScript();
							location.execute(list, nameTest);
						    break;
    	case "Resource_01": ResourceDriverScript resource = new ResourceDriverScript();
							resource.execute(list, nameTest);
							break;
    	case "Room_01": RoomDriverScript room01 = new RoomDriverScript();
    				    room01.execute(list, nameTest);
					    break;
    	case "Room_02": RoomDriverScript room02 = new RoomDriverScript();
	    				room02.execute(list, nameTest);
					    break;
    	case "Tablet_01": TabletDriverScript tablet01 = new TabletDriverScript();
    					  tablet01.execute(list, nameTest);
					      break;
    	case "Schedule_01": ScheduleTabletDriverScript schedule01 = new ScheduleTabletDriverScript();
    						schedule01.execute(list, nameTest);
    						break;
    	case "Search_01": SearchTabletDriverScript search01 = new SearchTabletDriverScript();
    					  search01.execute(list, nameTest);
						  break;
    	}
	}
}
