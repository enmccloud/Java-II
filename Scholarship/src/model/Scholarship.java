package model;

//Nikki McCloud
//Java II  CIS175
//Week 2 Assessment
public class Scholarship {

		//Declaring variables
		private String studentName;
		private double scholarshipTotal;
		private int courseCredits;
		
		//Default Constructor
		public Scholarship() {
		}

		//Parameterized Constructor
		public Scholarship(String studentName, double scholarshipTotal, int courseCredits) {
			this.studentName = studentName;
			this.scholarshipTotal = scholarshipTotal;
			this.courseCredits = courseCredits;
		}

		public Scholarship(String studentName) {
			this.studentName = studentName;
		}

		//Getters and Setters
		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public double getScholarshipTotal() {
			return scholarshipTotal;
		}

		public void setScholarshipTotal(double scholarshipTotal) {
			this.scholarshipTotal = scholarshipTotal;
		}

		public int getCourseCredits() {
			return courseCredits;
		}

		public void setCourseCredits(int courseCredits) {
			this.courseCredits = courseCredits;
		}

		//Generated ToString
		@Override
		public String toString() {
			return "Scholarship [studentName=" + studentName + ", scholarshipTotal=" + scholarshipTotal
					+ ", courseCredits=" + courseCredits + "]";
		}
		
		//Method to print message. 
		public String printMessage() {
			System.out.println();
			return "Congratulations on your scholarship!";
		}	
}


