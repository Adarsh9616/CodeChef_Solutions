/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    long n= sc.nextLong();
		    long a= sc.nextLong();
		    long b=sc.nextLong();
		    long c=sc.nextLong();
		    long time=0;
		    long min=Long.MAX_VALUE;
		    while(n>0)
		    {
		        long f=sc.nextLong();
		        time=Math.abs(f-b)+Math.abs(f-a)+c;
		        if(time<min)
		        {
		            min=time;
		        }
		        n--;
		    }
		    System.out.println(min);
		    t--;
		}
	}
}