package UdaySir;
import java.io.*;
import java.util.Date;

public class ReadDemo {
	public static void main(String[] args) {
		File f=new File("Student.txt");
		try {
			FileReader fr=new FileReader(f);
			int x=fr.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=fr.read();
			}
		}
			catch(Exception e) {
				e.fillInStackTrace();
			}
		long milliseconds= f.lastModified();
		Date d=new Date(milliseconds);
		System.out.println(d);
		}
	


	}


