package org.fundacionjala.automation.tablet.actions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.fundacionjala.automation.admin.pages.menu.Menu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.ConfigurationAdmin;
import config.ConfigurationTablet;

public class CommonTabletAction {
	public static WebDriver driver;
	static Menu menuPage = new Menu();
	private static String baseUrl;
	public static Logger logger = Logger.getLogger(CommonTabletAction.class);
	 
    public static void openBrowser(String browser){
    	PropertyConfigurator.configure("./config/log4j.properties");
    	logger.info("Open Browser: " + browser);
    	if(browser.equalsIgnoreCase(ConfigurationTablet.firefox)){
    		driver = new FirefoxDriver();
    	}else{
    		System.setProperty(ConfigurationTablet.driverChrome,ConfigurationTablet.pathChrome);
    		driver = new ChromeDriver();
    	}
		baseUrl = ConfigurationTablet.baseUrl;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
 
	public static void navigate(){
		driver.get(baseUrl);
		logger.info("Navigate to Tablet Page: " + baseUrl);
		}
	
	public static void navigateAdmin(){
		driver.get(ConfigurationAdmin.baseUrl);
		logger.info("Navigate to Admin Page: " + baseUrl);
		}
	
	public static void click_ConferenceRooms(){
		menuPage.get_ConferenceRoomsLink(driver).click();
		logger.info("Click on ConferenceRooms");
		new WebDriverWait(driver, 30);
		}
	
	public static void click_Resources(){
		menuPage.get_ResourcesLink(driver).click();
		logger.info("Click on Resources");
		new WebDriverWait(driver, 30);
		}
	
	public static void click_refresh(){
		driver.navigate().refresh();
		logger.info("Refresh Page");
		}
	
	public static void closeBrowser(){
		driver.quit();
		logger.info("Close Browser");
	}
}
