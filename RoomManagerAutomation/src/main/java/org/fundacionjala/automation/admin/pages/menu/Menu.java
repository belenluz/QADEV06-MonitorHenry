package org.fundacionjala.automation.admin.pages.menu;

import org.fundacionjala.automation.admin.maps.MenuMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu {
	public WebElement get_ResourcesLink(WebDriver driver){
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Resources")));
		return driver.findElement(By.linkText(MenuMap.resourcesLink));
		}
	
	public WebElement get_ConferenceRoomsLink(WebDriver driver){
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Conference Rooms")));
		return driver.findElement(By.linkText(MenuMap.conferenceRoomsLink));
		}
	
	public WebElement get_LocationLink(WebDriver driver){
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Locations")));
		return driver.findElement(By.linkText(MenuMap.locationLink));
		}
	
	public WebElement get_TabletsLink(WebDriver driver){
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Tablets")));
		return driver.findElement(By.linkText(MenuMap.tabletsLink));
		}
}
