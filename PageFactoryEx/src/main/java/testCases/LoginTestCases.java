package testCases;

import org.PageFactory.Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestCases {

	@Test
	public  void login() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/signin");
	PageFactory.initElements(driver,Login.class);
//	Login lg = new Login();
	Login.username.sendKeys("jyothishelanjimattom@gmail.com");
	Login.password.sendKeys("oppoa75");
	Login.login.click();
	
//	driver.quit();
	}
}
