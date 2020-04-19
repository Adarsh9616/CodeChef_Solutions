/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static int  primeFactors(int n)
    {
        int count=0;
        while (n%2==0)
        {
            count++;
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                count++;
                n /= i;
            }
        }

        if (n > 2)
            count++;
        return count++;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int max=primeFactors(n);
            if(max>=k)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }

        }
    }
}
