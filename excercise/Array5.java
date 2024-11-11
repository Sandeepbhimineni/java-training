//find the sum of even numbers in given array

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		System.out.println("Enter the value of n:");
		int[] arr=new int[n];
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		if(arr[i]%2==0)
		{
			sum=sum+arr[i];
			
		}
		}
		
		System.out.println("the sum of even numbers is:"+sum);
	
}

}
