package exception_handling_day_7;
import java.util.Scanner;
class ExceptionHandling
{   
	double s;
	double division(int a,int b)
	{
		s=a/b;
		return s;
	}
}

public class ThrowsArthimeticException {

	public static void main(String[] args)throws ArithmeticException
	{
		// TODO Auto-generated method stub
		System.out.println("Enter two Integers");
		Scanner in=new Scanner(System.in);
		int p,q;
		p=in.nextInt();
		q=in.nextInt();
		in.close();
		ExceptionHandling obj=new ExceptionHandling(); 
		try
		{
			double r=obj.division(p,q);
			System.out.println(r);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		in.close();

	}

}
