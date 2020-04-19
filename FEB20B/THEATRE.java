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
		long sum=0;
		while(t>0)
		{
		    int n=sc.nextInt();
		    int ar[][]=new int[4][4];
		    for(int i=0;i<n;i++)
		    {
		        char ch=sc.next().charAt(0);
		        int a=sc.nextInt();
		        int l=0,m=0;
		        if(ch=='A')
		        {
		            l=0;
		        }
		        else if (ch=='B')
		        {
		            l=1;
		        }
		        else if(ch=='C')
		        {
		            l=2;
		        }
		        else if(ch=='D')
		        {
		            l=3;
		        }
		        if(a==3)
		        {
		            m=0;
		        }
		        else if(a==6)
		        {
		            m=1;
		        }
		        else if(a==9)
		        {
		            m=2;
		        }
		        else if(a==12)
		        {
		            m=3;
		        }
		        ar[l][m]=ar[l][m]+1;
		    }
		    int ans[]=new int[4];
		    int l=0,m=0;
		    for(int i=0;i<4;i++)
		    {
		        for(int j=0;j<4;j++)
		        {
		            if(ans[0]<=ar[i][j])
		            {
		                ans[0]=ar[i][j];
		                l=i;
		                m=j;
		            }
		        }
		    }
		    for(int i=0;i<4;i++)
		    {
		        ar[l][i]=0;
		        ar[i][m]=0;
		    }
		    l=0;m=0;
		    for(int i=0;i<4;i++)
		    {
		        for(int j=0;j<4;j++)
		        {
		            if(ans[1]<=ar[i][j])
		            {
		                ans[1]=ar[i][j];
		                l=i;
		                m=j;
		            }
		        }
		    }
		    for(int i=0;i<4;i++)
		    {
		        ar[l][i]=0;
		        ar[i][m]=0;
		    }
		    l=0;m=0;
		    for(int i=0;i<4;i++)
		    {
		        for(int j=0;j<4;j++)
		        {
		            if(ans[2]<=ar[i][j])
		            {
		                ans[2]=ar[i][j];
		                l=i;
		                m=j;
		            }
		        }
		    }
		    for(int i=0;i<4;i++)
		    {
		        ar[l][i]=0;
		        ar[i][m]=0;
		    }
		    l=0;m=0;
		    for(int i=0;i<4;i++)
		    {
		        for(int j=0;j<4;j++)
		        {
		            if(ans[3]<=ar[i][j])
		            {
		                ans[3]=ar[i][j];
		                l=i;
		                m=j;
		            }
		        }
		    }
		    for(int i=0;i<4;i++)
		    {
		        ar[m][i]=0;
		        ar[i][l]=0;
		    }
		    int rs[]={100,75,50,25};
		    long sum1=0;
		    for(int i=0;i<4;i++)
		    {
		        if(ans[i]==0)
		        {
		            sum1=sum1-100;
		        }
		        else
		        {
		            sum1=sum1+(ans[i]*rs[i]);
		        }
		    }
		    sum=sum+sum1;
		    System.out.println(sum1);
		    t--;
		}
		System.out.println(sum);
		
	}
}
