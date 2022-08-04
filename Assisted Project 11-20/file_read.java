//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.*;
import java.util.*;

public class file_read{
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		char[] s =new char[150];
		try {
		
			
			FileReader ob=new FileReader("C:\\Users\\Anshu\\eclipse-workspace\\new project\\src\\phase1.txt");
			
		//	System.out.println("SuccessFully  Stored Data ");
			ob.read(s);
			System.out.println("Stored Data  IS");
			System.out.println(s);
			ob.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
