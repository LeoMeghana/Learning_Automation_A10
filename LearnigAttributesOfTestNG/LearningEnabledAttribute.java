package LearnigAttributesOfTestNG;

import org.testng.annotations.Test;

public class LearningEnabledAttribute {
	@Test(enabled=true)
	public void study()
	{
		System.out.println("Study mode");
	}
	@Test(enabled=false)
	public void mobile()
	{
		System.out.println("Mobile Mode");
	}

}
