public final class Example 
{           // Final class
    public final void show( int x) 
	{  // Final method and parameter
        final int y = 10;        // Final variable
        System.out.println(x + y);
	
    	}
    
    public static void main(String[] args)
	 {
        new Example().show(5);
    	}
}
 class Hi extends Example
{
}
