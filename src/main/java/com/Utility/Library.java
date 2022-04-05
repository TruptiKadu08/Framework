package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	public static void custom_sendKeys(WebElement element,String value,String fiedname) {
		try {
		element.sendKeys(value);
		test.log(Status.PASS, fiedname +" => value successfully send => "+value);
		
	     }catch(Exception e) {
	    	 test.log(Status.FAIL,fiedname +" => value unable to send => "+e);
	        }
		}
		public static void  custom_click(WebElement element,String fielname) {
		  try {
			element.click();
			test.log(Status.PASS, "Click successfully =>"+fielname);
			}catch(Exception e) {
			test.log(Status.FAIL, fielname +" =Unable to click =>"+e);
				
			}
		}
		public static void custom_handleDropDown(WebElement element,String text) {
			try{
				Select select = new Select(element);
			    select.selectByVisibleText(text);
			}catch(Exception e) {
				System.out.println("unable to handle dropdown"+e);
			}
		}
	

		
		
	
	
}	



