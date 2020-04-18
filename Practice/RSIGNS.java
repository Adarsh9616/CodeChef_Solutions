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
		long t=sc.nextLong();
		long n;
		while(t>0)
		{
		    n=sc.nextLong();
		    long ans=5;
		    long base=2;
		    long mod=1000000007;
		    while(n>0)
		    {
		        if(n%2>0)
		        {
		            ans=ans*base;
		            ans=ans%mod;
		        }
		        base=base*base;
		        base=base%mod;
		        n=n/2;
		    }
		    System.out.println(ans);
		    t--;
		}
	}
}
