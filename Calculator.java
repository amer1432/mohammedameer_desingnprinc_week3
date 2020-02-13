import java.util.*;
import java.lang.Exception;
public class Calculator extends Operations{

	public static void main(String[] args) {

		int n;
		double a,b;
		Scanner sc = new Scanner(System.in);
		Operations op=new Operations();
		System.out.println("Enter two numbers on which operations are to be performed: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Choose the operation to be performed:\n 1. Addition\n 2.Multiplication\n 3.Substraction\n 4.Division\n ");
		n=sc.nextInt();
		try {
			switch(n)
			{
				case 1: System.out.println("Addition of given two numbers is: "+op.Addition(a,b));break;
				case 2: System.out.println("Multiply of given two numbers is: "+op.Multiplication(a,b));break;
				case 3: System.out.println("Substraction of given two numbers is: "+op.Substraction(a,b));break;
				case 4: System.out.println("Division of given two numbers is: "+op.Division(a,b));
			}
		}
		catch(Exception er)
		{
			System.out.println("Please choose a valid option");
		}
		sc.close();
	}
	

}