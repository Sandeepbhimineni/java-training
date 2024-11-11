//Display the only digits in given string
public class String55 {

	public static void main(String[] args) {
		String s="Sandeep123@$";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				System.out.println("Given digits in the string are:"+ch);
			}
			else
			{
				System.out.println("specical characters:"+ch);
			}
		}

	}

}
