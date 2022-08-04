abstract class Vehicle {
	int speed=10;
	long distance=10;
	public Vehicle(){
		System.out.println("Constructor of Vehicle ");
	}
	public Vehicle(int s,long d) {
		this.speed=s;
		this.distance=d;
	}
	abstract void run();
	abstract void stop();
	public void fuel(int a) {
		
	}
	public void fuel(float a,String s) {
		
	}
	public void fuel(char c, int a) {
		
	}
}
class W2 extends Vehicle{
	int speed=20;
	long distance=20;
	int no_of_tyre=2;
	public W2(){
		System.out.println("Constructor of 2W");
	}
	void run() {
		System.out.println(" 2 Wheeler is running ");
	}
	void stop() {
		System.out.println(" 2 Wheeler is stopped ");
	}
	void display() {
		System.out.println("Speed of 2W "+speed);
		System.out.println("distance of 2W "+distance);
		System.out.println("no_of tyre of 2W "+no_of_tyre);
		System.out.println("Parent variables speed "+super.speed);
		System.out.println("Parent variables distance "+super.distance);
	}
}
class W3 extends Vehicle{
	int speed=25;
	long distance=25;
	int no_of_tyre=3;
	public W3(){
		System.out.println("Constructor of 3W");
	}
	void run() {
		System.out.println(" 3 Wheeler is running ");
	}
	void stop() {
		System.out.println(" 3 Wheeler is stopped ");
	}
	void display() {
		System.out.println("Speed of 3W "+speed);
		System.out.println("distance of 3W "+distance);
		System.out.println("no_of tyre of 3W "+no_of_tyre);
		System.out.println("Parent variables speed "+super.speed);
		System.out.println("Parent variables distance "+super.distance);
	}
}
class W4 extends Vehicle{
	int speed=40;
	long distance=40;
	int no_of_tyre=4;
	public W4(){
		System.out.println("Constructor of 4W");
	}
	void run() {
		System.out.println(" 4 Wheeler is running ");
	}
	void stop() {
		System.out.println(" 4 Wheeler is stopped ");
	}
	void display() {
		System.out.println("Speed of 4W "+speed);
		System.out.println("distance of 4W "+distance);
		System.out.println("no_of tyre of 4W "+no_of_tyre);
		System.out.println("Parent variables speed "+super.speed);
		System.out.println("Parent variables distance "+super.distance);
	}
}
class W8 extends Vehicle{
	int speed=20;
	long distance=20;
	int no_of_tyre=2;
	public W8(){
		System.out.println("Constructor of 2W");
	}
	void run() {
		System.out.println(" 8 Wheeler is running ");
	}
	void stop() {
		System.out.println(" 8 Wheeler is stopped ");
	}
	void display() {
		System.out.println("Speed of 8W "+speed);
		System.out.println("distance of 8W "+distance);
		System.out.println("no_of tyre of 8W "+no_of_tyre);
		System.out.println("Parent variables speed "+super.speed);
		System.out.println("Parent variables distance "+super.distance);
	}
}
public class transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		W2 ob=new W2();
		ob.display();
		W3 ob1=new W3();
		ob1.display();
		W4 ob2=new W4();
		ob2.display();
		W8 ob3=new W8();
		ob3.display();
	}

}
