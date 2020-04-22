/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.Point;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int n=sc.nextInt();
			int m=sc.nextInt();
			int k=sc.nextInt();
			Point ar1[]=new Point[n];
			Point ar2[]=new Point[m];
			Point ar3[]=new Point[k];
			for(int i=0;i<n;i++)
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				ar1[i]=new Point(a, b);
			}
			for(int i=0;i<m;i++)
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				ar2[i]=new Point(a, b);
			}
			for(int i=0;i<k;i++)
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				ar3[i]=new Point(a, b);
			}
			double min1=Double.MAX_VALUE;
			for(int i=0;i<n;i++)
			{	double dis11=Point.distance(x, y, ar1[i].getX(),ar1[i].getY());		
				if(dis11>min1)
				{
					continue;
				}
				for(int j=0;j<m;j++)
				{	
					double dis22=Point.distance(ar1[i].getX(),ar1[i].getY(), ar2[j].getX(),ar2[j].getY());
					double dis44=Point.distance(x, y, ar2[j].getX(),ar2[j].getY());
					double dis55=Point.distance(ar2[j].getX(),ar2[j].getY(), ar1[i].getX(),ar1[i].getY());
					if(dis22>min1||dis44>min1||dis55>min1)
					{
						continue;
					}
					for(int l=0;l<k;l++)
					{
						double dis1=Point.distance(x, y, ar1[i].getX(),ar1[i].getY());
						double dis2=Point.distance(ar1[i].getX(),ar1[i].getY(), ar2[j].getX(),ar2[j].getY());
						double dis3=Point.distance(ar2[j].getX(),ar2[j].getY(), ar3[l].getX(),ar3[l].getY());
						double dis4=Point.distance(x, y, ar2[j].getX(),ar2[j].getY());
						double dis5=Point.distance(ar2[j].getX(),ar2[j].getY(), ar1[i].getX(),ar1[i].getY());
						double dis6=Point.distance(ar1[i].getX(),ar1[i].getY(), ar3[l].getX(),ar3[l].getY());
						double rm=0;
						double sum1=dis1+dis2+dis3;
						double sum2=dis4+dis5+dis6;
						if(sum1>sum2)
						{
							rm=sum2;
						}
						else
						{
							rm=sum1;
						}
						if(min1>rm)
						{
							min1=rm;
						}
					}
				}
				
			}
			System.out.println(min1);
			t--;
		}
	}
}