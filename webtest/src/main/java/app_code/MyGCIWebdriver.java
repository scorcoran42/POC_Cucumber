package app_code;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyGCIWebdriver {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private String baseUrl;

	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,15);
		baseUrl = "https://login.gci.com/";
	}

	public void tearDown() {
		driver.quit();
	}

	public void goToMyGCI(){
		driver.get(baseUrl);
		wait.until(presenceOfAllElementsLocatedBy(By.tagName("title")));
	}
	public void goodUsername() {
		driver.findElement(By.id("username")).sendKeys("scorcorangci");
	}
	public void goodPassword() {
		driver.findElement(By.id("password")).sendKeys("sc4971GCI");
	}
	public void badPassword() {
		driver.findElement(By.id("password")).sendKeys("badness");
	}
	public void clickLogin() {
		driver.findElement(By.id("login")).click();
	}
	public void checkMyGciPageTitle(){
		assertThat(driver.getTitle(), is("GCI Current Customers |Pay Your Bill |View Usage |Manage Accounts | GCI"));
	}
	public void checkLoginError(){
		assertThat(driver.findElement(By.className("error")).getText(), is("We didn't recognize your MyGCI login and/or your password. Please try again..."));
	}
	public void checkNoPasswordError(){
		assertThat(driver.findElement(By.cssSelector("label[class=error]")).getText(), is("Please enter your password."));
	}
}
