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
		    String f=""+s.charAt(0);
		    String l=""+s.charAt(s.length()-1);
		    int sum=Integer.parseInt(f)+Integer.parseInt(l);
		    System.out.println(sum);
		    t--;
		}
	}
}
