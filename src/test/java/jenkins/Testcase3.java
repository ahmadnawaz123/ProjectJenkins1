package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class Testcase3 {

	@Test
	public void tc3()
	{
		Reporter.log("Hello Java",true);
	}
}
