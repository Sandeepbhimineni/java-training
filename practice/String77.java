//printing the string array using scanner class
import java.util.*;
public class String77 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		System.out.println("enter the Strings:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
			
		}
		System.out.println("Strings are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}

