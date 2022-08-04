import java.util.*;
class cstm extends Exception{
	public cstm(String s) {
		super(s);
	}
	
}
public class exception_example {
	
	private int salary;
	public exception_example(int s) {
		this.salary=s;
	}
	void display() throws cstm {
			if(salary<2100) {
				throw new cstm("You need to work hard");
			}
			if(salary>2100 && salary<=5000) {
				throw new cstm("your salary is somehow good");
			}
			if(salary>5100 && salary<9000) {
				throw new cstm("Your salary is very good ");
			}
			
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary ");
		int s=sc.nextInt();
		exception_example ob= new exception_example(s);
		try {
		ob.display();
		}
		catch(Exception e) {
			System.out.println(" "+e.getMessage());
		}
		finally{
		System.ut.println("Hence execution is complete ");
		}
}
}
