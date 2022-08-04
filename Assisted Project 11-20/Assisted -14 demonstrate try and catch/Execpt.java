
public class Execpt
{       
	int num,num1,res;
    void set(int n,int n1)
    {
        num=n;
        num1=n1;
    }
     void div(){
        try
        {
            res=num/num1;
        }
        catch(NumberFormatException e)
        {
            System.out.println(" Error Occurs "+e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(" Parent Class of Execption "+e.getMessage());
            System.out.println(" Error Occurs ");
        }
        finally
        {
            System.out.println(" Finally Result is "+res);
        }
    }
	public static void main(String[] args) {
	    
	    
		//System.out.println("Hello World");
		Execpt ob=new Execpt();
		ob.set(20,0);
		ob.div();
	}
}

