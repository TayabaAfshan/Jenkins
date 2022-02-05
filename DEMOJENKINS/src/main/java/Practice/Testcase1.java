package Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Testcase1 {
	
	private static final String TimeSpan = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		//driver.get("https://www.google.co.in/");
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //try {
            //Save Screenshot in destination file
          //  FileUtils.copyFile(src, new File("D:\\screenshot.png"));
        //} catch (IOException e) {
          //  e.printStackTrace();
        //}
		
		
		Actions action = new Actions(driver);
		var wait = new WebDriverWait(driver, TimeSpan.FromSeconds(30));
		driver.navigate().GoToUrl("https://jqueryui.com/droppable/");
		wait.Until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));

		var source = driver.FindElement(By.Id("draggable"));
		var target = driver.FindElement(By.Id("droppable"));

		action.DragAndDrop(source, target).Perform();
		
	}

}
