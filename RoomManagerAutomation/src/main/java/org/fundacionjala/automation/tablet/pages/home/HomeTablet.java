package org.fundacionjala.automation.tablet.pages.home;

import org.fundacionjala.automation.tablet.maps.HomeTabletMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeTablet {
	
	public WebElement get_RoomName(WebDriver driver){
		return driver.findElement(By.xpath(HomeTabletMap.roomName));
		}
	
	public WebElement get_AvailableElement(WebDriver driver){
		return driver.findElement(By.cssSelector(HomeTabletMap.availableElement));
		}
	
	public WebElement get_SearchElement(WebDriver driver){
		return driver.findElement(By.cssSelector(HomeTabletMap.searchElement));
		}
	
}
