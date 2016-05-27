package org.fundacionjala.automation.admin.pages.tablet;

import org.fundacionjala.automation.admin.maps.TabletMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tablet {
	public WebElement get_AppearanceButton(WebDriver driver){
		return driver.findElement(By.xpath(TabletMap.appearanceButton));
		}
	
	public WebElement get_Palette(WebDriver driver){
		return driver.findElement(By.id(TabletMap.palette));
		}
	
	public WebElement get_SaveTabletButton(WebDriver driver){
		return driver.findElement(By.cssSelector(TabletMap.saveTabletButton));
		}
	
}
