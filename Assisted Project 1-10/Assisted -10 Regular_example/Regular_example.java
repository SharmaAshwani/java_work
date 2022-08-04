//  Writing a program in Java to verify implementations of regular expressions
import java.util.*;
import java.util.regex.*;
public class Regular_example{
public static void main(String[] args) {
    	String reg="[f-z]+";
	String str="tft";
	Pattern pattern=Pattern.compile(reg);
	Matcher match =pattern.matcher(str);
	if(match.matches()) {
		System.out.println("Pattern is Matched");
	}
	else
		System.out.println("Sorry  the Pattern is Invalid ");
	}
}
// By Ashwani Sharma 