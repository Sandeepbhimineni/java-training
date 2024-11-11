//program to display only alphabets in the given character array
import java.util.*;
public class Ascii8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		int n=sc.nextInt();
		
		System.out.println("Enter character in array:");
		char ch=sc.next().charAt(0);
		
		char[] arr=new char[n];
		for(int i=0;i<n-1;i++)
		{ 
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<n;i++)
		{
			if((arr[i]>='A' && arr[i]<='Z')||(arr[i]>='a' && arr[i]<='z'))
				{
				System.out.println("alphabets are:"+arr[i]);
				}
			else
			{
				System.out.println("not a character");
			}
		}
		
	}
}
