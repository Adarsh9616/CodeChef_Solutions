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
		    int a[]=new int[3];
		    int b[]=new int[3];
		    for(int i=0;i<3;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<3;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    for (int i = 0; i < 3-1; i++)
		    {
                for (int j = 0; j < 3-i-1; j++)
                {
                    if (a[j] > a[j+1])
                    {
                        
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                         temp = b[j];
                        b[j] = b[j+1];
                        b[j+1] = temp;
                    }
                }
		    }
		    int i=0;
		    for(i=0;i<2;i++)
		    {
		        if(b[i]>b[i+1])
		        {
		            break;
		        }
		        if((a[i]==a[i+1])&&(b[i]!=b[i+1]))
		        {
		            break;
		        }
		        if((a[i]!=a[i+1])&&(b[i]==b[i+1]))
		        {
		            break;
		        }
		    }
		    
		    if(i==2)
		    {
		        System.out.println("FAIR");
		    }
		    else
		    {
		        System.out.println("NOT FAIR");
		    }
		    
		    t--;
		}
	}
}
