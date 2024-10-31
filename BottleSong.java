public class BottleSong
{
	public static void main(String[] args)
	{
		int x=10;
		String word="bottles";
		while(x>0)
		{
			if(x==1)
			{
				word="bottle";
			}
			System.out.println(x+"green"+word+"hanging on the wall");
			System.out.println(x+"green"+word+"hanging on the wall");
			System.out.println("and if one fell");						
			x--;
			if(x>0)
				System.out.println("there'll be"+x+"green"+word+"hanging on the wall");
			else
				System.out.println("there'll be no green bottles hanging on the wall");
	
			
		}
	}
}