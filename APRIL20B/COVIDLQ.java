/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
            int ar[]=new int[n+6];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            int flag=0;
            for(int i=0;i<n;i++)
            {
                if(ar[i]==1&&(ar[i+1]==1||ar[i+2]==1||ar[i+3]==1||ar[i+4]==1||ar[i+5]==1))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }

        }

    }
}
