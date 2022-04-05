package com.page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement Emailid;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement btnlogin;

	public WebElement getEmailid() {
		return Emailid;
	}

	
	public WebElement getPassword() {
		return Password;
	}

	
	public WebElement getBtnlogin() {
		return btnlogin;
	}

	

}
