//convert digit to no only if it is digit
import java.util.*;
public class Ascii7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the digit:");
		char ch=sc.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println((ch-0));
		}
		else
		{
			System.out.println("invalid ");
		}
		
	}

}
