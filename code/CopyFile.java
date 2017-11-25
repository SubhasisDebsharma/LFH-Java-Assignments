import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CopyFile{
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("file1.txt");
			fw = new FileWriter("file2.txt",true);
			char[] arr= new char[22];
			int charRead = 0;
			while((charRead = fr.read())!=-1){
				fw.write(charRead);
			}
			fr.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}