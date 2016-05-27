package org.fundacionjala.automation.tablet.pages.schedule;

import java.util.List;

import org.fundacionjala.automation.tablet.maps.ScheduleTabletMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScheduleTablet {
	
	public WebElement get_OrganizerField(WebDriver driver){
		return driver.findElement(By.id(ScheduleTabletMap.organizerField));
		}
	
	public WebElement get_SubjectField(WebDriver driver){
		return driver.findElement(By.id(ScheduleTabletMap.subjectField));
		}
	
	public WebElement get_TimeInitialField(WebDriver driver){
		return driver.findElement(By.xpath(ScheduleTabletMap.timeInitialField));
		}
	
	public WebElement get_TimeEndField(WebDriver driver){
		return driver.findElement(By.xpath(ScheduleTabletMap.timeEndField));
		}
	
	public WebElement get_CreateButton(WebDriver driver){
		return driver.findElement(By.xpath(ScheduleTabletMap.createButton));
		}
	
	public WebElement get_UsernameCredentialField(WebDriver driver){
		return driver.findElement(By.xpath(ScheduleTabletMap.usernameCredentialField));
		}
	
	public WebElement get_PasswordCredentialField(WebDriver driver){
		return driver.findElement(By.xpath(ScheduleTabletMap.passwordCredentialField));
		}
	
	public WebElement get_SaveMeetingButton(WebDriver driver){
		return driver.findElement(By.xpath(ScheduleTabletMap.saveMeetingButton));
		}
	
	public List<WebElement> get_Meetings(WebDriver driver){
		return driver.findElements(By.xpath(ScheduleTabletMap.meetings));
		}
	
	public WebElement get_RemoveButton(WebDriver driver){
		return driver.findElement(By.xpath(ScheduleTabletMap.removeButton));
		}

	public List<WebElement> get_ThemeElement(WebDriver driver){
		return driver.findElements(By.xpath(ScheduleTabletMap.get_ThemeElement));
		}
 
}
