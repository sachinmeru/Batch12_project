import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_NG1 extends BaseTest {
     
	
	
	@Test (priority=2)
	public void test_01() {
		System.out.println("test 1");
		
	}
	@Test (priority =1)
	public void test_02() {
		System.out.println("test 12");
		
	}
	@Test (priority=3)
	public void test_03() {
		System.out.println("test 13");
		
	}
	@Test (priority=4)
	public void test_04() {
		System.out.println("test 14");
		
	}
	
}

