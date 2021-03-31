package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
		FirefoxDriver f  = new FirefoxDriver();
		f.get("https://register.rediff.com/register/register.php?FormName=user_details");
		f.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Hello all");
	}

}
