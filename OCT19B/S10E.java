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
	        int n=sc.nextInt();
	        int ar[]=new int[n+5];
	        for(int i=5;i<n+5;i++)
	        {
	            ar[i]=sc.nextInt();
	        }
	        int c=0;int m=0;
	        ar[0]=1000000000;
	        ar[1]=1000000000;
	        ar[2]=1000000000;
	        ar[3]=1000000000;
	        ar[4]=1000000000;
	        for(int i=5;i<n+5;i++)
	        {
	            if(ar[i]<ar[i-1])
	            {
	               for(int j=i-5;j<i;j++)
	               {
	                   if(ar[j]<=ar[i])
	                   {
	                       m=1;
	                   }
	               }
	               if(m!=1)
	               {
	                   c++;
	               }
	               m=0;
	            }
	        }
	        System.out.println(c);
	        t--;
	    }
	}
}
