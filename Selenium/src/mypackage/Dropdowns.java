package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
		FirefoxDriver f  = new FirefoxDriver();
		f.get("http://www.echoecho.com/htmlforms11.htm");
		//f.findElement(By.name("dropdownmenu")).sendKeys("Milk");
		WebElement w = f.findElement(By.name("dropdownmenu"));
		List<WebElement> l = w.findElements(By.tagName("option"));
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getText());
		}
	}

}
