//  3.8.6	Writing a program in Java to demonstrate the uses of abstraction
abstract class vehicle{	 
	  String state ;
	  String name ;
	  int  traveled;
	public  void setstate(String s){
	     this.state=s;
	}
	public  void setname(String s){
	     this.name=s;
	}
	public void settraveled(int  s){
	     this.traveled=s;
	}
	public  String  getstate(){
	     return this.state;
	}
	public  String  getname(){
	     return this.name;
	}
	public int  gettraveled(){
	     return this.traveled;
	}
	abstract void display();
}
public class Main extends vehicle {
	 
		
		void display(){
	    System.out.println("Car state is "+getstate());
		System.out.println("Car name is "+getname());
		System.out.println(getname()+" traveled "+gettraveled()+" km");
	}
	 public static void main(String args[]){
		Main object=new Main();
		
		object.setstate("Idle");
		object.setname("Ford ");
		object.settraveled(20);
	    object.display();	
		
	}
}
// By Ashwani Sharma
	