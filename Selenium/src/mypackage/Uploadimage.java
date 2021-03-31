package mypackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploadimage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
		FirefoxDriver f  = new FirefoxDriver();
		f.get("https://imgbb.com/");
		f.findElement(By.cssSelector("#home-cover-content > div.home-buttons > a")).click();
		ProcessBuilder pb = new ProcessBuilder("C:\\Filehandling\\UploadImage.exe","C:\\Users\\sivar\\Pictures\\Camera Roll\\Agile IT Tech Logo.JPG");
	    pb.start();
	}

}
