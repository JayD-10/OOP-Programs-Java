import java.util.*;
class Add
{
	int n1,n2;
	Add(int a, int b)
	{
		n1=a;
		n2=b;
	}
	void calc()
	{
		System.out.println("Sum="+(n1+n2));
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 nos");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Add ob=new Add(a,b);
		ob.calc();
	}
	 
}