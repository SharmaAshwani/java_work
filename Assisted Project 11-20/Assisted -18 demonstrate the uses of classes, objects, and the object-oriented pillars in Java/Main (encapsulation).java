// 3.8.5	Writing a program in Java to demonstrate the uses of encapsulation
class vehicle{	 
	 private String state ;
	 private String name ;
	 private int  traveled;
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
}
public class Main {
	 public static void main(String args[]){
		vehicle object=new vehicle();
		
		object.setstate("Idle");
		object.setname("Ford ");
		object.settraveled(20);
		System.out.println("Car state is "+object.getstate());
		System.out.println("Car name is "+object.getname());
		System.out.println(object.getname()+" traveled "+object.gettraveled()+" km");
	}
}
// By Ashwani Sharma
	