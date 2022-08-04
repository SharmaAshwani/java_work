// Write a program in Java to create a thread by extending the ‘Thread’ class and by implementing the “Runnable” interface
public class thread_runnable implements Runnable
{  
	
	public void run()
	{  
	  System.out.println("The  Thread is running...");  
	}  
	
	public static void main(String args[])
	{  
	
	thread_runnable t1=new thread_runnable();  // Step 1: create the object of the class
	Thread ob =new Thread(t1);
	ob.start();                            // Step 2: starting the thread
    }  
} 
// By Ashwani Sharma