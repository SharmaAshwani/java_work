// Longest Increasing Subsequence.
import java.util.*;
class sequence {
	 int find_seq(int ar[], int n)
	{
		int lst[] = new int[n];
		int i, j, max = 0;
		for (i = 0; i < n; i++)
			lst[i] = 1;

		
		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (ar[i] > ar[j] && lst[i] < lst[j] + 1)
					lst[i] = lst[j] + 1;
        int max_index=-1;
		for (i = 0; i < n; i++)
			if (max < lst[i]){
				max = lst[i];
				max_index=i;
			}
		int sq[]=new int[max];
		 sq[0]=ar[max_index];
		int ptos=1;
		for (i = max_index; i >=0; i--)
			if (lst[max_index]-lst[i]==1){
			   //System.out.println(" "+ar[i]);
			   sq[ptos]=ar[i];
			   ptos++;
			    max_index=i;
			}
        		for( i = 0; i < sq.length / 2; i++)
                {
                    int temp = sq[i];
                    sq[i] = sq[sq.length - i - 1];
                    sq[sq.length - i - 1] = temp;
                }
	    System.out.println("Longest Subsequence is "+Arrays.toString(sq));
        
		
		return max;
		
	}

	public static void main(String args[])
	{   
	    sequence ob =new sequence();
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of elements");
		int n=sc.nextInt();
        System.out.println("Enter  elements");

		int arr[]=new int[n];
	    for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();	        
	    }
		System.out.println("Length of lis is " + ob.find_seq(arr, n) + "\n");
	}
}
// By Ashwani Sharma
