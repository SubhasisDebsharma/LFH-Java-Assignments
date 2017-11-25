class Student{
	int rollno;
	String sname, course;
	static String instituteName = "ABC";
	
	public Student(int rollno, String sname, String course){
		this.rollno = rollno; this.sname = sname; this.course = course;
	}
	
	public void display(){
		System.out.println("rollno: "+rollno+" Sname: "+sname+" course: "+course+" instituteName: "+instituteName);
	}
	
	public static void main(String[] args){
		Student s = new Student(7,"Subahsis", "Science");
		s.display();
	}
}
