package app_code;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GCIWebdriver {

	private WebDriver driver;
	private WebDriverWait wait;
	private String baseUrl;

	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,15);
		baseUrl = "http://www.gci.com/";
	}

	public void tearDown() {
		driver.quit();
	}

	public void goToHomePage(){
		driver.get(baseUrl);
		wait.until(presenceOfAllElementsLocatedBy(By.tagName("title")));
	}

	public void clickOnWireless(){
		driver.findElement(By.cssSelector("#desktop_nav .wireless>a")).click();
	}

	public void checkPageTitle(){
		assertThat(driver.getTitle(), is("Wireless | GCI"));
		}

}
