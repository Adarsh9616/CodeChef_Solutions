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
	public static int minPartition(int[] S, int n, int S1, int S2,
			Map<String, Integer> lookup)
	{
		if (n < 0) 
		{
			return S1 + S2;
		}
		String key = n + "|" + S1;
		if (!lookup.containsKey(key))
		{
			int inc = minPartition(S, n - 1, gcd(S[n],S1), S2, lookup);
			int exc = minPartition(S, n - 1, S1, gcd(S[n],S2), lookup);
			lookup.put(key, Integer.max(inc, exc));
		}

		return lookup.get(key);
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
			Map<String, Integer> lookup = new HashMap<>();
			Arrays.sort(ar);
			n=removeDuplicates(ar,n);
			int sum=0;
			
			if(n!=1)
			{
			     sum =minPartition(ar,n-1,0,0,lookup);
			}
			else
			{
			    sum =2*ar[0];
			}
			System.out.println(sum);
			t--;
		}
	}
}