// 1 Write a program in Java to right rotate an array by 5 steps
import java.util.*;
class RotateArray { 
public void rotate(int[] nums, int k) {
    		if(k > nums.length) 
       			k=k%nums.length;
 		int[] result = new int[nums.length];
 		for(int i=0; i < k; i++){
        			result[i] = nums[nums.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<nums.length; i++){
        			result[i] = nums[j];
j++;
    		}
 		System.arraycopy( result, 0, nums, 0, nums.length );
}
} 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
        int arr[] = new int[size];
	    for(int i=0;i<size;i++){
	    arr[i]=sc.nextInt();
	    }
	    System.out.println(" Enter steps to rotate ");
	    int steps=sc.nextInt();
		RotateArray r = new RotateArray();
        		r.rotate(arr, steps); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}
//By Ashwani Sharma 