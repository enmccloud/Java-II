package model;

//Nikki McCloud
//Java II  CIS175
//Week 2 Lab
public class EmpBusinessLogic {

	//Method for calculating Yearly Salary
	public double calculateYearlySalary (Employee employee) {
		double yearlySalary = 0;
		
		yearlySalary = employee.getMonthlySalary() * 12;
		
		return yearlySalary;
	}
	
	//Method for calculating Appraisal fee.
	public double calculateAppraisal (Employee employee) {
		double appraisal = 0;
		
		if (employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		
		return appraisal;
	}

	//Method for checking retirement Age.
	public boolean isRetirementAge(Employee employee) {
		boolean retirementAge;
		
		if(employee.getAge() > 65) {
			retirementAge = true;
		} else {
			retirementAge = false;
		}
		
		return retirementAge;
	}
}
