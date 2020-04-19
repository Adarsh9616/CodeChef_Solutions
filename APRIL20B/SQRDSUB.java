/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static long count(long ar[],long n)
    {
        long result=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]==2)
            {
                long j=i-1;long k=i+1;
                long left=1;
                long right=1;
                while(j>=0&&ar[(int) j]!=2&&ar[(int) j]!=4&&ar[(int) j]!=0)
                {
                    //System.out.println("j="+j+" left="+left+" ar["+j+"]="+ar[j]);
                    j--;
                    left++;
                }
                while(k<n &&ar[(int) k]!=2&&ar[(int) k]!=4&&ar[(int) k]!=0)
                {
                    //System.out.println("k="+k+" right="+right+" ar["+k+"]="+ar[k]);
                    k++;
                    right++;
                }
                //System.out.println(right * left);
                result=(long)result+((long)right*(long)left);
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0)
        {
            long n=sc.nextLong();
            long ar[]=new long[(int) n];
            long total=(long)n*(long)((long)n+(long)1)/(long)2;
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextLong();
                ar[i]=Math.abs(ar[i]);
                if(ar[i]==0)
                {
                    ar[i]=0;
                }
                else if(ar[i]%(long)4==(long)2)
                {
                    ar[i]=2;
                }
                else if(ar[i]%(long)4==(long)0)
                {
                    ar[i]=4;
                }
            }
            long sub=count(ar,n);

            System.out.println(total-sub);

        }
    }
}
