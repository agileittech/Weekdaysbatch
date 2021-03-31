package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
		FirefoxDriver f  = new FirefoxDriver();
		f.get("https://www.paytm.com");
		f.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div/div[2]/div[4]/div")).click();
		f.switchTo().frame(0);
		f.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div/div[1]/div/div/div[2]/span")).click();
		f.switchTo().defaultContent();
		f.switchTo().frame(1);
		f.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div/div[2]/qr-code-login/div/div[2]/div")).getText();
		f.switchTo().defaultContent();
	}

}
