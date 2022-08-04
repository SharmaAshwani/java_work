class  product {
	int ID=78;
	String name="AMUL";

	 void display() {
		System.out.println("Id is "+ID);
		System.out.println("Name is "+name);
	}
}
class A extends product{
	int count =50;
	String category ="butter";
	void display(){
	    super.display();
	    System.out.println("Count is "+count);
	    System.out.println("category is "+category);
	}
}
class B extends product{
	int count =90;
	String category ="Milk";
	void display(){
	    super.display();
	    System.out.println("Count is "+count);
	    System.out.println("category is "+category);
	}
	
}
class C extends product{
	int count =56;
	String category ="Choco";
	void display(){
	    super.display();
	    System.out.println("Count is "+count);
	    System.out.println("category is "+category);
	}
}
class subA extends A{
	int price =30;
	int tprice=count*price;
	void display(){
	    System.out.println("Total price is "+tprice);
	    super.display();
	}
	
}
class subB extends B{
	int price =10;
	int tprice=count*price;
	void display(){
	    System.out.println("Total price is "+tprice);
	    super.display();
	}
	
}

public class hirclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subA ob=new subA();
		ob.display();
		subB ob1=new subB();
		ob1.display();

	}
}
