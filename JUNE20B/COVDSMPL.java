import java.util.Scanner;

public class COVDSMPL
{
    static Scanner sc=new Scanner(System.in);
    static void solve()
    {
        int n=sc.nextInt();
        int p=sc.nextInt();
        int a[][]=new int[n][n];
        int sum[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++) {
                System.out.println("1 1 1 " + (i + 1) + " " + (j + 1));
                int x = sc.nextInt();
                sum[i][j] = x;
                if (i == 0 && j == 0) {
                    a[i][j] = x;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0&&j>0)
                {
                    a[i][j]=sum[i][j]-sum[i][j-1];
                }
                else if(j==0&&i>0)
                {
                    a[i][j]=sum[i][j]-sum[i-1][j];
                }
                else if(i>0&&j>0)
                {
                    a[i][j]=sum[i][j]-sum[i-1][j]-sum[i][j-1]+sum[i-1][j-1];
                }
            }
        }
        System.out.println(2);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
        int x=sc.nextInt();
        if(x==-1)
        {
            return;
        }


    }
    public static void main(String args[])
    {

        int t=sc.nextInt();
        while(t-->0)
        {
            solve();
        }
    }


}
