class ContractEmployee extends Employee{
	String duration;
	ContractEmployee(int empno, String ename, float salary, String duration){
		super(empno, ename, salary);
		this.duration = duration;
	}
	
	public void display(){
		super.display();
		System.out.println("Duration: "+duration);
	}
	
	public static void main(String[] args){
		ContractEmployee cm = new ContractEmployee(100,"Subhasis",50000.00f,"1 year");
		cm.display();
	}
}
