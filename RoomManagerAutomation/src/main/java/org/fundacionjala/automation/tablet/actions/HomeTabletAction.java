package org.fundacionjala.automation.tablet.actions;

import org.apache.log4j.Logger;
import org.fundacionjala.automation.tablet.pages.home.HomeTablet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeTabletAction {
	static HomeTablet homeTabletPage = new HomeTablet();
	public static boolean verifyRoomName = false;
	static Logger logger = Logger.getLogger(HomeTabletAction.class);
	
	public static void verify_RoomName(WebDriver driver, String room){
		logger.info("Verify if the Tablet's home page is created with the corresponding Room’s name selected");
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='room-name']")));
			if(homeTabletPage.get_RoomName(driver).getText().equals(room)){
				verifyRoomName = true;
			}
		} 
	
	public static void click_AvailableElement(WebDriver driver){
		homeTabletPage.get_AvailableElement(driver).click();
		logger.info("Click on Available element");
		}
	
	public static void click_SearchElement(WebDriver driver){
		homeTabletPage.get_SearchElement(driver).click();
		logger.info("Click on Search element");
		}
	
}
