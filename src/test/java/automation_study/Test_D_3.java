package automation_study;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_D_3 {

	
	@Test
	
	public void test_3() {
		
		SoftAssert soft = new SoftAssert ();
		
		System.out.println("email id enter ");
		System.out.println("password login");
		System.out.println("login click");
		
		String expected = "BugSpotter";
		String actual = "BugSpotter";
		
		soft.assertEquals(actual, expected);
		
		System.out.println("test done");
		soft.assertAll();
	}
	
}
