package org.fundacionjala.automation.tablet.pages.login;

import java.util.List;

import org.fundacionjala.automation.tablet.maps.LoginTabletMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTablet {
	public WebElement get_ServiceField(WebDriver driver){
		return driver.findElement(By.id(LoginTabletMap.serviceField));
		}
	
	public WebElement get_AdministratorNameField(WebDriver driver){
		return driver.findElement(By.id(LoginTabletMap.administratorNameField));
		}
 
	public WebElement get_PasswordField(WebDriver driver){
		return driver.findElement(By.id(LoginTabletMap.passwordField));
		}
 
	public WebElement get_SignInButton(WebDriver driver){
		return driver.findElement(By.xpath(LoginTabletMap.signInButton));
		}
	
	public WebElement get_SelectorRoomButton(WebDriver driver){
		return driver.findElement(By.cssSelector(LoginTabletMap.selectorRoomButton));
		}
	
	public List<WebElement> get_WorkingRooms(WebDriver driver){
		return driver.findElements(By.xpath(LoginTabletMap.workingRooms));
		}
	
	public WebElement get_StartButton(WebDriver driver){
		return driver.findElement(By.cssSelector(LoginTabletMap.startButton));
		}
	
}
