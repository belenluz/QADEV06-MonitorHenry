package org.fundacionjala.automation.admin.pages.resource;

import org.fundacionjala.automation.admin.maps.ResourceMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Resource {
	
	public WebElement get_AddResourceButton(WebDriver driver){
		return driver.findElement(By.xpath(ResourceMap.addResourceButton));
		}
 
	public WebElement get_IconResource(WebDriver driver){
		return driver.findElement(By.id(ResourceMap.iconResource));
		}
	
	public WebElement get_TypeResource(WebDriver driver){
		return driver.findElement(By.xpath(ResourceMap.typeResource));
		}
	
	public WebElement get_ResourceNameField(WebDriver driver){
	     return driver.findElement(By.xpath(ResourceMap.resourceNameField));
		}
	
	public WebElement get_ResourceDisplayNameField(WebDriver driver){
		 return driver.findElement(By.xpath(ResourceMap.resourceDisplayNameField));
		}
	
	public WebElement get_SaveResourceButton(WebDriver driver){
		return driver.findElement(By.cssSelector(ResourceMap.saveResourceButton));
		}
	
	public WebElement get_RemoveResourceButton(WebDriver driver){
		return driver.findElement(By.id(ResourceMap.removeResourceButton));
		}
	
	public WebElement get_RemoveResourceConfirmation(WebDriver driver){
		return driver.findElement(By.cssSelector(ResourceMap.removeResourceConfirmation));
		}
	
	public WebElement get_ResourceAssociations(WebDriver driver){
		return driver.findElement(By.linkText(ResourceMap.resourceAssociations));
		}
	
	public WebElement get_ResourceAssignmentButton(WebDriver driver){
		return driver.findElement(By.cssSelector(ResourceMap.resourceAssignmentButton));
		}
	
	public WebElement get_SaveResourceAssignmentButton(WebDriver driver){
		return driver.findElement(By.cssSelector(ResourceMap.saveResourceAssignmentButton));
		}
}
