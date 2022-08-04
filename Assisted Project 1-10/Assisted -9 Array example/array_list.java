// Writing a program in Java to verify implementations of array
import java.util.ArrayList;
import java.util.Iterator;
public class array_list{
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(23);
		list.add(40);
		System.out.println("Size of Array_list is:"+list.size());
		System.out.println("List Contains 20 ? :"+list.contains(20));
		System.out.println("List is  ");
		for(int s:list) {
			System.out.println(s);
		}
	}
}
//By Ashwani Sharma
