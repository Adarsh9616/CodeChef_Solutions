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
	        int i=1;
	        int sum=0;
	        while((int)Math.pow(5,i)<=n)
	        {
	            sum=sum+n/(int)Math.pow(5,i);
	            i++;
	        }
	        System.out.println(sum);
	        t--;
	    }
	}
}
