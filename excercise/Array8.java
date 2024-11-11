//multiplication table in an array
import java.util.*;
public class Array8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int a=sc.nextInt();
		System.out.println("enter the values in array:");
		int[] arr1=new int[a];
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
			
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<=10;j++)
			{
			System.out.println(arr1[i]*j);
			}
		}
	}
}
