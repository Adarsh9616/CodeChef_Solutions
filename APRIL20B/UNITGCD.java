/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            if(n==1)
            {
                out.write("1");
                out.write("\n");
            }
            else
            {
                out.write(""+n/2);
                out.write("\n");
            }
            if(n==1)
            {
                out.write("1 1");
                out.write("\n");
            }
            else if(n==2)
            {
                out.write("2 1 2");
                out.write("\n");
            }
            else if(n==3)
            {
                out.write("3 1 2 3");
                out.write("\n");
            }
            else if(n%2==0)
            {
                out.write("3 1 2 3");
                out.write("\n");
                for(int i=4;i<n;i=i+2)
                {
                    out.write("2 "+i+" "+(i+1));
                    out.write("\n");
                }
                out.write("1 "+n);
                out.write("\n");
            }
            else
            {
                out.write("3 1 2 3");
                out.write("\n");
                for(int i=4;i<=n;i=i+2)
                {
                        out.write("2 " + i + " " + (i + 1));
                        out.write("\n");
                }
            }
            out.flush();

        }
    }
}
