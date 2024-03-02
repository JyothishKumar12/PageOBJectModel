package org.PageFactory.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;

public class Login {
//login
//email
//password 
//submit
	@FindBy(name = "email")
public static WebElement username;
	
	@FindBy(name = "password")
	public static WebElement password;	
	
	@FindBy(xpath="(//*[.='LOGIN'])[2]")
	public static WebElement login;
	
//	
//public static WebElement setEmail(ChromeDriver driver) {
//	return driver.findElementByName("email");
//}
//
//public static WebElement setPassword(ChromeDriver driver) {
//	return driver.findElementByName("password");
//	
//}
//
//public static WebElement clickLogin(ChromeDriver driver) {
//	return driver.findElementByXPath("(//*[.='LOGIN'])[2]");
//}


}

