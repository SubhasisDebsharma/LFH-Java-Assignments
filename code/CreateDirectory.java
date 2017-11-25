import java.io.File;

class CreateDirectory{
	public static void main(String[] args) {
		File f = new File("MyFolder");
		f.mkdir();
		System.out.println("Directory");
	}
}