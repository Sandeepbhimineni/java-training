//even and odd 
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter all the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println("even no:"+arr[i]);
			}
			else
			{
				System.out.println("odd no:"+arr[i]);
			}
        
		}   
		
 
	}

}
