//Write a program to create strings and display the conversion of string to StringBuffer and StringBuilder.
public class string_builder {
	
	public static void main(String[] args) {
		
		String str= new String("Example of String builder");		
		StringBuilder s1= new StringBuilder(str);		//convert the string to string builder
		System.out.println("Size: "+s1.length());		
		
		s1.append(" Welcome");
		System.out.println(s1);
		
		s1.insert(11, " btw ");
		System.out.println(s1);
		
		s1.replace(12, 19, "Bye");
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);
		
	}

}
// By Ashwani Sharma 
