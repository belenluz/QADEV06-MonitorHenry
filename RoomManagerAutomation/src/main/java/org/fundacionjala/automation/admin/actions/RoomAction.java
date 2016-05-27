package org.fundacionjala.automation.admin.actions;

import java.util.List;

import org.apache.log4j.Logger;
import org.fundacionjala.automation.admin.pages.room.Room;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RoomAction {
	
	static Room roomPage = new Room();
	static String nameResource;
	static String capacityResource;
	public static boolean verificationEditRoomCapacity = false;
	public static boolean verificationResultRoomDisabled = false;
	public static boolean verificationResourceRoomAssignment = false;
	static Logger logger = Logger.getLogger(RoomAction.class);
	
	public static void input_Capacity(WebDriver driver, String capacity){
		capacityResource = capacity;
		roomPage.get_CapacityField(driver).clear();
		roomPage.get_CapacityField(driver).sendKeys(capacity);
		logger.info("Input the Capacity: " + capacity);
		}
	
	public static void verify_Capacity(WebDriver driver){
		logger.info("Verify if Conference Room’s capacity has the new capacity inserted");
		if(capacityResource.equals(roomPage.get_CapacityField(driver).getAttribute("value"))){
			System.out.println(roomPage.get_CapacityField(driver).getText());
			verificationEditRoomCapacity = true;
		   }
		}
	
	public static void click_Disabled(WebDriver driver){
		roomPage.get_DisabledButton(driver).click();
		logger.info("Click on Disabled button");
		}
	
	public static void click_Enabled(WebDriver driver){
		roomPage.get_EnabledButton(driver).click();
		logger.info("Click on Enabled button");
		}
	
	public static void verify_RoomDisabled(WebDriver driver){
		logger.info("Verify if Tablet page displays the Conference Room disabled");
		if(roomPage.get_EnabledButton(driver)!= null){
			verificationResultRoomDisabled = true;
			}
		}
	
	public static void verify_RoomResourceAssignment(WebDriver driver){
		 logger.info("Verify if the Resource has been unassigned");
		 if(roomPage.get_ResourceAssignment(driver).size()==0){
			 verificationResourceRoomAssignment = true;
		   }			
		}

	public static void click_SaveRoom(WebDriver driver){
		roomPage.get_SaveRoomCapacityButton(driver).click();
		logger.info("Click on Save Room button");
		}
	
	public static void doubleClick_ConferenceRoom(WebDriver driver, String roomName){
		List<WebElement> table = driver.findElements(By.xpath("//div[@class='ngCanvas']/div[@ng-style='rowStyle(row)']/div[3]"));
		Actions action = new Actions(driver);
		for(WebElement row : table){
			String text = row.getText();
			text = text.replaceAll("\\s+","");
			if(text.equals(roomName)){
				action.doubleClick(row).build().perform();
			}
		}
		logger.info("Double click on Room: " + roomName);
	}
}
