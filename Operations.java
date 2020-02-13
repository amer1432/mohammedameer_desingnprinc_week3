import java.util.*;
import java.lang.Exception;
public class Operations {
	public double Addition(double a,double b)
	{
		return a+b;
	}
	public double Multiplication(double a,double b)
	{
		return a*b;
	}
	public double Substraction(double a,double b)
	{
		return a-b;
	}
	public double Division(double a, double b)
	{
		try {
			return a/b;
		}
		catch(Exception er)
		{
			System.out.println("denominator cannot be equal to zero:"+er);
		}
		return 0;
	}
}