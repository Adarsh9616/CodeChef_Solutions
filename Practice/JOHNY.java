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
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		    }
		    int k=sc.nextInt();
		    int s=ar[k-1];
		    Arrays.sort(ar);
		    for(int i=0;i<n;i++)
		    {
		        if(s==ar[i])
		        {
		            k=i+1;
		            break;
		        }
		    }
		    System.out.println(k);
		    t--;
		}
	}
}
