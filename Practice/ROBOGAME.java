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
            String s=sc.next();
            int l=s.length();
            int ar[]=new int[l+18];
            for(int i=0;i<l;i++)
            {
                char c=s.charAt(i);
                if(Character.isDigit(c))
                {
                    ar[i+9]=ar[i+9]+1;
                    for(int j=1;j<=Character.getNumericValue(c);j++)
                    {
                        ar[i+j+9]=ar[i+j+9]+1;
                        ar[i-j+9]=ar[i-j+9]+1;
                    }
                }
            }
            int i;
            /*for(i=9;i<l+9;i++)
            {
            	System.out.print(ar[i]);
            }
            System.out.println();
            */
            for(i=9;i<l+9;i++)
            {
                if(ar[i]>1)
                {
                    break;
                }
            }
            if(i!=(l+9))
            {
                System.out.println("unsafe");
            }
            else
            {
                System.out.println("safe");
            }
            t--;
        }
    }
}
