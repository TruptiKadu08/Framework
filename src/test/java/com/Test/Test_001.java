package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.Library;
import com.page.object.Loginpom;

public class Test_001 extends BaseClass{
	@Test
	public void verify_001(){
	 //email id
	 //pass
     //login
	 Loginpom login=PageFactory.initElements(driver, Loginpom.class);
	 
	 Library.custom_sendKeys(login.getEmailid(),excel.getStringData("Sheet1", 0, 0), "Emailid");
	 Library.custom_sendKeys( login.getPassword(),excel.getStringData("Sheet1", 0, 1), "Password");
	 Library.custom_click(login.getBtnlogin(),"Login Button");
		
             
	   	  
	}
}
	

