// 3.8.4	Writing a program in Java to demonstrate the uses of inheritance
class vehicle{	 
	 void state(){
	     
		System.out.println("In parent class  ");
		System.out.println("vehicle is running ");
	}
	void state(String s){
		System.out.println("vehicle is  "+s);
	}
	void state(int  s){
		System.out.println("vehicle is traveled  "+s+"km");
	}
}
public class Main extends vehicle{
	 public static void main(String args[]){
		Main object=new Main();
		object.state();
		object.state("Idle");
		object.state(15);
	}
}
// By Ashwani Sharma
	