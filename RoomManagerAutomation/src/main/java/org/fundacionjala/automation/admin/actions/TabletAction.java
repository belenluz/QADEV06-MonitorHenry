package org.fundacionjala.automation.admin.actions;

import org.apache.log4j.Logger;
import org.fundacionjala.automation.admin.pages.tablet.Tablet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TabletAction {
	
	static Tablet tabletPage = new Tablet();
	static String colorTablet;
	public static boolean verificationResult = false;
	static Logger logger = Logger.getLogger(TabletAction.class);
	
	public static void click_Appearance(WebDriver driver){
		tabletPage.get_AppearanceButton(driver).click();
		logger.info("Click on Appearance button");
		}
	
	public static void select_PaletteColor(WebDriver driver, String color){
		colorTablet = color;
		new Select(tabletPage.get_Palette(driver)).selectByVisibleText(color);
		logger.info("Select a Color: " + color);
		}
	
	public static void  click_SaveTablet(WebDriver driver){
		tabletPage.get_SaveTabletButton(driver).click();
		logger.info("Click on Save Tablet button");
		}
}
