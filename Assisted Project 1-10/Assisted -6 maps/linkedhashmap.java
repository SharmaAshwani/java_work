// LinkedHashMap Example
import java.util.LinkedHashMap;

public class map_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> ob=new LinkedHashMap<Integer, String>();
		ob.put(1, "Apple");
		ob.put(2, "Mango");
		ob.put(3, "Cherry");
		ob.put(4, "Pappaya");
		ob.put(5, "Guava");
		ob.put(6, "Banana");
		ob.put(7, "Watermelon");
		ob.put(8, "StrawBerry");
		ob.put(9, "Litchi");
		ob.put(10, "DragonFruit");
		System.out.println(ob);
		for(Integer key: ob.keySet() ) {
			System.out.println(key+" value : "+ob.get(key));
		}
		ob.remove(4);
		ob.remove(7);
		System.out.println("Does banana resides inside ? "+ob.containsValue("Banana"));
		System.out.println("Does 4th resides inside ? "+ob.containsKey(4));
		System.out.println(ob);
		System.out.println("Hashcode is  "+ob.hashCode());
		ob.clear();
		System.out.println("After clear "+ob);
		
	}

}
// By Ashwani Sharma