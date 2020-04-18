/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
     private static boolean check(int[] arr, int toCheckValue) 
     { 
       
        boolean test = false; 
        for (int element : arr) 
        { 
            if (element == toCheckValue) 
            { 
                test=true;
            } 
        } 
        return test;
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int ar[]=new int[m];
		    for(int i=0;i<m;i++)
		    {
		        ar[i]=sc.nextInt();
		    }
		    int chef[]=new int[n];
		    int ass[]=new int[n];
		    int f=0;
		    int k=0;
		    int l=0;
		    for(int i=1;i<=n;i++)
		    {
		        if(!check(ar,i)&&f==0)
		        {
		            chef[k]=i;
		            f=1;
		            k++;
		        }
		        else if(!check(ar,i)&&f==1)
		        {
		            ass[l]=i;
		            f=0;
		            l++;
		        }
		    }
		    for(int i=0;i<k;i++)
		    {
		        System.out.print(chef[i]+" ");
		    }
		    System.out.println();
		    for(int i=0;i<l;i++)
		    {
		        System.out.print(ass[i]+" ");
		    }
		    System.out.println();
		    t--;
		}
	}
}
