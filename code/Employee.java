class Employee{
	int empno;
	String ename;
	float salary;
	public Employee(){}
	public Employee(int empno, String ename, float salary){
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	
	public void display(){
		System.out.println("Empno: "+empno+"; Ename: "+ename+"; Salary: "+salary);
	}
	
	public static void main(String[] args){
		Employee e = new Employee(100,"Subhasis",30000.00f);
		e.display();
	}
}
