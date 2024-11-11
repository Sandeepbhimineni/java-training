//convert uppercase to lower case only it is alphabet
import java.util.*;
public class Ascii6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println((char)(ch+32));
		}
		else
		{
			System.out.println("Invalid character");
		}
		

	}

}
