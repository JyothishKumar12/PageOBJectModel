package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrwsrLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=iWRDB-EDmE4&list=PL699Xf-_ilW6vI9FHmePi1TvKyzYATgXi&index=13");
		driver.manage().window().maximize();
		driver.quit();
	}
}
