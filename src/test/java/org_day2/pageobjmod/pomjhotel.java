package org_day2.pageobjmod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org_day1.bass.baseclass;

public class pomjhotel extends baseclass{
	
	public pomjhotel() {
		PageFactory.initElements(driver, this);
	}
    @FindBy(name="username")
	private WebElement username; 
	@FindBy(name="password")
	private WebElement password; 
	@FindBy(name="login")
	private WebElement login; 
	
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement newuserregister; 
	
	
	@FindBy(name="username")
	private WebElement newusername; 
	@FindBy(name="password")
	private WebElement newpassword; 
	@FindBy(name="re_password")
	private WebElement re_password; 
	@FindBy(name="full_name")
	private WebElement full_name; 
	@FindBy(name="email_add")
	private WebElement email_add; 
	@FindBy(name="tnc_box")
	private WebElement tnc_box;
	@FindBy(name="Submit")
	private WebElement newSubmit;
	
	
	
	
	public WebElement getNewSubmit() {
		return newSubmit;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getNewuserregister() {
		return newuserregister;
	}
	public WebElement getNewusername() {
		return newusername;
	}
	public WebElement getNewpassword() {
		return newpassword;
	}
	public WebElement getRe_password() {
		return re_password;
	}
	public WebElement getFull_name() {
		return full_name;
	}
	public WebElement getEmail_add() {
		return email_add;
	}
	public WebElement getTnc_box() {
		return tnc_box;
	} 
	
}
