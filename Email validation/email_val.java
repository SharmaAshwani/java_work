import java.util.Scanner;

public class email_val {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Id_reg[]= {"ashwani@gmail.com","ashwanipandey@reiff.com","anuj@xyz.com","saurabh@hotmail.com","teena@abc.com"};
		System.out.println("Enter an Email to validate ");
		Scanner s=new Scanner(System.in);
		String eml=s.next();
		boolean flag=false;
		for(String str: Id_reg) {
			if(eml.equalsIgnoreCase(str)) {
				flag=true;
			}
		}
		//String email=s.next();
		if(flag==true) {
			System.out.println("Email is valid ");
		}
		else 
			System.out.println("Email is not valid ");
		

	}

}
