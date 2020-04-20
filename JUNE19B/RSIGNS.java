/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  static public BigInteger cbrt(BigInteger val) {
		return root(3, new BigDecimal(val)).toBigInteger();
	}
	static private BigDecimal root(final int n, final BigDecimal x) {
		if (x.compareTo(BigDecimal.ZERO) < 0) {
			throw new ArithmeticException("negative argument " + x.toString()
					+ " of root");
		}
		if (n <= 0) {
			throw new ArithmeticException("negative power " + n + " of root");
		}
		if (n == 1) {
			return x;
		}
		BigDecimal s = new BigDecimal(Math.pow(x.doubleValue(), 1.0 / n));
		final BigDecimal nth = new BigDecimal(n);
		final BigDecimal xhighpr = scalePrec(x, 2);
		MathContext mc = new MathContext(2 + x.precision());
		final double eps = x.ulp().doubleValue() / (2 * n * x.doubleValue());
		for (;;) {
		
			BigDecimal c = xhighpr.divide(s.pow(n - 1), mc);
			c = s.subtract(c);
			MathContext locmc = new MathContext(c.precision());
			c = c.divide(nth, locmc);
			s = s.subtract(c);
			if (Math.abs(c.doubleValue() / s.doubleValue()) < eps) {
				break;
			}
		}
		return s.round(new MathContext(err2prec(eps)));
	}
	static private BigDecimal scalePrec(final BigDecimal x, int d) {
		return x.setScale(d + x.scale());
	}
	static private int err2prec(double xerr) {
		
		return 1 + (int) (Math.log10(Math.abs(0.5 / xerr)));
	}
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n;
		
		while(t>0)
		{
		    n=sc.nextInt();
		    BigInteger b1,b2,b3; 
            b1 = new BigInteger("8"); 
            b3 = new BigInteger("10");
		    b2 = new BigInteger("1000000007"); 
            BigInteger result = cbrt(b1.pow(n-1)).multiply(b3).remainder(b2);
		    System.out.println(result);
		    t--;
		}
	}
}
