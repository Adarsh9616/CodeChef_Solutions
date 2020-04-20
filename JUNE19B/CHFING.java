/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static long sumOfAP(long a, long d, long n)
    { 
        long sum = (n * (2 * a - (n - 1) * d))/2; 
        
        return sum; 
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t>0)
	    {
	        long n=sc.nextLong();
	        long k=sc.nextLong();
	        long count=k-1;
	        long number=(count-(n-1))/(n-1);
	        long aa=(count-(n-1))%(n-1);
	        long a=sumOfAP(count-(n-1),n-1,number+1);
	        
	        System.out.println((count+a)%1000000007);
	        t--;
	    }
	
	}
}
