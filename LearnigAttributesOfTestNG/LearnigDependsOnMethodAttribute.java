package LearnigAttributesOfTestNG;

import org.testng.annotations.Test;

public class LearnigDependsOnMethodAttribute {
	
	@Test(dependsOnMethods="parent")
	public void child()
	{
		System.out.println("We are Childrens");
	}
	@Test
	public void parent()
	{
		System.out.println("we parents");
	}

}
