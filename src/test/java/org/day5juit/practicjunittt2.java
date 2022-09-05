package org.day5juit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org_day1.bass.baseclass;
import org_day2.pageobjmod.pom_amazon;

public class practicjunittt2 extends baseclass{
	
	@BeforeClass
	public static void befocas() {
		WebDriver openedgedriver = openedgedriver();
		impandmin();

	}
	@AfterClass
	public static void aftcls() {
		quit();

	}
	@Before
	public void bef() {
		Date d=new Date();
		System.out.println("bef" +d);
	}
	@After
	public void aft() {
		Date d=new Date();
		System.out.println("bef" +d);
	}
	@Test
	public void test1() throws InterruptedException {
		get("https://www.flipkart.com/");
		pom_amazon p=new pom_amazon();
		clik(p.getCancel());
		clik(p.getGologin());
		sendkey(p.getEmailorphone(), "8508883453");
		sendkey(p.getPassword(), "arun8888");
		clik(p.getLogin());
        Thread.sleep(10000);
	}
	@Ignore
	@Test
	public void test2() {
		
		pom_amazon p=new pom_amazon();
		sendkey(p.getNormalserch(), "iphone11");
		clik(p.getSerchbutton());
		WebElement iphoneclk = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']"));
		clik(iphoneclk);
		getHandles(1);
		WebElement clkadto = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		clik(clkadto);
		

	}
	
	
	
	

}
