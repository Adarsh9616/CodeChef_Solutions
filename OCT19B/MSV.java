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
		    int count=0;
		    int c=0;
		    ar[0]=sc.nextInt();
		    for(int i=1;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		        for(int j=0;j<i;j++)
		        {
		            if(ar[j]%ar[i]==0)
		            {
		                c++;
		            }
		        }
		        if(c>count)
		        {
		            count=c;
		        }
		        c=0;
		    }
		    System.out.println(count);
		    t--;
		}
	}
}
