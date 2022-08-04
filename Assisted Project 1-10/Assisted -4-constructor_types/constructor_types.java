//	Writing a program in Java to verify the implementations of constructor types
class const_exam{
	int vari;
	String vars;
	public const_exam() {								// Default Constructor
		System.out.println("In Default Constructor ");
		vari=10;
		vars=" Arun ";
		System.out.println("Values ID is "+vari+" Name is "+vars);
	}
	public const_exam(int a,String s) {  				//Parameterized  Constructor 
		System.out.println("In Parameterized  Constructor "); 
		vari=a;
		vars=s;
		System.out.println("Values of ID is "+vari+" Name is "+vars);
	}
	public const_exam( String s) {
		System.out.println("In Parameterized overloaded Constructor ");
		//vari=10;
		vars=s;
		System.out.println("Values of ID is  "+vari+" Name is "+vars);
	}
	
}
public class constructor_types {
	
	
	public static void main(String[] args)
	{
		
		const_exam ob = new const_exam();
		//ob=null;
		const_exam ob1 = new const_exam(20,"Nikhil");
		
		const_exam ob2 = new const_exam("Sanjeev");
	}

}

// By Ashwani Sharma 