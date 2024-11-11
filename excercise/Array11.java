//last odd number
import java.util.Scanner;
public class Array11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the values in an  array:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>0;i--)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
				break;
			}
		}
		

	}

}
