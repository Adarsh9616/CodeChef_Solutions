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
		    String s=sc.next();
		    String r=sc.next();
		    int c1=0;
		    int c2=0;
		    for(int i=0;i<n;i++)
		    {
		        char c=s.charAt(i);
		        char cc=r.charAt(i);
		        if(c=='1')
		        {
		            c1++;
		        }
		        if(cc=='1')
		        {
		            c2++;
		        }
		    }
		    if(c1==c2)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}
