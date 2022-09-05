package org_day2.pageobjmod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import org_day1.bass.baseclass;

public class pom_facebok extends baseclass {
	
	public pom_facebok(){
		PageFactory.initElements(driver, this);
	}
	
	//email register
	
	
	@FindBys({@FindBy(id="email"),  @FindBy(xpath="//input[@name='email']")  })
	private WebElement textuser;
	
	
	@FindAll({@FindBy(id="pass"), @FindBy(xpath="//input[@name='pass']")   })
	private WebElement textpassword;
	@FindBy(name="login")
    private WebElement click;
	
	
	//email creat a new page
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement createnewpage;
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement lasttname;
	@FindBy(name="reg_email__")
	private WebElement mobileno;
	@FindBy(name="reg_passwd__")
	private WebElement password;
	@FindBy(name="birthday_day")
	private WebElement date;
	@FindBy(name="birthday_month")
	private WebElement month;
	@FindBy(name="birthday_year")
	private WebElement year;
	@FindBy(xpath="//label[text()='Male']")
	private WebElement male;
	@FindBy(xpath="//button[text()='Sign Up']")
	private WebElement createlogbut;
	
	
	
	public WebElement getCreatelogbut() {
		return createlogbut;
	}
	public WebElement getMale() {
		return male;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLasttname() {
		return lasttname;
	}
	public WebElement getMobileno() {
		return mobileno;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getCreatenewpage() {
		return createnewpage;
	}
	public WebElement getTextuser() {
		return textuser;
	}
	public WebElement getTextpassword() {
		return textpassword;
	}
	public WebElement getClick() {
		return click;
	}

}
