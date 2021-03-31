package mypackage;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandling {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
		FirefoxDriver f  = new FirefoxDriver();
		f.get("http://www.echoecho.com/htmllinks10.htm");
		String handle_id = f.getWindowHandle();
		f.switchTo().window(handle_id).findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/div/a/span")).click();
		f.switchTo().window(handle_id).close();
		
		
		
	}

}
