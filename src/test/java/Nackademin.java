import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nackademin {
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
		driver.get("http://www.nackademin.se");
	}
	
	@AfterClass
	public static void afterClass() {
		driver.close();
	}

	@Test
	public void test() {
		driver.findElement(By.linkText("IT")).click();
		driver.findElement(By.id("search")).sendKeys("Testautomatiserare");
		
		driver.findElement(By.xpath("//input[@value='Sök']")).click();
	}
	
}
