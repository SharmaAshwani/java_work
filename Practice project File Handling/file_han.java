import java.io.*;
import java.nio.;
import java.util.;

public class file_han{
	void write_append() {
		char[] s =new char[150];
		try {
			DataInputStream ob= new DataInputStream(System.in);
			FileOutputStream ft=new FileOutputStream(CUsersAnshueclipse-workspacenew projectsrcphase1.txt,true);
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
		
			
			FileReader ob=new FileReader(CUsersAnshueclipse-workspacenew projectsrcphase1.txt);
			
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
