//To convert a string to sentence case
import java.util.*;
class SentenceCase
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String str,str1;
        
        System.out.println("enter a string");
        str=sc.nextLine();
        str=str.toLowerCase();
        str1=str.substring(1);
        str=str.substring(0,1);
        str=str.toUpperCase();
        str=str.concat(str1);
        System.out.println(str);
    }
}