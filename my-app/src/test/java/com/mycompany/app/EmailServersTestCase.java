package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.Account;
import Preconditions.Login;

public class EmailServersTestCase {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private Account config = new Account();
	  private Login login = new Login();
	  
	  @BeforeClass
	  public void testSetUp() {
		driver = new FirefoxDriver();
	    login.begin(driver);
	  }
	
	  @Test
	  public void CreateNewLocationAssociations() {
		  driver.findElement(By.linkText("Email Servers")).click();
			WebElement element =  driver.findElement(By.xpath("//div[2]/button"));
			if(element != null){
				driver.findElement(By.xpath("//button[2]")).click();
				driver.findElement(By.cssSelector("div.pull-right > button.btn-clear.info")).click();
			}
			driver.findElement(By.xpath("//div[2]/button")).click();
		    driver.findElement(By.id("add-mailserver-hostname")).clear();
		    driver.findElement(By.id("add-mailserver-hostname")).sendKeys(config.getDomain());
		    driver.findElement(By.id("add-mailserver-username")).clear();
		    driver.findElement(By.id("add-mailserver-username")).sendKeys(config.getName());
		    driver.findElement(By.id("add-mailserver-password")).clear();
		    driver.findElement(By.id("add-mailserver-password")).sendKeys(config.getPasswordExchange());
		    driver.findElement(By.cssSelector("div.modal-footer.ng-scope > button.btn.btn-primary")).click();
		    //assertTrue(isElementPresent(By.xpath("//a/div[2]")));
		    
	  }
 
     @AfterClass
	  public void tearDown() {
		driver.quit();
	  }
}
