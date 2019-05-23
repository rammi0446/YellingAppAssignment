import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YellingTest {
	Yelling y = new Yelling();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//R1: One Person is yelling
		@Test
		public void testOneYelling() {
			String[] name = { "peter" };
			String output = y.Scream(name);
			assertEquals("peter is yelling", output);
		}
		
	//R2: NoBody is Yelling
		@Test
		public void testNoOneYelling() {
			String[] name = { "null" };
			String output = y.Scream(name);
			assertEquals("Nobody is yelling", output);
		}
		
	//R3: UpperCase is yelling
		@Test
		public void testUpperCaseYelling() {
			String[] name = { "RAMAN" };
			String output = y.Scream(name);
			assertEquals("RAMAN IS YELLING", output);
		}
		
	//R4: Two people are yelling
		@Test
		public void testTwoPeopleYelling() {
			String[] name = { "peter" , "raman" };
			String output = y.Scream(name);
			assertEquals("peter and raman is yelling", output);
		}
		
	//R4: Two people are yelling
				@Test
				public void testMorePeopleYelling() {
					String[] name = { "peter" , "raman" ,"sagar" };
					String output = y.Scream(name);
					assertEquals("peter , raman and sagar are yelling", output);
				}
		
		

}
