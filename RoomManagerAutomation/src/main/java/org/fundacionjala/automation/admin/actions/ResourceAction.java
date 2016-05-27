package org.fundacionjala.automation.admin.actions;

import java.util.List;

import org.apache.log4j.Logger;
import org.fundacionjala.automation.admin.pages.resource.Resource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResourceAction {
	static Resource resourcePage = new Resource();
	static String nameResource;
	static String displayNameResource;
	static Logger logger = Logger.getLogger(ResourceAction.class);
	
	public static void click_AddResource(WebDriver driver){
		resourcePage.get_AddResourceButton(driver).click();
		logger.info("Click on AddResource button");
		}
 
	public static void click_Icon(WebDriver driver){
		resourcePage.get_IconResource(driver).click();
		logger.info("Click on Icon button");
		}
	
	public static void click_TypeResource(WebDriver driver){
		resourcePage.get_TypeResource(driver).click();
		logger.info("Click on type of Resource");
		}
	
	public static void input_ResourceName(WebDriver driver, String resourceName){
		nameResource = resourceName;
		resourcePage.get_ResourceNameField(driver).clear();
		resourcePage.get_ResourceNameField(driver).sendKeys(resourceName);
		logger.info("Input Resource Name: " + resourceName);
		}
	
	public static void input_ResourceDisplayName(WebDriver driver, String resourceDisplayName){
		displayNameResource = resourceDisplayName;
		resourcePage.get_ResourceDisplayNameField(driver).clear();
		resourcePage.get_ResourceDisplayNameField(driver).sendKeys(resourceDisplayName);
		logger.info("Input Resource DisplayName: " + resourceDisplayName);
		}
	
	public static void click_SaveResource(WebDriver driver){
		resourcePage.get_SaveResourceButton(driver).click();
		logger.info("Click on save Resource button");
		}
	
	public static void click_ChekboxResource(WebDriver driver){
		new WebDriverWait(driver, 30);
		List<WebElement> table = driver.findElements(By.xpath("//div[@class='ngCanvas']/div[@ng-style='rowStyle(row)']/div[3]"));
		for(WebElement row : table){
			String text = row.getText();
			text = text.replaceAll("\\s+","");
			if(text.equals(nameResource)){
				row.click();
			}
		}
		logger.info("Click on CheckBox Resource");
		new WebDriverWait(driver, 30);
	}
	
	public static void doubleClick_ConferenceRoom(WebDriver driver, String roomName){
		new WebDriverWait(driver, 30);
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
	
	public static void click_RemoveResource(WebDriver driver){
		resourcePage.get_RemoveResourceButton(driver).click();
		logger.info("Click on Remove Resource");
		}
	
	public static void click_RemoveResourceConfirmation(WebDriver driver){
		resourcePage.get_RemoveResourceConfirmation(driver).click();
		logger.info("Click on Remove Resource Confirmation");
		}
	
	public static void click_ResourceAssociations(WebDriver driver){
		resourcePage.get_ResourceAssociations(driver).click();
		logger.info("Click on Resource Associations Tab");
		}
	
	public static void click_ResourceAssignment(WebDriver driver){
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='list-group']/div[@ng-repeat='availableResource in availableResources']/div[2]/*"));
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			text = text.replaceAll("\\s+","");
			if(text.equals(displayNameResource)){
				addResource(i, driver);
			}
		}
		logger.info("Associate the Resource");
		}
	
	public static void addResource(int index, WebDriver driver){
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='list-group']/div[@ng-repeat='availableResource in availableResources']/div[3]/*"));
		list.get(index).click();
	}
	
	public static void click_SaveResourceAssignment(WebDriver driver){
		resourcePage.get_SaveResourceButton(driver).click();
		logger.info("Click on Save Resource button");
		}
}
