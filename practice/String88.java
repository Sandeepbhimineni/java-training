//to print first character in ana array
import java.util.Scanner;
public class String88 {

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
		System.out.println("First character is:");
		for(int i=0;i<n;i++)
		{
			String s=arr[i];
			System.out.println(s.charAt(0));
		}

	}

}

