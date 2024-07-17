package string_methods;

public class StringBufferExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("java");
		System.out.println(sb);
		sb.append("new");
		System.out.println(sb);
		sb.insert(4, " insert ");
		System.out.println(sb);
		sb.replace(5, 11, "abc");
		System.out.println(sb);
		sb.delete(5, 8);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
