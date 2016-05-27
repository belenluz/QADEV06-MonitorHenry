package org.fundacionjala.automation.tablet.actions;

import java.util.List;
import org.apache.log4j.Logger;
import org.fundacionjala.automation.tablet.maps.ScheduleTabletMap;
import org.fundacionjala.automation.tablet.pages.schedule.ScheduleTablet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScheduleTabletAction {
	static ScheduleTablet scheduleTabletPage = new ScheduleTablet();
	public static boolean verificationColorTheme = false;
	public static boolean verificationMeetingRemoved = false;
	static Logger logger = Logger.getLogger(ScheduleTabletAction.class);
	
	public static void input_Organizer(WebDriver driver, String organizer){
		scheduleTabletPage.get_OrganizerField(driver).click();
		scheduleTabletPage.get_OrganizerField(driver).clear();
		scheduleTabletPage.get_OrganizerField(driver).sendKeys(organizer);
		logger.info("Input Organizer: " + organizer);
		}
	
	public static void input_Subject(WebDriver driver, String subject){
		scheduleTabletPage.get_SubjectField(driver).click();
		scheduleTabletPage.get_SubjectField(driver).clear();
		scheduleTabletPage.get_SubjectField(driver).sendKeys(subject);
		logger.info("Input Subject: " + subject);
		}
	
	public static void input_TimeInitial(WebDriver driver, String time){
		scheduleTabletPage.get_TimeInitialField(driver).clear();
		scheduleTabletPage.get_TimeInitialField(driver).sendKeys(time);
		logger.info("Input initial Time: " + time);
		}
	
	public static void input_TimeEnd(WebDriver driver, String time){
		scheduleTabletPage.get_TimeEndField(driver).clear();
		scheduleTabletPage.get_TimeEndField(driver).sendKeys(time);
		logger.info("Input end Time: " + time);
		}
	
	public static void click_CreateButton(WebDriver driver){
		scheduleTabletPage.get_CreateButton(driver).click();
		logger.info("Click on Create button");
		}
	
	public static void input_UsernameCredential(WebDriver driver, String name){
		scheduleTabletPage.get_UsernameCredentialField(driver).clear();
		scheduleTabletPage.get_UsernameCredentialField(driver).sendKeys(name);
		logger.info("Input username Credential: " + name);
		}
	
	public static void input_PasswordCredential(WebDriver driver, String password){
		scheduleTabletPage.get_PasswordCredentialField(driver).clear();
		scheduleTabletPage.get_PasswordCredentialField(driver).sendKeys(password);
		logger.info("Input password Credential: " + password);
		}
	
	public static void click_SaveMeeting(WebDriver driver){
		scheduleTabletPage.get_SaveMeetingButton(driver).click();
		logger.info("Click on Save Meeting button");
		}
	
	public static void click_Meeting(WebDriver driver, String subject){
		List<WebElement> list = scheduleTabletPage.get_Meetings(driver);
		for(WebElement meeting : list){
		       String nameMeeting = meeting.getText();
		       nameMeeting = nameMeeting.replaceAll("\\s+","");
		       if(nameMeeting.equals(subject)){     
		    	   meeting.click(); 
		       }
		   }
		logger.info("Click on a specific Meeting according the subject: " + subject);
		}
	
	public static void verify_MeetingRemoved(WebDriver driver, String subject){
		logger.info("Verify if a meeting has been removed according a subject: " + subject);
		List<WebElement> list = scheduleTabletPage.get_Meetings(driver);
		for(WebElement meeting : list){
		       String nameMeeting = meeting.getText();
		       nameMeeting = nameMeeting.replaceAll("\\s+","");
		       if(nameMeeting != subject){   
		    	   verificationMeetingRemoved = true;
		       }
		   }
		}
	
	public static void click_RemoveMeeting(WebDriver driver){
		scheduleTabletPage.get_RemoveButton(driver).click();
		logger.info("Click on Remove Meeting button");
		}
	
	public static void verify_ThemeColor(WebDriver driver, String colorTablet){
		logger.info("Verify if the Tablet’s appearance has the corresponding color: " + colorTablet);
		(new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ScheduleTabletMap.get_Element)));
		List<WebElement> list = scheduleTabletPage.get_ThemeElement(driver); 
		for(WebElement theme : list){
			String themeColor = theme.getAttribute("class");
			if(themeColor.contains(colorTablet)){
				verificationColorTheme = true;
			   }
		   }
		}
}
