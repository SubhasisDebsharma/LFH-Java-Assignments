class Student{
	String studentName = "Subhasis", grade;
	int mathMarks = 70, scienceMarks = 80, socialMarks = 80, englishMarks = 80;
	int teleguMarks = 85, hindiMakrs = 88;
	int totalMarks;
	float average;
	
	void calculateTotalMarks(){
		totalMarks = mathMarks+scienceMarks+socialMarks+englishMarks+teleguMarks+hindiMakrs;
	}
	
	void calculateAverageMarks(){
		average=totalMarks/6;
	}
	
	void calculateGrade(){
		if(average >= 80){
			grade = "Distinction";
		}
		else if(average >= 60 && average < 80){
			grade = "First class";
		}
		else if(average >= 50 && average < 60){
			grade = "second class";
		}
		else if(average >= 40 && average < 50){
			grade = "Third class";
		}
		else{
			grade = "Fail";
		}
	}
	
	void displayStudentDetails(){
		System.out.println("tudnt Name : "+studentName);
		System.out.println("Maths marks"+mathMarks);
		System.out.println(grade);
}
}
class StudentTest{
	public static void main(String[] a){
		Student s = new Student();
		s.calculateTotalMarks();
		s.calculateAverageMarks();	
		s.calculateGrade();
		s.displayStudentDetails();
	}
}

