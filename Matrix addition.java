//To add 2 matrices 
import java.util.*;
class Matrices
{
    public static void main(String [] args)
    {
            Scanner sc=new Scanner(System.in);
            int i,j,m,n;
            System.out.println("enter number of rows and columns in A");
            m=sc.nextInt();
            n=sc.nextInt();
            int a[][]=new int[m][n];
            int b[][]=new int[m][n];
            int c[][]=new int[m][n];
            System.out.println("enter elements in A");
            for(i=0;i<=m-1;i++)
            {
                for(j=0;j<=n-1;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("enter elements in B");
            for(i=0;i<=m-1;i++)
            {
                for(j=0;j<=n-1;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            
            for(i=0;i<m;i++)
            {
                for(j=0;j<=n-1;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println("Maxtrix add is ");
            for(i=0;i<=m-1;i++)
            {
                for(j=0;j<=n-1;j++)
                {
                    System.out.print(c[i][j] +"\t");

                }
                System.out.println();
            }
        }
}