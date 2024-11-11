//program to find biggest no in an array
import java.util.*;
public class Array7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		System.out.println("Enter the values of an array:");
		int[] arr=new int[n];
		int j=arr[0];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		 
		for(int i=0;i<n;i++)
		{
			if(arr[i]>j)
			{
				j=arr[i];
				
			}
		}
		
		System.out.println("The biggest is:"+j);
	}

}
