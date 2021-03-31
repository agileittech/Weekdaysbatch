package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
		FirefoxDriver f  = new FirefoxDriver();
		f.get("https://www.snapdeal.com/");
		f.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		WebElement alloffers = f.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]/a/span[2]"));
	    Actions a = new Actions(f);
	    a.moveToElement(alloffers).build().perform();
	    WebElement crocs = f.findElement(By.xpath("//*[@id=\"category1Data\"]/div[3]/div/div/p[11]/a/span"));
	    a.moveToElement(crocs).click().build().perform();
	    WebElement leftslider = f.findElement(By.xpath("//*[@id='content_wrappers']/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[1]"));
	    WebDriverWait w =  new WebDriverWait(f, 30);
	    w.until(ExpectedConditions.visibilityOf(leftslider));
	    //Thread.sleep(5000);
	    
	    a.dragAndDropBy(leftslider, 90, 0).build().perform();
	}

}
