package oops;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngcases {
	@Parameters({"Browser","URL"})
	@Test(groups="P0")
	public void tc1(String brow, String url) {
		System.out.println("P0 test case - Browser nane is "+brow);
		System.out.println("P0 test case - URL nane is "+url);
	}
	
	@Test(groups="P0")
	public void tc2() {
		System.out.println("P0 test case");
	}
	
	@Test(groups="P0")
	public void tc3() {
		System.out.println("P0 test case");
	}
	
	@Test(groups="P1")
	public void tc4() {
		System.out.println("P1 test case");
	}
	
 
}
