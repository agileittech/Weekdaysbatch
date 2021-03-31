package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
		FirefoxDriver f  = new FirefoxDriver();
		f.get("http://www.echoecho.com/javascript4.htm");
		f.findElement(By.name("B1")).click();
		System.out.println(f.switchTo().alert().getText());
		f.switchTo().alert().sendKeys("Hello");
		f.switchTo().alert().accept();
	}

}
