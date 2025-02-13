package RetrylogicDemo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Testcasesexample {
	
	@Test(retryAnalyzer =RetryAnalyser.class)
		public void testcase1() {
			Assert.assertTrue(false);//testcase failed 
		}
	@Test
	public void testcase2() {
		Assert.assertTrue(false);//testcase failed 
	}
	@Test
	public void testcase3() {
		Assert.assertTrue(true);//testcase failed 
	}
}
