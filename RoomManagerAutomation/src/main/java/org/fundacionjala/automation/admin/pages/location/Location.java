package org.fundacionjala.automation.admin.pages.location;

import org.fundacionjala.automation.admin.maps.LocationMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Location {  
	
	public WebElement get_AddLocationButton(WebDriver driver){
		return driver.findElement(By.xpath(LocationMap.addLocationButton));
	}
	
	public WebElement get_LocationNameField(WebDriver driver){
		return driver.findElement(By.id(LocationMap.locationNameField));
	}
	
	public WebElement get_LocationDisplayNameField(WebDriver driver){
		return driver.findElement(By.id(LocationMap.locationDisplayNameField));
	}
	
	public WebElement get_LocationDescriptionField(WebDriver driver){
		return driver.findElement(By.id(LocationMap.locationDescriptionField));
	}
	
	public WebElement get_SaveLocationButton(WebDriver driver){
		return driver.findElement(By.xpath(LocationMap.saveLocationButton));
	}
	
	public WebElement get_CheckBoxLocation(WebDriver driver, String locationName){
		return driver.findElement(By.xpath("//div[@class='ngCellText ng-binding ng-scope'][@ng-dblclick='editLocation(row.entity)'][text()='"+ locationName +"']/parent::div/parent::div/parent::div/descendant::input[@type='checkbox'][@class='ngSelectionCheckbox']"));
	}
	
	public WebElement get_RemoveLocationButton(WebDriver driver){
		return driver.findElement(By.xpath(LocationMap.removeLocationButton));
	}
	
	public WebElement get_RemoveLocationConfirmationButton(WebDriver driver){
		return driver.findElement(By.xpath(LocationMap.removeLocationConfirmationButton));
	}
}
