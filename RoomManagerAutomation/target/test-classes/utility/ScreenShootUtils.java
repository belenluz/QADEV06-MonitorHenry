package utility;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShootUtils {
	
	public static void takeScreen(WebDriver driver, String screenshotName)
    {
	    try
	    {
	     TakesScreenshot ts = (TakesScreenshot)driver;
	     File source = ts.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(source,new File("./screen/failed/"+screenshotName+".png"));
	    }
	    catch(Exception e)
	    {
	     System.out.println("One exception has been happen taking screenshot " + e.getMessage());
	    }
    } 
}
