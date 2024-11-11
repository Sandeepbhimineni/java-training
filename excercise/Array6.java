//program to display biggest number in an array
import java.util.*;
public class Array6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i = n-1;i>=0;i--)
		{ 
			if(arr[i]%2!=0)
			{
				System.out.println("odd numbers are:"+arr[i]);
			}
		}
		
			
	}

}
