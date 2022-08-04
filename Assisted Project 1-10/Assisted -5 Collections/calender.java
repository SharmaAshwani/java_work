import java.util.Iterator;
import java.util.LinkedList;

public class calender {

	public static void main(String[] args) {
	
		LinkedList<String > cal=new LinkedList<String>() ;
		cal.add("May");			//1
		cal.add("June");
		cal.add("July");			//3
		cal.add("August");
		cal.add("April");			//5
		cal.add("November");
		cal.addLast("December");
		cal.addFirst("January");
		cal.add(1,"Feburary");
		cal.add(2,"March");
		cal.remove("April");
		cal.add(3,"April");
		cal.add(8,"September");
		cal.add(9,"October");
		
		System.out.println("Proper Format : "+cal);
		System.out.print("Odd Months  : ");
		for(int i=0;i<cal.size();i++) {
			if(i%2==0)
			System.out.print(cal.get(i)+" ");
		}
		System.out.print("\nEven  Months  : ");
		for(int i=0;i<cal.size();i++) {
			if(i%2!=0)
				System.out.print(cal.get(i)+" ");
		}
		System.out.println("\n\nFirst   Month  : "+cal.getFirst());
		System.out.println("Last  Month  : "+cal.getLast());
		System.out.println(" \nContains Winter Month december is in it ?  : "+cal.contains("December"));
		System.out.println("\nFirst   Month using peek  : "+cal.peekFirst());
		System.out.println("Last  Month  using peek : "+cal.peekLast());
		Iterator ob=cal.iterator();
		System.out.print("\nLinked list using Iterator :");
		
		while(ob.hasNext()){
			System.out.print(ob.next()+" ");
		}
		
		System.out.println("\n\nFirst   Month   using poll : "+cal.pollFirst());
		System.out.println("Last  Month  using poll : "+cal.pollLast());
		cal.remove("March");
		System.out.println("After removing birthmonth  list is: "+cal);
		
		
	}

}
