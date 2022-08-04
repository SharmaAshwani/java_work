// diamond problem using OOPs’ concepts
interface First 
{  
    default void show() 
    { 
        System.out.println("Default First interface  method "); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second Interface method "); 
    } 
}  
public class Main_diamond implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void Main_diamond(String args[]) 
    { 
        Main_diamond ob = new Main_diamond(); 
        ob.show(); 
    } 
}
// By Ashwani Sharma 