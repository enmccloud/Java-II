package model;

//Nikki McCloud
//Java II  CIS175
//Week 2 Assessment
public class ScholarshipLogic {

	//Method for finding Year Scholarship amount.
	public double calculateYearlyScholarship(Scholarship scholarship) {
		double fullYearScholarship = 0;
		
		fullYearScholarship = scholarship.getScholarshipTotal() * 12;
		
		return fullYearScholarship;
	}
	
	//Method for finding student out of pocket cost.
	public double calculateOutOfPocketCost(Scholarship scholarship) {
		double outOfPocketCost = 0;
		
		if(scholarship.getScholarshipTotal() < 2500) {
			outOfPocketCost = 500;
		} else {
			outOfPocketCost = 1000;
		}
		
		return outOfPocketCost;
	}
	
	//Method for determining if student is full or part time.
	public boolean isFullTimeStudent(Scholarship scholarship) {
		boolean fullTime;
		
		if(scholarship.getCourseCredits() < 9) {
			fullTime = true;
		} else {
			fullTime = false;
		}
		
		return fullTime;
	}
}
