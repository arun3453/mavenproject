package org_day1;

import java.sql.Date;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prajjuiiit2 {
	
		static WebDriver driver;

	@BeforeClass
	public static void befclass() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	@AfterClass
	public static void aftclass() {
		driver.quit();
		
	}
	
	@Before
	public void bef() {
		Date d=new Date(0);
		System.out.println("before..." +d);

	}
	@After
	public void aft() {
		
		Date d=new Date(0);
		System.out.println("after..." +d);

	}
	@Test
	public void tes() {
		driver.get("https://www.facebook.com/");
		WebElement ema = driver.findElement(By.id("email"));
		ema.sendKeys("r.arun3453@gamil.com");
		WebElement pas = driver.findElement(By.id("pass"));
		pas.sendKeys("8056665244");
//		WebElement clk = driver.findElement(By.name("login"));
//		clk.click();
		
	}
	@Test
	public void tes2() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement clkcreat = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clkcreat.click();
		Thread.sleep(2000);
		WebElement firnam = driver.findElement(By.name("firstname"));
		firnam.sendKeys("arun");
		WebElement lasnam = driver.findElement(By.name("lastname"));
		lasnam.sendKeys("r");
		WebElement ph = driver.findElement(By.name("reg_email__"));
		ph.sendKeys("456789");
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("234567");
		WebElement bday = driver.findElement(By.name("birthday_day"));
		Select s=new Select(bday);
		s.selectByVisibleText("23");
		WebElement bmon = driver.findElement(By.name("birthday_month"));
		Select s1=new Select(bmon);
		s1.selectByVisibleText("May");
		WebElement byer = driver.findElement(By.name("birthday_year"));
		Select s2=new Select(byer);
		s2.selectByVisibleText("1997");
		WebElement gendrr = driver.findElement(By.xpath("//label[text()='Male']"));
		Actions a=new Actions(driver);
		a.click(gendrr).perform();
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
