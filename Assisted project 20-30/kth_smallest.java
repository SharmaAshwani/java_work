// Write a program in Java to find the fourth smallest element in an unsorted list
import java.util.*;
class Smallst 
{ 
int find_small(int arr[], int l, int r, int k) 
    	{ 
             		if (k > 0 && k <= r - l + 1) 
        		{ 
            			int pos = randomPartition(arr, l, r); 
            			if (pos-l == k-1) 
                			return arr[pos]; 
            			if (pos-l > k-1) 
                			return find_small(arr, l, pos-1, k); 
            			return find_small(arr, pos+1, r, k-pos+l-1); 
        		} 
        return Integer.MAX_VALUE; 
    } 
    void swap(int arr[], int i, int j) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    } 
    int partition(int arr[], int l, int r) 
    { 
        int x = arr[r], i = l; 
        for (int j = l; j <= r - 1; j++) 
        { 
            if (arr[j] <= x) 
            { 
                swap(arr, i, j); 
                i++; 
            } 
        } 
        swap(arr, i, r); 
        return i; 
    } 
    int randomPartition(int arr[], int l, int r) 
    { 
        int n = r-l+1; 
        int pivot = (int)(Math.random()) * (n-1); 
        swap(arr, l + pivot, r); 
        return partition(arr, l, r); 
    } 
        }  
        public class Main
        {
        	public static void main(String[] args) {
        		Smallst ob = new Smallst(); 
        		Scanner sc=new Scanner(System.in);
        	    int size=sc.nextInt();
                int arr[] = new int[size];
        	    for(int i=0;i<size;i++){
            	    arr[i]=sc.nextInt();
            	}
	        System.out.println(" Enter kth to Smallest  ");
	        int k=sc.nextInt();
                System.out.println(k+" th smallest element is "+ ob.find_small(arr, 0, size-1, k)); 
            }
        }


// by Ashwani Sharma 
