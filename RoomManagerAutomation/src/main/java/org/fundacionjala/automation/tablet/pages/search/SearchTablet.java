package org.fundacionjala.automation.tablet.pages.search;

import java.util.List;

import org.fundacionjala.automation.tablet.maps.SearchTabletMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchTablet {
	public List<WebElement> get_Resources(WebDriver driver){
		return driver.findElements(By.xpath(SearchTabletMap.resources));
		}
	
	public List<WebElement> get_Rooms(WebDriver driver){
		return driver.findElements(By.xpath(SearchTabletMap.rooms));
		}
}
