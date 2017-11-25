abstract class Student{
	String name, standard;
	public Student(String name, String standard){
		this.name = name;
		this.standard = standard;
	}
	
	abstract float getPercentage();
	static int getTotalNumberOfStudent(){return 0;}
}

class ScienceStudent extends Student{
	int physicsMarks,mathsMarks,chemistryMarks;
	static int noOfStudent = 0;
	ScienceStudent(String name, String standard, int physicsMarks, int mathsMarks,int chemistryMarks){
		super(name, standard);
		this.physicsMarks = physicsMarks;
		this.mathsMarks = mathsMarks;
		this.chemistryMarks = chemistryMarks;
		noOfStudent++;
	}
	
	float getPercentage(){
		return physicsMarks+mathsMarks+chemistryMarks/3.00f;
	}
	
	static int getTotalNumberOfStudent(){
		return noOfStudent; 
	}
}

class HistoryStudent extends Student{
	int historyMarks,civicsMarks;
	static int noOfStudent = 0;
	HistoryStudent(String name, String standard, int historyMarks, int civicsMarks){
		super(name, standard);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
		noOfStudent++;
	}
	
	float getPercentage(){
		return historyMarks+civicsMarks/2.00f;
	}
	
	static int getTotalNumberOfStudent(){
		return noOfStudent; 
	}
}

class AllStudents{
	public static void main(String[] args){
		ScienceStudent ss1 = new ScienceStudent("aaa","3rd",30,40,50);
		ScienceStudent ss2 = new ScienceStudent("abb","4th",50,60,30);
		System.out.println(ss1.getPercentage());
		System.out.println(ss1.getTotalNumberOfStudent());
		System.out.println(ss2.getPercentage());
		System.out.println(ss2.getTotalNumberOfStudent());
		HistoryStudent hs1 = new HistoryStudent("aaa","3rd",30,40);
		HistoryStudent hs2 = new HistoryStudent("abb","4th",50,60);
		System.out.println(hs1.getPercentage());
		System.out.println(hs1.getTotalNumberOfStudent());
		System.out.println(hs2.getPercentage());
		System.out.println(hs2.getTotalNumberOfStudent());
		}
}
