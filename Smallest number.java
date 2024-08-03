//to find the smallest no. in array
import java.util.*;
class Smallest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elem");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter  numbers");
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("reversed array is");
        for(i=n-1;i>-1;i--)
        {
            System.out.println(a[i]);
        }
    }
}