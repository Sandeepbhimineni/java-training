//how to convert string to character array
//tochar Array internal working
public class String1 {

	public static void main(String[] args) {
		String s1="sandeep";
		char[] arr=new char[s1.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s1.charAt(i);
			System.out.println(arr[i]);
		}

	}

}
