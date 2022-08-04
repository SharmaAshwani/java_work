//Writing a program in Java to verify implementations of maps
import java.util.*;
public class map_hash{

   public static void main(String[] args) {
      Map m1 = new HashMap(); 
      m1.put("Ashwani", "7");
      m1.put("Lily", "14");
      m1.put("Ayan", "12");
      m1.put("Daisy", "34");
      System.out.println("Map Elements does contains key  rocky "+m1.containsKey("rocky"));
      System.out.print("\t" + m1);
   }
}
// Ashwani Sharma