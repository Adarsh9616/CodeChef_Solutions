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
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a-b;
		String s=String.valueOf(c);
		int l=s.length();
		int d=c%10;
		s=s.substring(0,l-1)+(d==9?--d:++d);
		System.out.println(s);
	}
}
