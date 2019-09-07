import java.util.*;
import java.lang.Math;
class Quad
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		double r1,r2,im;
		System.out.println("Enter the Coefficient:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int d=(b*b-(4*a*c));
		System.out.println("Discriminant="+d);
		if(d>0)
		{
			System.out.println("Roots are real and distinct.\n");
			r1=(-b+Math.sqrt(d)/(2*a));
			r2=(-b-Math.sqrt(d)/(2*a));
			System.out.println("Roots are:"+r1+"and"+r2);
		}
		else if(d==0)
		{
			System.out.println("Roots are real*equal.\n");
			r1=r2=-b/(2*a);
			System.out.println("Roots="+r1+"and"+r2);
		}
		else
		{
			System.out.println("Roots are imaginary.");
			r1=((-b)/2*a);
			im=(Math.sqrt(-d)/(2*a));
			System.out.println("Roots :"+r1+"+i"+im+"and"+r1+"-i"+im);
		}
	}
}
