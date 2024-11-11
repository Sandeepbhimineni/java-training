//seperating the string by using split() method
public class String222 {

	public static void main(String[] args) {
		String s="sandeep is a good boy";
		String[] arr=s.split(" ");
		int n=arr.length;
		System.out.println("length of array is:"+n);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
