package com.practissee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sign_Up {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Luffy\\eclipse-workspace\\GreenTech_Assignments\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.cssSelector(".login")).click();

		String emailId = "balakrish123@gmail.com";
		String fstName = "Balakrishnan";
		String lstName = "A";

		driver.findElement(By.cssSelector("#email_create")).sendKeys(emailId);

		driver.findElement(By.cssSelector("#SubmitCreate")).click();

		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#id_gender1")).click();

		// FirstName & Last Name;
		driver.findElement(By.cssSelector("#customer_firstname")).sendKeys(fstName);
		driver.findElement(By.cssSelector("#customer_lastname")).sendKeys(lstName);

		driver.findElement(By.cssSelector("#passwd")).sendKeys("love1234");

		Thread.sleep(2000);
		WebElement daySelect = driver.findElement(By.cssSelector("#days"));
		Select dropDay = new Select(daySelect);
		dropDay.selectByValue("4");
		WebElement daySelectMonth = driver.findElement(By.cssSelector("#months"));
		Select dropMonth = new Select(daySelectMonth);
		dropMonth.selectByValue("11");
		WebElement daySelectYear = driver.findElement(By.cssSelector("#years"));
		Select dropYear = new Select(daySelectYear);
		dropYear.selectByValue("2016");

		// Address
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(fstName);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lstName);
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("GreenTech");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Adam street, Chennai");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chennai");
		WebElement daySelectState = driver.findElement(By.cssSelector("#id_state"));

		Select dropState = new Select(daySelectState);
		dropState.selectByVisibleText("Oklahoma");

		WebElement daySelectCountry = driver.findElement(By.cssSelector("#id_country"));
		Select dropCountry = new Select(daySelectCountry);
		dropCountry.selectByVisibleText("United States");

		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("60408");
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("9457833333");

		WebElement addressLast = driver.findElement(By.xpath("//input[@id='alias']"));
		addressLast.clear();
		addressLast.sendKeys("Adam street, Chennai");
		
		System.out.println("updated for git");

		// driver.findElement(By.cssSelector("#submitAccount")).click();

	}

}
