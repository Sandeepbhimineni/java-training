//swap first and last elements in array
import java.util.*;
public class Array4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        System.out.println("Enter the value of:");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;
        
         for(int i=0;i<n;i++)
         {
        	 
        	 System.out.print(arr[i]);
         }
         ;
		}
	
}
