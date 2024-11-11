//find the last element in an array
import java.util.*;
public class String99 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the strings in  array:");
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		System.out.println("the last character:");
		for(int i=0;i<n;i++)
		{
			String s=arr[i];
			System.out.println(s.charAt(s.length()-1));
		}
		

	}

}
