/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a;
      return gcd(b, a % b);  
    } 
	static int removeDuplicates(int arr[], int n) 
    { 
        if (n == 0 || n == 1) 
            return n; 
        int j = 0; 
        for (int i = 0; i < n-1; i++) 
            if (arr[i] != arr[i+1]) 
                arr[j++] = arr[i]; 
       
        arr[j++] = arr[n-1]; 
       
        return j; 
    } 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]=sc.nextInt();
			}
			Arrays.sort(ar);
			n=removeDuplicates(ar,n);
			int sum=0;
			int gcdd=ar[0];
			if(n>2)
			{
    			for(int i=1;i<n-2;i++)
    			{
    			    gcdd=gcd(ar[i],gcdd);
    			}
    			int sum1=gcd(gcdd,ar[n-2])+ar[n-1];
    			int sum2=gcd(gcdd,ar[n-1])+ar[n-2];
    			if(sum1>sum2)
    			{
    			    sum=sum1;
    			}
    			else
    			{
    			    sum=sum2;
    			}
			}
			else if(n==2)
			{
			    sum=ar[0]+ar[1];
			}
			else
			{
			    sum=ar[0]*2;
			}
			System.out.println(sum);
			t--;
		}
	}
}