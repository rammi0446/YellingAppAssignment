import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YellingTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//R1: One Person is yelling
		@Test
		public void testOneYelling() {
			Yelling y = new Yelling();
		
			String name = "peter" ;
			String output = y.Scream(name);
			assertEquals("peter is yelling", output);
		}


}