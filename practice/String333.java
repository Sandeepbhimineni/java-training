//create an duplicate string for the given string
public class String333 {

	public static void main(String[] args) {
		String s1="Sandeep is a good boy";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		
			
		}
		System.out.println(s2);
	}

}
