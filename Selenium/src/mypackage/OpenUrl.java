package mypackage;


import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\AgileITweekdays\\Selenium\\chromedriver.exe");
DesiredCapabilities d =new DesiredCapabilities();
d.setCapability("172.18.19.111", Platform.WIN10);
d.setCapability(BrowserType.CHROME, "C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe");
ChromeDriver c = new ChromeDriver(); //configures driver for chrome browser
//c.get("https://mail.yahoo.com");
c.navigate().to("https://mail.yahoo.com");
c.close();
//webdriver.gecko.driver  --> Firefox
//webdriver.edge.driver   --> Edge
//webdriver.opera.drive   --> Opera
	}

}
