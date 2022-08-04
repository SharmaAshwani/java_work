 abstract class mnc {
	 public mnc() {
		 System.out.println("We are in Mnc constructor ");
	 }
	 abstract void mnc_name();
	 abstract void mnc_Id();
	 void mnc_mean() {
		 System.out.println("Mnc work in between nations boundaries  (in MNC  normal method )");
	}
}
abstract class infosys extends mnc{
	public infosys() {
		System.out.println("We are in Infosys  constructor ");
			}
	abstract void mnc_Id();
	void mnc_name() {
		System.out.println("The name is Infosys of MNC ( mehtod implemented in infosys) ");
	}	
}
class hello extends infosys{
	void mnc_name() {
		System.out.println("In hello name is Infosys of MNC (in hello )");
	}
	void mnc_Id() {
		System.out.println("Id of  Infosys is IND 75  (in hello )");
	}
	void hello_method() {
		System.out.println("The normal method of Hello  (in hello ) ");
	}
	
}
public class abstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello ob =new hello();
		ob.mnc_mean();
		ob.mnc_Id();
		ob.mnc_name();
		ob.hello_method();
	}

}
