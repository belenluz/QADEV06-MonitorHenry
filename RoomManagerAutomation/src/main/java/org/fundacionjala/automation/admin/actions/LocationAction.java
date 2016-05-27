package org.fundacionjala.automation.admin.actions;

import java.util.List;

import org.apache.log4j.Logger;
import org.fundacionjala.automation.admin.pages.location.Location;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationAction {
	static Location locationPage = new Location();
	static String displayNameLocation;
	static String nameLocation;
	public static boolean verificationLocationNameEdited = false;
	static Logger logger = Logger.getLogger(LocationAction.class);
	
	public static void click_AddLocation(WebDriver driver){
		locationPage.get_AddLocationButton(driver).click();
		logger.info("Click on AddLocation button");
	}
	
	public static void input_LocationName(WebDriver driver, String name){
		locationPage.get_LocationNameField(driver).clear();
		locationPage.get_LocationNameField(driver).sendKeys(name);
		logger.info("Input Location Name: " + name);
	}
	
	public static void edit_LocationName(WebDriver driver, String name){
		nameLocation = name;
		locationPage.get_LocationNameField(driver).clear();
		locationPage.get_LocationNameField(driver).sendKeys(name);
		logger.info("Edit Location Name: " + name);
	}
	
	public static void input_LocationDisplayName(WebDriver driver, String displayName){
		displayNameLocation = displayName;
		locationPage.get_LocationDisplayNameField(driver).clear();
		locationPage.get_LocationDisplayNameField(driver).sendKeys(displayName);
		logger.info("Input Location DisplayName: " + displayName);
	}
	
	public static void input_LocationDescription(WebDriver driver, String description){
		locationPage.get_LocationDescriptionField(driver).clear();
		locationPage.get_LocationDescriptionField(driver).sendKeys(description);
		logger.info("Input Location Description: " + description);
	}
	
	public static void click_SaveLocation(WebDriver driver){
		locationPage.get_SaveLocationButton(driver).click();
		logger.info("Click on SaveLocation button");
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ng-binding ng-scope']")));
	}
	
	public static void check_LocationCheckBox(WebDriver driver){
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ngCellText ng-binding ng-scope'][@ng-dblclick='editLocation(row.entity)'][text()='"+ displayNameLocation +"']/parent::div/parent::div/parent::div/descendant::input[@type='checkbox'][@class='ngSelectionCheckbox']")));
		locationPage.get_CheckBoxLocation(driver, displayNameLocation).click();
		logger.info("Check Location CheckBox");
	}
	

	public static void doubleClick_Location(WebDriver driver){
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ngCellText ng-binding ng-scope'][@ng-dblclick='editLocation(row.entity)'][text()='"+ displayNameLocation +"']/parent::div/parent::div/parent::div/descendant::input[@type='checkbox'][@class='ngSelectionCheckbox']")));
		 Actions action = new Actions(driver);
		 List<WebElement> table = driver.findElements(By.xpath("//div[@class='ngCanvas']/div[@ng-style='rowStyle(row)']/div[2]"));
			for(WebElement row : table){
				String text = row.getText();
				text = text.replaceAll("\\s+","");
				if(text.equals(displayNameLocation)){
					action.doubleClick(row).build().perform();
				}
			}
		logger.info("Double click on Location: " + displayNameLocation);
	}
	
	public static void verify_LocationEdited(WebDriver driver){
		 logger.info("Verify if the Location’s name has the new name assignment");
		 List<WebElement> table = driver.findElements(By.xpath("//div[@class='ngCanvas']/div[@ng-style='rowStyle(row)']/div[3]"));
			for(WebElement row : table){
				String text = row.getText();
				text = text.replaceAll("\\s+","");
				if(text.equals(nameLocation)){
					verificationLocationNameEdited = true;
				}
			}
	}
	
	public static void click_RemoveLocation(WebDriver driver){
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@href='#/admin/locations'][@ui-sref='admin.locations.remove']/descendant::span[text()='Remove']")));
		locationPage.get_RemoveLocationButton(driver).click();
		logger.info("Click on Remove Location");
	}
	
	public static void click_RemoveLocationConfirmation(WebDriver driver){
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-click='removeLocations()'][@class='btn btn-primary']/descendant::span[text()='Remove']")));
		locationPage.get_RemoveLocationConfirmationButton(driver).click();
		logger.info("Click on Remove Location Confirmation");
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ng-binding ng-scope']")));
	}
}
