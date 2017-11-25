import java.io.File;
import java.util.Scanner;

class FindFile{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter thr file name with extension: ");
		String fileName = sc.next();
		File f = new File(fileName);
		if(f.exists()){
			System.out.println("File exists");
		}else{
			System.out.println("File does not exists");
		}
	}
}