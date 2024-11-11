//check the no is divisible by 3 or not
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		System.out.println("enter the number:");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n%3==0)
	    {
	        System.out.println("it is Divisible");
	    }
	    else
	    {
	        System.out.println("it is notdivisible");
	    }

	}

}
