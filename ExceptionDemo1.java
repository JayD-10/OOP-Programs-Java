import java.util.*;
class ExceptionDemo1
{
	public static void main(String [] args)
	{
		int k,i=1,j=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		i=sc.nextInt();
		j=sc.nextInt();

		
		
		try
		{
			k=i/j;
		}
		catch(IOException e)
		{
			System.out.println("pls enter nos only");
		}
		System.out.println("Quotient="+k);
	}
}