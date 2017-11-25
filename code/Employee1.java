import java.io.Serializable;

class Employee1 implements Serializable{
	private int empID;
	private String empName;
	private int empSalary;
	Employee1(){}
	Employee1(int empID, String empName, int empSalary){
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	void setEmpD(int empId){
		this.empID = empId;
	}
	
	void setEmpName(String empName){
		this.empName = empName;
	}
	
	void setEmpSalary(int empSalary){
		this.empSalary = empSalary;
	}
	
	int getEmpID(){return empID;}
	String getEmpName(){return empName;}
	int getEmpSalary(){return empSalary;}
}