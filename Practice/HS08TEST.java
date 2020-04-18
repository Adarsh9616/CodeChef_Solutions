import java.util.Scanner;
class atm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		float b=sc.nextFloat();
		if(a%5==0&&b>=(a+0.5))
		{
			System.out.println(b-a-0.5);
		}
		else
		{
			System.out.println(b);
		}
	}
}