package this_keyword;


public class FactorialOfNumber {
	int fact=1;
	public void calculateFactorial(int num)
	{
		for(int i=1;i<=num;i++)
		{
	fact=fact*i;	
	    }
	}
public void displayFactorial()
{
	this.calculateFactorial(5);
	System.out.println("Factorial of the number is "+fact);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialOfNumber obj=new FactorialOfNumber();
		obj.displayFactorial();

	}

}
