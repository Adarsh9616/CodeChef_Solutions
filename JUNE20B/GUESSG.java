import java.util.Arrays;
import java.util.Scanner;


public class GUESSG
{
    static Scanner sc=new Scanner(System.in);
    static long solve(long ar[])
    {
        while(true)
        {
            if(ar.length<4)
            {
                for(long a :ar)
                {
                    System.out.println(a);
                    String s=sc.next();
                    if(s.equals("E"))
                    {
                        return a;
                    }
                }
            }
            long m=ar.length;
            long b1=m/3;
            long b2=2*b1;
            System.out.println(ar[(int)b1]);
            String s1=sc.next();
            if(s1.equals("E"))
            {
                return ar[(int)b1];
            }
            System.out.println(ar[(int)b2]);
            String s2=sc.next();
            if(s2.equals("E"))
            {
                return ar[(int)b2];
            }
            else if(s1.equals("L")&&s2.equals("L"))
            {
                ar= Arrays.copyOfRange(ar, 0, (int) b2);
                continue;
            }
            else if(s1.equals("G")&&s2.equals("G"))
            {
                ar= Arrays.copyOfRange(ar, (int) (b1+1), ar.length);
                continue;
            }
            System.out.println(ar[(int)b2]);
            String s3=sc.next();
            if(s2.equals("L")&&s3.equals("L"))
            {
                ar= Arrays.copyOfRange(ar, 0, (int)b2);
                continue;
            }
            else if(s2.equals("G")&&s3.equals("G"))
            {
                ar= Arrays.copyOfRange(ar, (int) (b2+1), ar.length);
                continue;
            }
            System.out.println(ar[(int) b1]);
            String s4=sc.next();
            if(s3.equals("L")&&s4.equals("L"))
            {
                ar= Arrays.copyOfRange(ar, 0, (int) b2);
                continue;
            }
            else if(s3.equals("G")&&s4.equals("G"))
            {
                ar= Arrays.copyOfRange(ar, (int) (b1+1), ar.length);
                continue;
            }
            else
            {
                long arr[]=Arrays.copyOfRange(ar, 0, (int) b1);
                long arrr[]=Arrays.copyOfRange(ar, (int) (b2+1), ar.length);
                ar=new long[arr.length+arrr.length];
                System.arraycopy(arr, 0, ar, 0, arr.length);
                System.arraycopy(arrr, 0, ar, arr.length, arrr.length);
                continue;
            }
        }
    }
    public static void main(String args[])
    {

        long n=sc.nextInt();
        if(n<=100000)
        {
            long ar[]=new long[(int)n];
            for(long i=0;i<n;i++)
            {
                ar[(int)i]=i+1;
            }
            System.out.println(solve(ar));
        }
        else
        {
            long x=1,y= n;
            char ch='\0';
            long end=n,start=1;
            long end1=n,start1=1;
            long mid=(start+end)/2;
            long mid1=(start1+end1)/2;
            while(ch!='E')
            {

                System.out.println(mid);
                String s1=sc.next();
                ch=s1.charAt(0);
                if(ch=='E')
                    break;
                else if(ch=='L')
                {
                    end=mid;
                    mid=(start+end)/2;
                }
                else if(ch=='G')
                {
                    start=mid;
                    mid=(start+end)/2;
                }
                System.out.println(mid1);
                s1=sc.next();
                ch=s1.charAt(0);
                if(ch=='E')
                    break;
                else if(ch=='L')
                {
                    end1=mid1;
                    mid1=(start1+end1)/2;
                }
                else if(ch=='G')
                {
                    start1=mid1;
                    mid1=(start1+end1)/2;
                }

            }
        }

    }

}
