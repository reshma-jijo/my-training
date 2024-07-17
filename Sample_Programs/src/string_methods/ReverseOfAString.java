package string_methods;

public class ReverseOfAString {
	String temp="";
	String s="Java";
	public void reverseOfString()
	{
	
	for(int i=s.length()-1;i>=0;i--)
	{
	 temp+=s.charAt(i);
	 //System.out.println("Reverse of the string is "+temp);
	}
	
	System.out.println("Reverse of the string is "+temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseOfAString obj=new ReverseOfAString();
		obj.reverseOfString();
	
	}
}


