//Email Validation 
import java.util.*;
public class validate
{
	public static void main(String[] args) {
		System.out.println("Enter an Email to validate ");
		Scanner s=new Scanner(System.in);
		String email=s.next();
		char ignore[]={'!','#','%','^','&','*','(',')',',','<','>','?',';',';','=','-'}; // List of symbols to ignore in a mail id 
		boolean flag=true;
		for (char ch : email.toCharArray()) {
            //println(ch)
            for(int i=0;i<ignore.length;i++){
                if(ch==ignore[i]){
                    flag=false;
                    break;
                }
            }
        }
   
        if(flag==true && email.contains("@") && email.contains(".")){
		System.out.println("Email is "+email+" valid ");
            
        }
        else
		System.out.println("Email is "+email+" Invalid ");
	}
}
// By Ashwani Sharma 