package constructor;

public class CustomerDiscountCheck {
	double totalamount;
	public CustomerDiscountCheck(int a,int b,int c)
	{
		totalamount=a+b+c; 
	}
    public void checkDiscount()
    {
    	if(totalamount>5000)
    	{  
    		double discountamount,finalprice;
    		discountamount=(0.2*totalamount);
    		finalprice=totalamount-discountamount;
    		System.out.println("You got 20% dicount and your final amount is "+finalprice);
    	}
    	else
    	{
    		System.out.println("You are not eligible for discount. Your final amount is "+totalamount);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDiscountCheck obj=new CustomerDiscountCheck(3000,400,1800);
		obj.checkDiscount();
	}

}
