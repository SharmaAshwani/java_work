import java.io.*;
public class file_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File file=new File("C:\\Users\\Anshu\\eclipse-workspace\\new project\\src\\New_file.txt");
		if(file.createNewFile()) {
			System.out.println("New file created ");
		}
		else {
			if(file.exists()) {
				System.out.println("Already Exists ");
				System.out.println("Path "+file.getAbsolutePath());
				System.out.println("Parent "+file.getParent());
				System.out.println("Class "+file.getClass());
				System.out.println("Space "+file.getFreeSpace());
			}
			System.out.println("File deleted "+file.delete());
			
		}
		
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
