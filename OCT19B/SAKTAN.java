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
		    int m=sc.nextInt();
		    int q=sc.nextInt();
		    int k=(n>m)?n:m;
		    int x,y;
		    int ar[][]=new int[k][k];
		    for(int i=0;i<q;i++)
		    {
		        x=sc.nextInt();
		        y=sc.nextInt();
		        x=x-1;
		        y=y-1;
		        for(int j=0;j<k;j++)
		        {
		            ar[x][j]=ar[x][j]+1;
		            ar[j][y]=ar[j][y]+1;
		        }
		        /* for(int j=0;j<n;j++)
		        {
		            ar[j][y]=ar[j][y]+1;
		        }*/
		    }
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		            
		            if(ar[i][j]%2!=0)
		            {
		                c++;
		            }
		        }
		        
		    }
		  /* for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		            System.out.print(ar[i][j]);
		        }
		        System.out.println();
		    }*/
		    System.out.println(c);
		    t--;
		}
	}
}
