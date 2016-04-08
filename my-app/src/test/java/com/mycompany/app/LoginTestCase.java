package com.mycompany.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import config.Account;

public class LoginTestCase {
	private WebDriver driver;
	private String baseUrl;
	private Account config = new Account();
	
  @Test
  public void VerifyLoginRoomManager() {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    baseUrl = config.getUrl();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/admin/#/login");
    driver.findElement(By.id("loginUsername")).clear();
    driver.findElement(By.id("loginUsername")).sendKeys(config.getName());
    driver.findElement(By.id("loginPassword")).clear();
    driver.findElement(By.id("loginPassword")).sendKeys(config.getPasswordRoomManager());
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  @AfterTest
	public void tearDown() {
	  driver.findElement(By.cssSelector("a > span")).click();
	  driver.quit();
	}
}
