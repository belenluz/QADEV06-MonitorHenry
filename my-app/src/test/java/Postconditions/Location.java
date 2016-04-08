package Postconditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Preconditions.Login;

public class Location {
	private List<WebElement> table;
	private WebDriver driver;
	private String baseUrl;
	private Login login = new Login();
	
	public boolean verifyLocation(String value, WebDriver driver){
		driver.findElement(By.linkText("Locations")).click();
		boolean res = false;
		List<WebElement> table = driver.findElements(By.xpath("//div[@class='ngCanvas']/div[@ng-style='rowStyle(row)']/div[2]"));
		for(WebElement row : table){
			String text = row.getText();
			text = text.replaceAll("\\s+","");
			if(text.equals(value)){
				res = true;
				row.click();
				System.out.println("WOrks");
			}
		}
	    driver.findElement(By.xpath("//button[2]")).click();
	    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	    driver.quit();
		return res;
	}
}