package tests;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import model.Scholarship;
import model.ScholarshipLogic;

//Test Class
public class TestScholarshipLogic {
	
	ScholarshipLogic schLog = new ScholarshipLogic();
	Scholarship scholarship = new Scholarship ("Nikki McCloud");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateOutOfPocketCost() {
		scholarship.setScholarshipTotal(3000.0);
		double outOfPocketCost = schLog.calculateOutOfPocketCost(scholarship);
		assertEquals(1000.0, outOfPocketCost, 0.0);
	}
	
	@Test
	public void testIsFullTime() {
		scholarship.setCourseCredits(10);
		assertFalse(schLog.isFullTimeStudent(scholarship));
	}
	
	@Test
	public void testIsPartTime() {
		scholarship.setCourseCredits(6);
		assertTrue(schLog.isFullTimeStudent(scholarship));
	}

}
