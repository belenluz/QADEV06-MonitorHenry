package org.fundacionjala.automation.tablet.actions;

import java.util.List;

import org.apache.log4j.Logger;
import org.fundacionjala.automation.tablet.pages.search.SearchTablet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchTabletAction {
	static SearchTablet searchTabletPage = new SearchTablet();
	public static boolean verificationSearchResource = false;
	static Logger logger = Logger.getLogger(SearchTabletAction.class);
	
	public static void click_Resource(WebDriver driver, String search){
		List<WebElement> list = searchTabletPage.get_Resources(driver);
		for(WebElement resource : list){
		       String nameResource = resource.getText();
		       nameResource = nameResource.replaceAll("\\s+","");
		       if(nameResource.equals(search)){     
		    	   resource.click(); 
		       }
		   }
		logger.info("Click on a specific resource: " + search);
		}
	
	public static void verify_SearchByResource(WebDriver driver, String search){
		logger.info("Verify if the search by Resource displays the Room corresponding: " + search);
		List<WebElement> list = searchTabletPage.get_Rooms(driver);
		for(WebElement room : list){
		       String nameRoom = room.getText();
		       nameRoom = nameRoom.replaceAll("\\s+","");
		       if(nameRoom.equals(search)){ 
		    	   verificationSearchResource = true;
		       }
		   }
		}
	
	
}
