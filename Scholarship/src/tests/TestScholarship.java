package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Scholarship;

public class TestScholarship {

	Scholarship scholarship = new Scholarship ("Nikki McCloud", 3000, 12);
	
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void messageIsNull() {
		System.out.println();
		assertNotNull(scholarship.printMessage());
	}
	
	@Test
	public void testGeneratedToString() {
		assertEquals("Scholarship [studentName=Nikki McCloud, scholarshipTotal=3000.0, courseCredits=12]", scholarship.toString());
	}
}
