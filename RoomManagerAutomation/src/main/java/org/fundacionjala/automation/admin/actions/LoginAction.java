package org.fundacionjala.automation.admin.actions;

import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.fundacionjala.automation.admin.pages.login.Login;

public class LoginAction {
	static Login loginPage = new Login();
	static Logger logger = Logger.getLogger(LoginAction.class);

	public static void input_Username(WebDriver driver, String userName){
		loginPage.get_UsernameField(driver).clear();
		loginPage.get_UsernameField(driver).sendKeys(userName);
		logger.info("Input Username: " + userName);
		}
 
	public static void input_Password(WebDriver driver, String password){ 
		loginPage.get_PasswordField(driver).clear();
		loginPage.get_PasswordField(driver).sendKeys(password);
		logger.info("Input Password: " + password);
		}
 
	public static void click_Login(WebDriver driver){
		loginPage.get_SignInButton(driver).click();
		logger.info("Click on SignIn button");
		}
}
