//Write a program in Java to demonstrate sleep() and wait()
class laptop {
    private int battery = 50;
    synchronized public void work(int current_battery)
    {
        for (int i = 1; i <= current_battery; i++) {
            if (battery <=10) {
                System.out.println(i - 1+ "% battery exhausted "+battery + "% remains");
                System.out.println("Invoking the wait() method Charger ");
                try {
                    wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Continuing the work ");
            }
  
            battery--;
        }
        System.out.println("The work is done u can shutdown now ");
    }
  
    synchronized public void charge()
    {
        System.out.println( "The system is on low battery  putting charger  "+ "the thread using notify()");
        battery +=100;
        notify();
        System.out.println( "The system is charged Knowed   ");
        
    }
}
  
public class Main extends Thread {
    public static void main(String[] args)
    {
  
        laptop bt = new laptop();
        new Thread() {
            @Override public void run() { bt.work(60); }
        }.start();
        new Thread() {
            @Override public void run() { bt.charge(); }
        }.start();
    }
}
// By Ashwani Sharma 