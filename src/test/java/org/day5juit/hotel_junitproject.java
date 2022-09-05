package org.day5juit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org_day1.bass.baseclass;
import org_day2.pageobjmod.pomjhotel;

public class hotel_junitproject extends baseclass {
	
	@BeforeClass
	public static void befclas() {
		openedgedriver();
		impandmin();

	}
	@AfterClass
	public static void aftclass() {
		//quit();

	}
	@Before
	public void bef() {
		Date d=new Date();
		System.out.println("befote........." +d);

	}
	@After
	public void aft() {
		Date d=new Date();
		System.out.println("befote........." +d);
	}
	@Test
	public void test1() throws InterruptedException {
		get("https://adactinhotelapp.com/");
		Assert.assertTrue(getcurrenturl().contains("adactinhotelapp"));
		pomjhotel p=new pomjhotel();
		clik(p.getNewuserregister());
		sendkey(p.getNewusername(), "babakumar");
		Assert.assertEquals("Verify username","babakumar", getattributeval(p.getNewusername()));
		sendkey(p.getNewpassword(), "4676538");
		sendkey(p.getRe_password(), "4676538");
		sendkey(p.getFull_name(), "bababasker");
		sendkey(p.getEmail_add(), "r.arun3453@gmail.com");
		Thread.sleep(30000);
		actclick(p.getTnc_box());
		clik(p.getNewSubmit());		
		
		
		
	}

}
