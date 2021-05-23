package exception_handling_day_7;
import java.util.*;
class ExceptionHandling1
{
	double division(int x,int y)throws ArithmeticException
	{
		double s=x/y;
		return s;
	}
}
public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two Integers");
		Scanner in=new Scanner(System.in);
		int a,b;
		a=in.nextInt();
		b=in.nextInt();
		ExceptionHandling1 obj=new ExceptionHandling1();
		try
		{
			double r=obj.division(a,b);
			System.out.println("The quotient of "+a+"/"+b+"="+r);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("DivideByZeroException caught");
		}
		finally
		{
			System.out.println("Inside Finally Block");
		}
        in.close();
	}

}
