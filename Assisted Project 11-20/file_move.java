//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.*;
import java.util.*;

public class file_move {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String data=sc.nextLine();		
		char[] s =new char[10];
		try {
		
			FileWriter ab=new FileWriter("C:\\Users\\Anshu\\eclipse-workspace\\new project\\src\\New_to_write.txt");
			//FileReader ob=new FileReader("C:\\Users\\Anshu\\eclipse-workspace\\new project\\src\\New_to_write.txt");
			ab.write(data);
			System.out.println("SuccessFully  Stored Data ");
			ab.close();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
