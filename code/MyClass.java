class Employee{
	String name;
	int empid, salary;
	public Employee(String name, int empid, int salary){
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	void setName(String name){
		this.name = name;
	}
	void setEmpid(String name){
		this.empid = empid;
	}
	void setSalary(String name){
		this.salary = salary;
	}
	
	String getName(){
		return name;
	}
	int getEmpid(){
		return empid;
	}
	int getSalary(){
		return salary;
	}
}

class Manager extends Employee{
	String type = "Manager";
	Manager(String name, int empid, int salary, String type){
		super(name,empid,salary);
		this.type = type;
	}
	String getType(){
		return type;
	}
	
}

class Clerk extends Employee{
	int speed, accuracy;
	
	Clerk(String name, int empid, int salary, int speed, int accuracy){
		super(name,empid,salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}
	
	int getSpeed(){
		return speed;
	}
	int getAccuracy(){
		return accuracy;
	}
}

class MyClass{
	public static void main(String[] args){
		Manager m = new Manager("abc",101,40000,"System Manager");
		Clerk c = new Clerk("kdc",303,15000,4,3);
		System.out.println(m.getName()+" "+m.getEmpid()+" "+m.getSalary());
		System.out.println(c.getName()+" "+c.getEmpid()+" "+c.getSalary());
		System.out.println(m.getType());
		System.out.println(c.getSpeed());
		System.out.println(c.getAccuracy());
	}
}
