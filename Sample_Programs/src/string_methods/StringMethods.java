package string_methods;

public class StringMethods {
	public void display()
	{
		String s="Welcome";
		int a=s.length();
		System.out.println("Length is "+a);

	char b=s.charAt(4);
	System.out.println("Character at index 4 is "+b);
	
	int c=10;
	String x=String.valueOf(c);
	System.out.println(x);
	
	String d="java";
	String e="java";
	String f="JAVA";
	String g="hello";
	System.out.println(d.equals(e));
	System.out.println(d.equals(f));
	System.out.println(d.equals(g));
	
	System.out.println(d.equalsIgnoreCase(e));
	System.out.println(d.equalsIgnoreCase(f));
	
	String h=" ";
	System.out.println(h.isEmpty());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMethods obj=new StringMethods();
		obj.display();
	}

}
