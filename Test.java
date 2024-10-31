class Test
{
	Test()
	{
		System.out.println("in constructor");
	}
	~Test()
	{
		System.out.println("obj deleted");
	}
	 public static void main(String[] args)
	{
		Test ob1=new Test();
	}

}