package LearnigAttributesOfTestNG;

import org.testng.annotations.Test;

public class LearnigPriorityAttribute {
	
	@Test(priority=1)
	public void inSide()
	{
		System.out.println("Inside");
	}
	@Test(priority=-2)
	public void outSide()
	{
		System.out.println("OutSide");
	}

}
