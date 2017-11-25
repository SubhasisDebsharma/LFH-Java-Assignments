import java.util.*;
class Employee{
	private String ename;
	private int eid;

	Employee(int eid, String ename){
		this.eid = eid;
		this.ename = ename;
	}
	
	String getEname() {return ename;}
	
	int getEid() {return eid;}
}

class EmployeeNotFoundException extends Exception{
	EmployeeNotFoundException(){
		super("***Employee not found***");
	}
}

class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> arremp = new ArrayList<Employee>();
		int i = 3;
		while(i!=0){
			System.out.println("Enter Ename: ");
			String ename = sc.next();
			System.out.println("Enter Eid: ");
			int eid = sc.nextInt();
			Employee em = new Employee(eid,ename);
			arremp.add(em);
			i--;
		}
		System.out.println("Enter Eid to find");
		int feid = sc.nextInt();
		Iterator itr= arremp.iterator();
		
		while(itr.hasNext()){
			Employee emp = (Employee)itr.next();
			if(emp.getEid() == feid){
				System.out.println(emp.getEid()+" "+emp.getEname());
			}
		}
	}
}
