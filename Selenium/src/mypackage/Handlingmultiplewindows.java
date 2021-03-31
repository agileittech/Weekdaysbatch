package mypackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingmultiplewindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
		FirefoxDriver f  = new FirefoxDriver();
		f.get("http://www.echoecho.com/htmllinks10.htm");
		String Mainwindow = f.getWindowHandle();
		f.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/div/a/span")).click();
		Thread.sleep(10000);
		Set<String> s = f.getWindowHandles();
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			String childs  = i.next();
			if(!Mainwindow.equalsIgnoreCase(childs))
			{
				
				f.switchTo().window(childs).findElement(By.id("header-signin-link")).click();
				f.switchTo().window(Mainwindow).close();
			}
		}
	}

}
