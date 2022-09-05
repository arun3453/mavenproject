package org_day1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org_day1.bass.baseclass;
import org_day2.pageobjmod.pom_facebok;

public class practic extends baseclass {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver openedgedriver = openedgedriver();
		get("https://www.facebook.com/");
		impandmin();
		
		
		pom_facebok f=new pom_facebok();
		sendkey(f.getTextuser(), "r.arun3453@gml.com");
		sendkey(f.getTextpassword(), "80566652");
		
		refresh();
		sendkey(f.getTextuser(), "r.arun3453@gmail.com");
		sendkey(f.getTextpassword(), "8056665244");
		
		Thread.sleep(2000);
		
		clik(f.getCreatenewpage());
		sendkey(f.getFirstname(), "arun");
		sendkey(f.getLasttname(), "y");
		sendkey(f.getMobileno(), "6044423444");
		sendkey(f.getPassword(), "7ha7h7da");
		selectByVisibleText(f.getDate(), "23");
		selectByVisibleText(f.getMonth(), "May");
		selectByVisibleText(f.getYear(), "1997");
		actclick(f.getMale());
		clik(f.getCreatelogbut());
		screenshot();
	}
}
