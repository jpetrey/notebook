package edu.bgsu.notebook.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * To run these, right click on ExampleTests.java and choose Run As -> JUnit Test.
 * @author Chance Ackley <achance@falcon.bgsu.edu>
 */
public class ExampleTests 
{

	/**
	 * I sure hope this test doesn't ever fail.
	 * 
	 * Important things to notice:  The @Test annotation, which denotes a JUnit test method, and the Assert.fail() method call, which
	 * gets called when the test fails.  That's really all there is to it.
	 */
	@Test
	public void testTwoPlusTwoEqualsFour()
	{
		// To test something, we use cases where we know for sure what the result should be.
		int known_correct_answer = 4;
		
		// Then we just check that everything is as we expect.  If not, call the fail() method.
		if ( 2 + 2 != known_correct_answer )
			Assert.fail("2 + 2 not equal to 4!  Call George Orwell!");
	}
}