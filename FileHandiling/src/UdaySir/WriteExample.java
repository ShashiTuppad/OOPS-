package UdaySir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
	public static void main(String[] args) {
		File f=new File("j:/Student.txt");
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(f);
			fw.write("Jspides");
			fw.flush();
			System.out.println("Data Stored");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
