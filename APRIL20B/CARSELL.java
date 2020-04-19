/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long sum=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            for(int i=0;i<n;i++)
            {
                if(a[i]-(n-i-1)>0)
                {
                    sum = sum + a[i] - (n - i - 1);
                }
            }
            System.out.println(sum%1000000007);
        }
    }
}
