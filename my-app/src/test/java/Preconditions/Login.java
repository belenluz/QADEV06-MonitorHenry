package Preconditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.Account;

public class Login {
	private WebDriver driver;
	private String baseUrl;
	private Account config = new Account();
	
	public void begin(WebDriver driver){
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
}