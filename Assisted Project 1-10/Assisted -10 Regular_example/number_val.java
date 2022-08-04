import java.util.*;
import java.util.regex.Pattern;
public class number_val {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println (Pattern.matches("[+91]?\\d{10}[0-9]*", "+917302381211")); 
		 System.out.println (Pattern.matches("[+91]+\\d{10}[0-9]*", "+91730381211")); 
		 System.out.println (Pattern.matches("[+91]+\\d{10}[0-9]*", "73011381211")); 
		 //[+91]?\\d{10}[0-9]* work better then last  [+91]+\\d{10}[0-9]*
	}

}
