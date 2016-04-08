package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Postconditions.Location;
import Preconditions.Login;
import Utils.Generator;

public class LocationTestCase {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private Location generator = new Location();
	  private Login login = new Login();
	  private Generator build = new Generator();
	  
	@BeforeTest
	public void testSetUp() {
		driver = new FirefoxDriver();
	    login.begin(driver);
	}
	
  @Test
  public void CreateNewLocation() {
	  String LocationName = build.generateString();
		driver.findElement(By.linkText("Locations")).click();
	    driver.findElement(By.xpath("//div[4]/div/button")).click();
	    driver.findElement(By.id("location-add-name")).clear();
	    driver.findElement(By.id("location-add-name")).sendKeys(LocationName);
	    driver.findElement(By.id("location-add-display-name")).clear();
	    driver.findElement(By.id("location-add-display-name")).sendKeys(LocationName);
	    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	    driver.navigate().refresh();
	    (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Locations")));
	    
	    boolean val = generator.verifyLocation(LocationName, driver);
	    Assert.assertEquals(val, true);
	    System.out.println(val);
  }
  
  @AfterTest
	public void tearDown() {
		driver.quit();
	}
}
