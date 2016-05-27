package org.fundacionjala.automation.tablet.actions;

import java.util.List;

import org.apache.log4j.Logger;
import org.fundacionjala.automation.tablet.pages.login.LoginTablet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTabletAction {
	static LoginTablet loginPage = new LoginTablet();
	static Logger logger = Logger.getLogger(LoginTabletAction.class);
	
	public static void input_Service(WebDriver driver, String service){
		new WebDriverWait(driver, 30);
		loginPage.get_ServiceField(driver).clear();
		loginPage.get_ServiceField(driver).sendKeys(service);
		}

	public static void input_AdministratorName(WebDriver driver, String userName){
		new WebDriverWait(driver, 30);
		loginPage.get_AdministratorNameField(driver).clear();
		loginPage.get_AdministratorNameField(driver).sendKeys(userName);
		logger.info("Input Administrator name: " + userName);
		}
 
	public static void input_Password(WebDriver driver, String password){ 
		new WebDriverWait(driver, 30);
		loginPage.get_PasswordField(driver).clear();
		loginPage.get_PasswordField(driver).sendKeys(password);
		logger.info("Input Password: " + password);
		}
 
	public static void click_SignIn(WebDriver driver){
		loginPage.get_SignInButton(driver).click();
		logger.info("Click on SignIn button");
		}
	
	public static void click_SelectorRoomButton(WebDriver driver){
		loginPage.get_SelectorRoomButton(driver).click();
		logger.info("Click on Selector Room button");
		}
	
	public static void click_WorkingRoom(WebDriver driver, String room){
		List<WebElement> list = loginPage.get_WorkingRooms(driver);
			for(WebElement row : list){
				String text = row.getText();
				if(text.contains(room)){
					row.click();
				}
			}
			logger.info("Click on a Room: " + room);
		}
	
	public static void click_StartButton(WebDriver driver){
		loginPage.get_StartButton(driver).click();
		logger.info("Click on Start button");
		}

}
