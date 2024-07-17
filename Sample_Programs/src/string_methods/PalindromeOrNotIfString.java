package string_methods;

public class PalindromeOrNotIfString {
	
	String s="malayalam",temp="";
	public void palindromeCheck()
	{
	String s1=s;
	for(int i=s.length()-1;i>=0;i--)
	{
	 temp+=s.charAt(i);
	 ;
	}
	
	if(s1.equals(temp))
	{
		System.out.println("Entered string is palindrome");
	}
	else
	{
		System.out.println("Entered string is not palindrome");
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeOrNotIfString obj=new PalindromeOrNotIfString();
		obj.palindromeCheck();

	}

}
