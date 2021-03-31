package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Countinglinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
		FirefoxDriver f  = new FirefoxDriver();
		f.get("http://shopping.rediff.com");
		WebElement box = f.findElement(By.id("popular_cat"));
		List<WebElement> l = box.findElements(By.tagName("a"));
		System.out.println(l.size());
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getText());
		}
	}
// Click on any link of a webpage
// Get the text from the link clicked 
}
