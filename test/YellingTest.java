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
			String[] name = { "a" };
			String output = y.Scream(name);
			assertEquals("a is yelling", output);
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
			String[] name = { "B" };
			String output = y.Scream(name);
			assertEquals("B IS YELLING", output);
		}
		
	//R4: Two people are yelling
		@Test
		public void testTwoPeopleYelling() {
			String[] name = { "peter" , "raman" };
			String output = y.Scream(name);
			assertEquals("peter and raman is yelling", output);
		}
		
	//R5: More than two people are yelling
				@Test
				public void testMorePeopleYelling() {
					String[] name = {"raman" ,"sagar" , "you"};
					String output = y.Scream(name);
					assertEquals("raman , sagar and you is yelling", output);
				}
		
	//R6: More and Upper are yelling
				//R5: More than two people are yelling
				@Test
				public void testMoreUpperPeopleYelling() {
					String[] name = {"abc" , "DEF" ,"ghi"};
					String output = y.Scream(name);
					assertEquals("peter , RAMAN and sagar is yelling , so is RAMAN", output);
				}
		

}
