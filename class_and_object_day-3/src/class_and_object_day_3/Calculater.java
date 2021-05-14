package class_and_object_day_3;
import java.util.*;
import java.lang.Math.*;
class calci
{

	static double powerInt(int num1,int num2)
    {
        return Math.pow(num1,num2);
    }
   static double powerDouble(double num1,double num2)
   {
    return Math.pow(num1,num2);
    }
}
public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		double p,q;
		System.out.println("enter two integer values");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("enter two double values");
		p=in.nextDouble();
		q=in.nextDouble();
		System.out.println(calci.powerDouble(p,q));
	    System.out.println(calci.powerInt(x,y));
		

	}

}
