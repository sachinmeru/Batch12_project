import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	

		WebDriver driver;
		@BeforeMethod
		
	public void test1()  {
			
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver ();
		driver.get("https://valmet.sharepoint.com/sites/flow-intranet");
		driver.manage().window().maximize();
		
		}
		
		
		@AfterMethod 
		public void teardown() {
			
		driver.close();
		}
		
		
		
		
	}

  
