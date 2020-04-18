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
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=0;
	        int n=Math.abs(a-b);
	        for(int i=1;i<=Math.sqrt(n);i++)
	        {
 	            if (n%i==0) 
               {
	                if(n/i==i)
	                {
	                    c++;
	                }
	                else
	                {
	                    c=c+2;
	                }
                }
	        }
	        if(n==0)
	        {
	            System.out.println("-1");
	        }
	        else
	        {
	            System.out.println(c);
	        }
	        t--;
	    }
	
	}
}
