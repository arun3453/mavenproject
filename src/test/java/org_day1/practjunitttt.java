package org_day1;


import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import org_day1.bass.baseclass;
import org_day2.pageobjmod.pom_facebok;

public class practjunitttt extends baseclass {
	
	@BeforeClass
	public static void befclass() {
		openedgedriver();
		impandmin();

	}
	
	@AfterClass
	public static void aftclass() {
		quit();
	}
	
	@Before
	public void bef() {
	    Date d=new Date();
		System.out.println("before..." +d);

	}
	@After
	public void aft() {
		
		Date d=new Date();
		System.out.println("after..." +d);

	}
	@Test
	public void tes() throws InterruptedException {
		
		get("https://www.facebook.com/");
		Assert.assertTrue("verify url",getcurrenturl().contains("facebook"));
		pom_facebok p=new pom_facebok();
		sendkey(p.getTextuser(), "r.arun3453@gmail.com");
		Assert.assertEquals("verify username","r.arun3453@gmail.com", getattributeval(p.getTextuser()));
		sendkey(p.getTextpassword(), "8056665244");
		Assert.assertEquals("verify pass","8056665244", getattributeval(p.getTextpassword()));
		clik(p.getClick());
		Thread.sleep(5000);
		Assert.assertTrue("after login",getcurrenturl().contains("facebook"));
	}
	
	@Test
	public void tes2() {
		get("https://www.facebook.com/");
		Assert.assertTrue(getcurrenturl().contains("facebook"));
		pom_facebok p=new pom_facebok();
		clik(p.getCreatenewpage());
		sendkey(p.getFirstname(), "arun");
		sendkey(p.getLasttname(), "r");
		sendkey(p.getMobileno(), "56738949");
		sendkey(p.getPassword(), "13578");
		selectByVisibleText(p.getDate(), "23");
		selectByVisibleText(p.getMonth(), "May");
		selectByVisibleText(p.getYear(), "1997");
		actclick(p.getMale());
		String getcurrenturl = getcurrenturl();
		System.out.println(getcurrenturl);
		String getattributeval = getattributeval(p.getFirstname());
		System.out.println(getattributeval);
	}
	@Ignore
	@Test
	private void test3() {
		System.out.println("gokla");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}