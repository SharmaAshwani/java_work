//Writing a program in Java to implement access modifiers
class class_mod{
	int var_default=10;         //DEFAULT
	private int var_private=20;
	public  int var_public =30;
	protected   int var_protected=40;
	
	 void method_default() {
		System.out.println("The value of default variable in default method is :"+var_default);
	}
	public void method_public() {
		method_private();   // Accessing private fields using public method 
		System.out.println("The value of public  variable in public  method is :"+var_public);
		//method_protected();
	}
	private void method_private(){
		System.out.println("The value of private variable in private method is :"+var_private);
	}
	protected void method_protected() {
		System.out.println("The value of protected variable in protected method is :"+var_protected);
	}

}
public class access_modifier {
	public static void main(String args[]) {
	class_mod ob= new class_mod();
	ob.method_default();
	ob.method_public();
	ob.method_protected();
	//ob.method_private();  //Private can't be accessed directly 
	}
}
// By Ashwani Sharma 