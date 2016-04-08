package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Postconditions.Resource;
import Preconditions.Login;
import Utils.Generator;

public class ResourceTestCase {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private Resource generator = new Resource();
	  private Login login = new Login();
	  private Generator build = new Generator();
	  private String LocationName;
	  
	  @BeforeClass
	  public void testSetUp() {
		driver = new FirefoxDriver();
	    login.begin(driver);
	  }
	
	  @Test
	  public void CreateNewResource() {
		  String ResourceName = build.generateString();
		    driver.findElement(By.linkText("Resources")).click();
		    driver.findElement(By.xpath("//div/div/button")).click();
		    driver.findElement(By.id("convert")).click();
		    driver.findElement(By.xpath("//button[@value='fa-filter']")).click();
		    driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(ResourceName);
		    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(ResourceName);
		    driver.findElement(By.cssSelector("button.info")).click();
		    driver.navigate().refresh();
		    driver.findElement(By.linkText("Conference Rooms")).click();
		    (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Conference Rooms")));
		    driver.findElement(By.linkText("Resources")).click();
		    (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Resources")));
		    
		    boolean val = generator.verifyResource(ResourceName, driver);
		    Assert.assertEquals(val, true);
		    System.out.println(val);
	  }

      @AfterClass
	  public void tearDown() {
		driver.quit();
	  }
}
