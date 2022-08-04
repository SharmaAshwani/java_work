// Write a program to create strings and display the conversion of string to StringBuffer and StringBuilder.
public class string_buff{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s=new StringBuffer("Standard Java ") ;
		
		System.out.println("Normal : "+s);
		s.append("Phase 1");									//Append
		System.out.println("Append : "+s);

		s.replace(0, 0,"python is Architectural neutral ,");		//replace	
		System.out.println("replacing :"+s);
		s.delete(0,6);											//delete
		System.out.println("Delete : the py word  "+s);
		s.insert(0,"sorry thats java");			            //replacing 
		System.out.println("Inserting : "+s);
		s.reverse();											// reverse 
		System.out.println("Reverse String is : "+s);
		System.out.println("Character At 9 : "+s.charAt(9));	//Character At
		
	}

}
// by Ashwani Sharma