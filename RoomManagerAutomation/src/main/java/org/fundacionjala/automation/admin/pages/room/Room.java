package org.fundacionjala.automation.admin.pages.room;

import java.util.List;

import org.fundacionjala.automation.admin.maps.RoomMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Room {
	public WebElement get_CapacityField(WebDriver driver){
		return driver.findElement(By.xpath(RoomMap.capacityField));
		}
	
	public WebElement get_DisabledButton(WebDriver driver){
		return driver.findElement(By.cssSelector(RoomMap.disabledButton));
		}
	
	public WebElement get_EnabledButton(WebDriver driver){
		return driver.findElement(By.xpath(RoomMap.enabledButton));
		}
	
	public List<WebElement> get_ResourceAssignment(WebDriver driver){
		return driver.findElements(By.xpath(RoomMap.resourceAssignment));
		}

	public WebElement get_SaveRoomCapacityButton(WebDriver driver){
		return driver.findElement(By.cssSelector(RoomMap.saveRoomCapacityButton));
		}
}
