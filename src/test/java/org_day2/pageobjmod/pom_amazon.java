package org_day2.pageobjmod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org_day1.bass.baseclass;

public class pom_amazon extends baseclass {
	
	public pom_amazon() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Login']")
	private WebElement gologin;
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement emailorphone;
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement cancel;
	
	//after login
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement normalserch;
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement serchbutton;
	
	
	
	
	
	
	public WebElement getGologin() {
		return gologin;
	}
	public WebElement getEmailorphone() {
		return emailorphone;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getNormalserch() {
		return normalserch;
	}
	public WebElement getSerchbutton() {
		return serchbutton;
	}
	
	

}
