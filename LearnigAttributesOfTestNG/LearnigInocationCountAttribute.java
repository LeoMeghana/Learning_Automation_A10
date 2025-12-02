package LearnigAttributesOfTestNG;

import org.testng.annotations.Test;

public class LearnigInocationCountAttribute {
	@Test(invocationCount=1)
	public void m1()
	{
		System.out.println("m1()");
	}
     @Test(invocationCount=1)
     public void m2()
     {
    	 System.out.println("M2()");
     }
	
}
