import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	
	private GradeBook book1;
	private GradeBook book2;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		book1 = new GradeBook(5);
	    book1.addScore(50.0);
	    book1.addScore(82.0);
	      
	    book2 = new GradeBook(5);
	    book2.addScore(60.0);
	    book2.addScore(72.0);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		book1 = null;
	    book2 = null;
	}

	@Test
	void testGradeBook() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore()
	{
		
		assertTrue((book1.toString()).equals("50.0 82.0 "));
	    assertTrue((book2.toString()).equals("60.0 72.0 "));
	      
	    assertEquals(2, book1.getScoreSize(), 0.001);
	    assertEquals(2, book2.getScoreSize(), 0.001);
	}

	@Test
	void testSum()
	{
		assertEquals(132.0, book1.sum(), .0001);
	    assertEquals(132.0, book2.sum(), .0001);
	}

	@Test
	void testMinimum() 
	{
		 assertEquals(50.0, book1.minimum(), .001);
	     assertEquals(60.0, book2.minimum(), .001);
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(82.0, book1.finalScore(), .0001);
	    assertEquals(72.0, book2.finalScore(), .0001);
	}

}
