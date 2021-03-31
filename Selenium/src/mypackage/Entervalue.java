package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Entervalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
FirefoxDriver f  = new FirefoxDriver();
f.get("https://login.yahoo.com");
f.findElement(By.cssSelector("#login-username")).sendKeys("Hello HI");
f.findElement(By.id("login-signin")).click();
	}

}
