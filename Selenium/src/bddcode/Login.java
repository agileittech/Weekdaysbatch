package bddcode;




import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	FirefoxDriver f;
@Before
public void precondition() {
	System.setProperty("webdriver.gecko.driver", "C:\\AgileITweekdays\\Selenium\\geckodriver.exe");
	f  = new FirefoxDriver();
}
@Given ("A URL to open for login")
public void open_url() {
	f.get("https://login.yahoo.com");
	
}
@When ("URL is opened successfully")
public void url_openend_successfully(){
String actualtitle = f.getTitle();
Assert.assertEquals(actualtitle, "Yahoo");

}
@Then ("Enter username and password to login into account")
public void enter_username_password() {
	f.findElement(By.cssSelector("#login-username")).sendKeys("Hello HI");
	
}
@After
public void closebrowser() {
	f.close();
}
@And("Click on a loginbutton")
public void click_on_login() {
	f.findElement(By.name("signin")).click();
}
}
