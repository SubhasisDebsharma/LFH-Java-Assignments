import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class CreateEmployee{
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1(101,"asa",55000);
		Employee1 emp2 = new Employee1(102,"bssfa",28000);
		Employee1 emp3 = new Employee1(103,"vegaa",34000);
		Employee1 emp4 = new Employee1(104,"etht",26000);
		Employee1 emp5 = new Employee1(105,"sted",25400);
		
		Collection empStore = new HashSet();
		
		empStore.add(emp1);
		empStore.add(emp2);
		empStore.add(emp3);
		empStore.add(emp4);
		empStore.add(emp5);
		
		Iterator itr = empStore.iterator();
		
		while(itr.hasNext()){
			Employee1 tmp = (Employee1)itr.next();
			System.out.println("id: "+tmp.getEmpID()+" : name: "+tmp.getEmpName()+" : Salary :"+tmp.getEmpSalary());
		}
	}
}