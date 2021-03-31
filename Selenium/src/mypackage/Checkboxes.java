package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
		FirefoxDriver f  = new FirefoxDriver();
		f.get("http://www.echoecho.com/htmlforms09.htm");
		List<WebElement> l = f.findElements(By.name("Checkbox"));
		System.out.println(l.size());
		l.get(0).click();
		l.get(2).click();
		l.get(1).click();
	}

}
