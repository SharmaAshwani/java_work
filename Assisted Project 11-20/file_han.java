//import java.io.File;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.*;
import java.util.*;

public class file_han{
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		char[] s =new char[150];
		try {
			DataInputStream ob= new DataInputStream(System.in);
			FileOutputStream ft=new FileOutputStream("C:\\Users\\Anshu\\eclipse-workspace\\new project\\src\\phase1.txt",true);
			BufferedOutputStream obj=new BufferedOutputStream(ft,1024);
			System.out.println("Enter Acitvies to end enter #");
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

}
