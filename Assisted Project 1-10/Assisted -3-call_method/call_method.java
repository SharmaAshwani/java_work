//Writing a program in Java to verify implementations of methods and ways of calling a method  
class way1{
	public void method1(int a) {				//normal method
		System.out.println(" Normal method  "+a);	
	}
	public static void  method2(int a) {
		System.out.println(" static method "+a);  //Static method 		
	}
}
public class call_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		way1 ob =new way1();
		ob.method1(10); // 1st way of calling
		new way1().method1(20); // Annonymous calling 
		way1.method2(30); // calling an static method 
	}

}
// By Ashwani Sharma 
