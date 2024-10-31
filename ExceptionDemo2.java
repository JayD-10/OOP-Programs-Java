class ExceptionDemo2
{
	public static void main(String[] args)
	{
		int a[]=new int[4];
		int i=0;
		try
	     {
		for(i=0;i<=4;i++)
		{
			a[i]=i+1;
		}
		for(i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
	     }
               catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array can have 4 elem only here");
		}
	
	}
}