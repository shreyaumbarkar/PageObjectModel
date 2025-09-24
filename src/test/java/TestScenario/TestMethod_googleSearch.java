package TestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class TestMethod_googleSearch {
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		// Set 10 seconds implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}
	@Test
	public void searchOperation()
	{
		//method level obj
		GoogleSearch page = new GoogleSearch(driver);	
		page.searchgoogle("facebook");
		
	}

}
