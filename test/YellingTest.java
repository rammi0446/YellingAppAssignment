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
			String output = y.Scream("peter");
			assertEquals("peter is yelling", output);
		}
		
	//R2: NoBody is Yelling
		@Test
		public void testNoOneYelling() {
			Yelling y = new Yelling();
			String output = y.Scream("null");
			assertEquals("Nobody is yelling", output);
		}

}
