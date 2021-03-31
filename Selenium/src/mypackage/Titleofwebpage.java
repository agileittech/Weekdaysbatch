package mypackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Titleofwebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
FirefoxDriver f = new FirefoxDriver();
f.get("https://mail.yahoo.com");
System.out.println(f.getTitle());
f.close();
	}

}
