//upper case Alphabet or not
import java.util.Scanner;
public class Fourteen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("not an Alphabet");
		}

	}

}
