class ExceptionDemo
{
	public static void main(String [] args)
	{
		int i,j,k=0;
		i=10;
		j=0;
		try
		{
			k=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divide by zero");
		}
		System.out.println("Quotient="+k);
	}
}