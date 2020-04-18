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
	        int ar[]=new int[n];
	        int c=0;
	        for(int i=0;i<n;i++)
	        {
	            ar[i]=sc.nextInt();
	        }
	        Arrays.sort(ar);
	        for(int i=0;i<n-1;i++)
	        {
	                if(ar[i]==ar[i+1])
	                {
	                    c++;
	                    break;
	                }
	        }
	        if(c==0)
	        {
	            System.out.println("No");
	        }
	        else
	        {
	            System.out.println("Yes");
	        }
	        t--;
	    }
	
	}
}
