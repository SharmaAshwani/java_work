// Writing a program in Java implementing the binary search algorithm
import java.util.*;
public class Binary_search{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter Size");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter sorted elements ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int key,index=-1;
        System.out.println("Enter key to search ");
        key=sc.nextInt();
        boolean flag=false;
        // Algo of Binary search
        int low=0,high=size-1;
        int mid=(low+high)/2;
        while(low<=high){
            if(arr[mid]>key){
                high=mid-1;
            }
            else if(arr[mid]==key){
                flag=true;
                index=mid+1;
                break;
            }
            else{
                low=mid+1;
                //mid=(low+high)/2;
            }
                mid=(low+high)/2;
        }
        if(flag==true)
        System.out.println("Key "+key+" is found at  "+index+" location");
        else 
        System.out.println("Key"+key+" is not found  ");
    }
}
// by Ashwani Sharma 
