// Writing a program in Java to verify the implementation of inner classes
class Employee{
	int salary=10000;
	class Pemployee{
		int psalary=salary;
		float hike=.45f;
		String code="PE01";
		public void new_salary() {
			System.out.println("New Salary after hike := "+(salary+hike*psalary));
		}
		public void display() {
			System.out.println(" \tFor permannent Employee \n Employee salary : "+psalary);
			System.out.println("Employee code : "+code);
			System.out.println("Employee hike : "+hike+" times ");
		}
	}
	class Temployee{
		int psalary=salary;
		float hike=.30f;
		String code="TE01";
		public void new_salary() {
			System.out.println("New Salary after hike := "+(salary+hike*psalary));
		}
		public void display() {
			System.out.println("\tFor Temporary Employee \n Employee salary : "+psalary);
			System.out.println("Employee code : "+code);
			System.out.println("Employee hike : "+hike+" times ");
		}
	}
void role() {
	class CTemployee{
		int psalary=salary;
		float hike=.30f;
		String code="CT01";
		public void new_salary() {
			System.out.println("New Salary after hike := "+(salary+hike*psalary));
		}
		public void display() {
			System.out.println("\tFor Contracted Employee \nEmployee salary :"+psalary);
			System.out.println("Employee code :"+code);
			System.out.println("Employee hike :"+hike+" times ");
		}
	}
	CTemployee ob =new CTemployee();
	ob.display();
	ob.new_salary();
}
}

public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee();
		Employee.Pemployee in2=ob.new Pemployee();
		in2.display();
		in2.new_salary();
		Employee.Temployee in1=ob.new Temployee();
		in1.display();
		in1.new_salary();
		ob.role();
	}

}
