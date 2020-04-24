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
		while(t-->0)
		{
		    int n=sc.nextInt();
		    String s=sc.next();
		    int x=0;
		    int y=0;
		    s=" "+s;
		    n=n+1;
		    for(int i=1;i<s.length();i++)
		    {
		        char c=s.charAt(i);
		        char c1=s.charAt(i-1);
		        if(c=='L'&&(c1!='L'&&c1!='R'))
		        {
		            x--;
		        }
		        else if(c=='R'&&(c1!='L'&&c1!='R'))
		        {
		            x++;
		        }
		        else if(c=='U'&&(c1!='D'&&c1!='U'))
		        {
		            y++;
		        }
		        else if(c=='D'&&(c1!='U'&&c1!='D'))
		        {
		            y--;
		        }
		    }
		    System.out.println(x+" "+y);
		}
		
	}
}
