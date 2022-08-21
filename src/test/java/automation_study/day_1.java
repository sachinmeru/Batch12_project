package automation_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.2.3");
driver.manage().window().maximize();
Thread.sleep(3000);

driver.close();
		
		
		
		
	}

}
