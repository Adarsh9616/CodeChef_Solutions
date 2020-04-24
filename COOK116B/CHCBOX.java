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
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    int max=-1;
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		        if(max<=ar[i])
		        {
		            max=ar[i];
		        }
		    }
		    int f=-1;int l=-1;
		    for(int i=0;i<n;i++)
		    {
		        if(ar[i]==max)
		        {
		            f=i;
		            break;
		        }
		    }
		    for(int i=n-1;i>=0;i--)
		    {
		        if(ar[i]==max)
		        {
		            l=i;
		            break;
		        }
		    }
		    f=f-0;
		    l=n-1-l;
		    if((f+l)>=(n/2))
		    {
		        System.out.println(f+l+1-(n/2));
		    }
		    else
		    {
		        System.out.println(0);
		    }
		    
		}
	}
}
