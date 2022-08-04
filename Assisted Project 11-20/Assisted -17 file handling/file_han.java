// 3.7.2 Writing a program in Java to create a file
// 3.7.3 Writing a program in Java to read a file
// 3.7.4 Writing a program in Java to update a file
// 3.7.5 Writing a program in Java to delete a file
import java.io.*;
import java.nio.;
import java.util.;

public class file_han{
	void write_append() {
		char[] s =new char[150];
		try {
			DataInputStream ob= new DataInputStream(System.in);
			FileOutputStream ft=new FileOutputStream(C:\\Users\\Anshu\\OneDrive\\Desktop\\Java_fsd\\Assisted Project 11-20\\Assisted -17 file handling\\phase1.txt,true);
			BufferedOutputStream obj=new BufferedOutputStream(ft,1024);
			System.out.println(Enter Acitvies to end enter #);
			char c;
			while((c=(char)ob.read())!='#'){
				obj.write(c);
			}
			obj.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void read(){
		char[] s =new char[300];
		try {
		
			
			FileReader ob=new FileReader(C:\\Users\\Anshu\\OneDrive\\Desktop\\Java_fsd\\Assisted Project 11-20\\Assisted -17 file handling\\phase1.txt);
			
			System.out.println(SuccessFully  Stored Data );
			ob.read(s);
			System.out.println(Stored Data  IS);
			System.out.println(s);
			ob.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		 TODO Auto-generated method stub		
		file_han fh=new file_han();
		fh.write_append();
		fh.read();
		
	}

}
