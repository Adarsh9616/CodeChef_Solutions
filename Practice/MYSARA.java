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
		    long mul=1;
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		    }
		    for(int j=0;j<n-1;j++)
		    {
		        int A=ar[j],B=ar[j+1];
		        for (int i = 0; i < 32; i++) 
                { 
                    if ((((A >> i) & 1)==1) && (((B >> i) & 1)==1)) 
                    { 
                        mul=(mul*2)%1000000007 ;
                    } 
                    else if ((((A >> i) & 1)==1) && (((B >> i) & 1)==0))
                    {
                        mul=0;
                        break;
                    }
                } 
		    }
		    System.out.println(mul);
		}
	}
}
