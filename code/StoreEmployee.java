import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;
class StoreEmployee{
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1(101,"Rajesh",25600);
		Employee1 emp2 = new Employee1(102,"Sham",35000);
		Employee1 emp3 = new Employee1(103,"Atanu",45700);
		try{
			FileOutputStream fos = new FileOutputStream("employeeStore.ser",true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp1);
			oos.writeObject(emp2);
			oos.writeObject(emp3);
			fos.close();
			oos.close();
			FileInputStream fin = new FileInputStream("employeeStore.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			Employee1 emp;
			emp = (Employee1)ois.readObject();
			System.out.println(emp.getEmpName());
			emp = (Employee1)ois.readObject();
			System.out.println(emp.getEmpName());
			emp = (Employee1)ois.readObject();
			System.out.println(emp.getEmpName());
		}catch(Exception e){
			
			System.out.println("******"+e.getMessage());
			e.printStackTrace();
		}
	}
}