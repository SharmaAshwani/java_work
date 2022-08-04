/* Passowrd pattern creating
	1: 1st letter CAPS
	2: 2nd Special Symbol
	3: 4 numeric digits 
	4: 4 letters
import java.util.*;
import java.util.regex.Pattern;
public class password_val {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println (Pattern.matches("{10}[A-Z]{1}\\W{1}\\d{4}[0-9]*\\w{4}", "A@1234abce")); 
		 System.out.println (Pattern.matches("{10}[A-Z]{1}\\W{1}\\d{4}[0-9]*\\w{4}", "A(1214abce")); // valid  
		 System.out.println (Pattern.matches("{10}[A-Z]{1}\\W{1}\\d{4}[0-9]*\\w{4}", "A%1234ABCD")); // valid 
		 System.out.println (Pattern.matches("{10}[A-Z]{1}\\W{1}\\d{4}[0-9]*\\w{4}", "a@1234abce")); // Invalid 
		 //{10} [A-Z]{1} $ \\d{4}[0-9]* \\w{4}[a-zA-Z]*  
		 //!1234AbCs
		 //[+91]?\\d{10}[0-9]* work better then last  [+91]+\\d{10}[0-9]*
	}

}
// By Ashwani Sharma