//  Writing a program in Java implementing the linear search algorithm
import java.util.*;
public class Linear_search{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter Size");
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int key,index=-1;
        System.out.println("Enter key to search ");
        key=sc.nextInt();
        boolean flag=false;
        // Algo of linear search 
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                flag=true;
                index=i+1;
            }
        }
        if(flag==true)
        System.out.println("Key "+key+" is found at  "+index+" location");
        else 
        System.out.println("Key"+key+" is not found  ");
        
        
    }
}
// by Ashwani Sharma 
