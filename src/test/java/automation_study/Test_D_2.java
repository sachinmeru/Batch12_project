package automation_study;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_D_2 {

	
	@Test
	
	public void verify_test_1() {
		System.out.println("email id enter ");
		System.out.println("password login");
		System.out.println("login click");
		
		String expected = "BugSpotter";
		String actual = "BugSpotter";
		
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("Testing done");
		

	}
	
	
}
