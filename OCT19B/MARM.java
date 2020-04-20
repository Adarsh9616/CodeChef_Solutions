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
	        long k=sc.nextLong();
	        int a;
	        int b;
	        int ar[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            ar[i]=sc.nextInt();
	        }
	        long m=k;
	        k=k%(n*3);
	        if(k==0)
	        {
	            k=n*3;
	        }
	        for(int i=0;i<k;i++)
	        {
	            a=ar[i%n];
	            b=ar[n-(i%n)-1];
	            ar[i%n]=a^b;
	        }
	        if(m>=n*3&&n%2!=0)
	        {
	            ar[n/2]=0;
	        }
	        for(int i=0;i<n;i++)
	        {
	            System.out.print(ar[i]+" ");
	        }
	        t--;
	    }
	}
}
