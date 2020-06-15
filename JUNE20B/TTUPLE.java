import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TTUPLE
{
    static boolean check0(int a,int b,int c,int p,int q,int r)
    {
        if(a==p && b==q && c==r)
        {
            return true;
        }
        return false;
    }
    static boolean check1(int a,int b,int c,int p,int q,int r)
    {
        Set<Integer> s=new HashSet<Integer>();
        Set<Integer> m=new HashSet<Integer>();
        s.add(0);
        m.add(1);
        s.add(p-a);
        s.add(q-b);
        s.add(r-c);
        if(s.size()==2)
        {
            return true;
        }
        if( (a==0 && a!=p) || (b==0 && b!=q) || (c==0 && c!=r) )
        {
            return false;
        }
        if( ((a!=0) && (p%a!=0) ) || ((b!=0) && (q%b!=0)) || ((c!=0) && (r%c!=0) ) )
        {
            return false;
        }
        if(a!=0) m.add(p/a);
        if(b!=0) m.add(q/b);
        if(c!=0) m.add(r/c);
        if(m.size()==2)
        {
            return true;
        }
        return false;
    }
    static boolean check2(int a,int b,int c,int p,int q,int r)
    {
        Set<Integer> s=new HashSet<Integer>();
        s.add(0);
        s.add(p-a);
        s.add(q-b);
        s.add(r-c);
        if(s.size()==3)
        {
            return true;
        }
        if(((a==p) || (a!=0 && p%a==0)) && ((b==q) || (b!=0 && q%b==0)) && ((r==c) || (c!=0 && r%c==0)) )
        {
            Set<Integer> s1=new HashSet<Integer>();
            s1.add(1);
            if(a!=0) s1.add(p/a);
            if(b!=0) s1.add(q/b);
            if(c!=0) s1.add(r/c);
            if(s1.size()==3) return true;
        }
        if(a!=b && p!=q && (a*q-p*b)%(p-q)==0) {
            int y = Integer.MAX_VALUE, x = (a * q - p * b) / (p - q);
            if ((a + x) != 0 && p % (a + x) == 0) {
                y = p / (a + x);
            }
            if ((y != Integer.MAX_VALUE) && (c * y == r || (c + x) * y == r || c + x == r || c == r))
            {
                return true;
            }
        }
        if(a!=c && p!=r && (a*r-p*c)%(p-r)==0 )
        {
            int y=Integer.MAX_VALUE,x=(a*r-p*c)/(p-r);
            if((a+x)!=0 && p%(a+x)==0)
                y=p/(a+x);
            if( (y!=Integer.MAX_VALUE) && (b*y==q || (b+x)*y==q || b+x==q || b==q ) )
            {
                return true;
            }
        }
        if(c!=b && r!=q && (c*q-r*b)%(r-q)==0)
        {
            int y=Integer.MAX_VALUE,x=(c*q-r*b)/(r-q);
            if((b+x)!=0 && q%(b+x)==0)
            {
                y=q/(b+x);
            }
            if( (y!=Integer.MAX_VALUE) && (a*y==p || (a+x)*y==p || a+x==p || a==p ) )
            {
                return true;
            }
        }
        int x2=p-a;
        if(check1(p,b,c,p,q,r) || check1(p,b+x2,c+x2,p,q,r) || check1(p,b+x2,c,p,q,r) || check1(p,b,c+x2,p,q,r) )
        {
            return true;
        }
        x2=q-b;
        if(check1(a,q,c,p,q,r) || check1(a+x2,q,c+x2,p,q,r) || check1(a+x2,q,c,p,q,r) || check1(a,q,c+x2,p,q,r)  )
        {
            return true;
        }
        x2=r-c;
        if(check1(a,b,r,p,q,r) || check1(a+x2,b+x2,r,p,q,r) || check1(a+x2,b,r,p,q,r) || check1(a,b+x2,r,p,q,r) )
        {
            return true;
        }
        if(a!=p &&  a!=0 && p%a==0)
        {
            int k=p/a;
            if(check1(p,b,c,p,q,r) || check1(p,b*k,c*k,p,q,r) || check1(p,b*k,c,p,q,r) || check1(p,b,c*k,p,q,r)  )
            {
                return true;
            }
        }
        if(b!=q && b!=0 && q%b==0 )
        {
            int k=q/b;
            if(check1(a,q,c,p,q,r) || check1(a*k,q,c*k,p,q,r) || check1(a*k,q,c,p,q,r) || check1(a,q,c*k,p,q,r)  )
            {
                return true;
            }
        }
        if(c!=r && c!=0 && r%c==0)
        {
            int k=r/c;
            if(check1(a,b,r,p,q,r) || check1(a*k,b*k,r,p,q,r) || check1(a*k,b,r,p,q,r) || check1(a,b*k,r,p,q,r)  )
            {
                return true;
            }
        }

        if( a!=b && (p-q)%(a-b)==0 )
        {
            int x=(p-q)/(a-b);
            int y=p-a*x;
            if(c*x+y==r || c*x==r || c+y==r || c==r)
            {
                return true;
            }
        }
        if(b!=c && (q-r)%(b-c)==0 )
        {
            int x=(q-r)/(b-c);
            int y=q-b*x;
            if(a==p || a*x==p || a+y==p || a*x+y ==p )
            {
                return true;
            }
        }
        if(a!=c && (p-r)%(a-c)==0 )
        {
            int x=(p-r)/(a-c);
            int y=p-a*x;
            if(b==q || b*x+y==q || b*x==q || b+y==q )
            {
                return true;
            }
        }


        return false;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            int r=sc.nextInt();
            if(check0(a,b,c,p,q,r))
            {
                System.out.println(0);
            }
            else if(check1(a,b,c,p,q,r))
            {
                System.out.println(1);
            }
            else if(check2(a,b,c,p,q,r))
            {
                System.out.println(2);
            }
            else
            {
                System.out.println(3);
            }
        }
    }
}
