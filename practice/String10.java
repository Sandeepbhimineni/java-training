//length of string in an array
import java.util.Scanner;
public class String10 {

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
		System.out.println("lengthof the string:");
		for(int i=0;i<n;i++)
		{
			int p=arr[i].length();
			System.out.println(p);
		}
		

	}

}
