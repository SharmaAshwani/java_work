// 3.8.3	Writing a program in Java to demonstrate the uses of polymorphism
public class Main{
	 void state(){
		System.out.println("vehicle is running ");
	}
	void state(String s){
		System.out.println("vehicle is  "+s);
	}
	void state(int  s){
		System.out.println("vehicle is traveled  "+s+"km");
	}
	 public static void main(String args[]){
		Main object=new Main();
		object.state();
		object.state("Idle");
		object.state(15);
	}
}
// By Ashwani Sharma
	