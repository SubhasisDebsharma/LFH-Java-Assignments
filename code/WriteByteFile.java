package practice2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteByteFile {

	public static void main(String[] args) {
		FileOutputStream opStream = null;
		
		try {
			String strContent = "This example shows how to write byte content in a file.";
			byte[] byteContent = strContent.getBytes();
			File myFile = new File("MytextFile.txt");
			if(!myFile.exists()){
				myFile.createNewFile();
			}
			opStream = new FileOutputStream(myFile);
			opStream.write(byteContent);
			opStream.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (opStream!=null) {opStream.close();}
			} catch (Exception e2) {}
		}

	}

}
