package Postconditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Preconditions.Login;

public class Resource {
	private List<WebElement> table;
	private WebDriver driver;
	private String baseUrl;
	private Login login = new Login();

	public boolean verifyResource(String value, WebDriver driver){
		driver.findElement(By.linkText("Resources")).click();
		boolean res = false;
		List<WebElement> table = driver.findElements(By.xpath("//div[@class='ngCanvas']/div[@ng-style='rowStyle(row)']/div[4]"));
		for(WebElement row : table){
			String text = row.getText();
			text = text.replaceAll("\\s+","");
			if(text.equals(value)){
				res = true;
				row.click();
				System.out.println("WOrks");
			}
		}
	    driver.findElement(By.id("btnRemove")).click();
		driver.findElement(By.cssSelector("button.info")).click();
	    driver.quit();
		return res;
	}
}
