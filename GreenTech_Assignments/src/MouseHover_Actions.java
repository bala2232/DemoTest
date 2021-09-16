import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Actions {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Luffy\\eclipse-workspace\\GreenTech_Assignments\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Actions hover = new Actions(driver);
		
		// Element to be hovered
		WebElement elementToHover = driver.findElement(By.xpath("//a[text()='Women']"));
		
		//Using moveToElement method from Actions Class 
		hover.moveToElement(elementToHover).build().perform();
		
		//screenshot the output
		Thread.sleep(2000);
		TakesScreenshot sc = (TakesScreenshot)driver;
		File srcFile = sc.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\Selenium Files\\Screenshots\\hover.png");
		FileUtils.copyFile(srcFile, destFile);
		
		
		
}
}
