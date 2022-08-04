import java.util.*;
public class Arithmatic_calc {
	private float  first;
	private float  second;
	private float result;   // Result will be stored in this variable 
	private char op;
	public void setvalue(float  a,float  b,char op) {   // Similar to setter 
		this.first=a;
		this.second=b;
		this.op=op;
	}
	public float  getfirst() {
		return this.first;
	}
	public float   getsecond() {
		return this.second;		
	}
	public float   getresult() {		
		return this.result;		
	}
	public void operation(){
		switch(op) {
			case '+':
				result=first+second;
				break;
			case '-':
				result=first-second;
				break;
			case '*':
				result=first*second;
				break;
			case '/':
				if(second==0) {			// Excepyion checking
					System.out.println(" Cannot divide by 0 ");
					break;
				}
				result=first/second;
				break;
			case '%':
				if(second==0) {  	// Excepyion checking
					System.out.println(" Cannot divide by 0 ");
					break;
				}
				result=first%second;
				break;
			default:
				System.out.println("Wrong input ");
				break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First value ");
		float first=s.nextFloat();
		System.out.println("Enter Second value ");
		float second=s.nextFloat();
		System.out.println("Enter Operation \n+  For Addition \n- For Subtraction \n* For Multiplication \n/ For Division \n100% For Reminder ");
		char op=s.next().charAt(0);
		Arithmatic_calc ob=new Arithmatic_calc();
		ob.setvalue(first,second,op);
		ob.operation();
		System.out.println("the Result of "+first+" "+op+" "+second+" is := "+ob.getresult());
		
		
	}

}
// By Ashwani Sharma 