// program to count the no of digits variables and symbols
public class String66 {

	public static void main(String[] args) {
		String s="Sandeep123@$";
		int sum=0;
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			
			{
				sum++;
				
			}
			else if(ch>='0' && ch<='9')
			{
				sum1++;
				
			}
			else
			{
				sum2++;
				
		}
			
}
		System.out.println("Given digits in the string are:"+sum +", "+sum1+","+sum2);
	
}
}
