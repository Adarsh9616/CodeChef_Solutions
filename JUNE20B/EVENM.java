import java.io.*;
import java.util.Scanner;

public class EVENM
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    int x=Math.min(Math.min(i,j),Math.min(n-1-i,n-1-j));

                    if(i<=j)
                        out.append((n-2*x)*(n-2*x)-(i-x)-(j-x)+" ");
                    else
                        out.append((n-2*x-2)*(n-2*x-2)+(i-x)+(j-x)+" ");
                }
                out.append("\n");
            }
        }
        out.close();
    }
}