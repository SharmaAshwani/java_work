// Writing a program in Java to verify implementations of collections
// Colletions Array List 
import java.util.ArrayList;
import java.util.Iterator;
public class array_list{
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Strawberry");
		list.add("DragonFruit");
		list.add(null);
		System.out.println("Size of Array_list is:"+list.size());
		System.out.println("List Contains Apple? :"+list.contains("Apple"));
		System.out.println("List is  ");
		for(String s:list) {
			System.out.println(s);
		}
	}
}
//By Ashwani Sharma
