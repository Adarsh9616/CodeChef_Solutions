/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int ar[][]=new int[n][k];
            int br[][]=new int[n][m];
            int x[]=new int[n];
            int y[]=new int[n];
            Arrays.fill(y,-1);
            for(int i=0;i<n;i++)
            {
                int max=-1;
                int count=-1;
                for(int j=0;j<k;j++)
                {
                    ar[i][j]=sc.nextInt();
                    br[i][ar[i][j]-1]++;
                }
                for(int j=0;j<m;j++)
                {
                    if(br[i][j]>max)
                    {
                        count=br[i][j];
                        max=j+1;
                    }
                }
                x[i]=max;
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(x[i]+" ");
            }
            System.out.println();
        }
    }
}
