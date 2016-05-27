package org.fundacionjala.automation.admin.actions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.util.concurrent.TimeUnit;
import org.fundacionjala.automation.admin.pages.menu.Menu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import config.ConfigurationAdmin;
import config.ConfigurationTablet;

public class CommonAction {
	public static WebDriver driver;
	private static String baseUrl;
	static Menu menuPage = new Menu();
	public static Logger logger = Logger.getLogger(CommonAction.class);
	 
    public static void openBrowser(String browser){
    	PropertyConfigurator.configure("./config/log4j.properties");
		logger.info("Open Browser: " + browser);
    	if(browser.equalsIgnoreCase(ConfigurationAdmin.firefox)){
    		driver = new FirefoxDriver();
    	}else{
    		System.setProperty(ConfigurationAdmin.driverChrome,ConfigurationAdmin.pathChrome);
    		driver = new ChromeDriver();
    	}
		baseUrl = ConfigurationAdmin.baseUrl;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
 
	public static void navigate(){
		driver.get(baseUrl);
		logger.info("Navigate to Admin: " + baseUrl);
		}
	
	public static void navigateTablet(){
		driver.get(ConfigurationTablet.baseUrl);
		logger.info("Navigate to Tablet Page: " + baseUrl);
		new WebDriverWait(driver, 30);
		}
	
	public static void click_ConferenceRooms(){
		menuPage.get_ConferenceRoomsLink(driver).click();
		logger.info("Click on ConferenceRooms");
		new WebDriverWait(driver, 40);
		}
	
	public static void click_Locations(){
		menuPage.get_LocationLink(driver).click();
		logger.info("Click on Locations");
		new WebDriverWait(driver, 30);
		}
	
	public static void click_Resources(){
		menuPage.get_ResourcesLink(driver).click();
		logger.info("Click on Resources");
		new WebDriverWait(driver, 40);
		}
	
	public static void click_Tablets(){
		menuPage.get_TabletsLink(driver).click();
		logger.info("Click on Tablets");
		}
	
	public static void waitFor(WebDriver driver, String linkText){
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
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
