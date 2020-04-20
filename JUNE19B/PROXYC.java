/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t>0)
	    {
	        int d=sc.nextInt();
	        String s=sc.next();
	        int cp=0;
	        for(int i=0;i<d;i++)
	        {
	            if(s.charAt(i)=='P')
	            {
	                cp++;
	            }
	        }
	        int p=0;
	        int i=0;
	        for( i=2;i<d-2;i++)
	        {
	            if((double)cp/d>=0.75)
	            {
	                break;
	            }
	            if(s.charAt(i)=='A'&&((s.charAt(i-2)=='P'||s.charAt(i-1)=='P')&&(s.charAt(i+1)=='P'||s.charAt(i+2)=='P')))
	            {
	                p++;
	                cp++;
	            }
	            
	        }
	        if(i>=d-2&&(double)cp/d<0.75)
	        {
	            System.out.println("-1");
	        }
	        else
	        {
	            System.out.println(p);
	        }
	        
	           
	        t--;
	    }
	}
}