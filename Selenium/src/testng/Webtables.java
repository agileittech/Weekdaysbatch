package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webtables {
	FirefoxDriver f;
	String searchstring = "Cipla";
@BeforeTest
public void initialization() {
		System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
		f  = new FirefoxDriver();
}
@Test(priority = 1)
public void openurl() {
		f.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
        String TitleofWebpage =  f.getTitle();
        String ExpectedTitle = "Daily Gainers: BSE, NSE, Stock quotes, share market, stock market, stock tips: Rediff Stocks";
        Assert.assertEquals(TitleofWebpage, ExpectedTitle);
}
@Test(priority = 2,dependsOnMethods = "openurl")
public void countcompanynames() {
		WebDriverWait w =  new WebDriverWait(f, 30);
		List<WebElement> table =  f.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> CP =  f.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		w.until(ExpectedConditions.visibilityOfAllElements(table));
		int noofcompanynames = table.size();
		Assert.assertEquals(noofcompanynames, 119);
}
@Test(priority = 3,dependsOnMethods = "openurl")
public void searchcompanyname() {
	String Price = ""; 
	List<WebElement> table =  f.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
	List<WebElement> CP =  f.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
	for(int i=0;i<table.size();i++) {
	   if(table.get(i).getText().equals(searchstring)) {
		Price = CP.get(i).getText();
		Assert.assertEquals(Price, "792.65");    
	   }
	  
   }
}
	@AfterTest
	public void closebrowser() {
		f.close();
	}
	
	}


