//Anagram or not
import java.util.Arrays;

public class String999 {

	public static void main(String[] args) {
		String s1="SAnDeEP";
		String s2="aNDseEP";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] arr=s1.toCharArray();
		char[] arr1=s2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(Arrays.equals(arr,arr1))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
}
}