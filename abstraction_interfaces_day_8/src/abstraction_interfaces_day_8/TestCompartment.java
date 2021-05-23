package abstraction_interfaces_day_8;
import java.util.*;
abstract class Compartment
{
	public abstract String notice();
}
class FirstClass extends Compartment
{
	public String notice()
	{
		return ("This call belongs to First Class");
	}
}
class LadiesClass extends Compartment
{
	public String notice()
	{
		return ("This call belongs to Ladies");
	}
}
class GeneralClass extends Compartment
{
	public String notice()
	{
		return ("This call belongs to General Class");
	}
}
class LuggageClass extends Compartment
{
	public String notice()
	{
		return ("This call belongs to Luggage Class");
	}
}
public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n,i;
		FirstClass f=new FirstClass();
		LadiesClass l=new LadiesClass();
		GeneralClass g=new GeneralClass();
		LuggageClass lu=new LuggageClass();
		String s;
		System.out.println("Enter array size");
		n=in.nextInt();
		System.out.println("Enter array elements");
		int comp[]=new int[n];
		for(i=0;i<n;i++)
		{
			comp[i]=in.nextInt();
			if(comp[i]==1)
			{
				s=f.notice();
				System.out.println(s);
			}
			else if(comp[i]==2)
			{
				s=l.notice();
				System.out.println(s);
			}
			else if(comp[i]==3)
			{
				s=g.notice();
				System.out.println(s);
			}
			else if(comp[i]==4)
			{
				s=lu.notice();
				System.out.println(s);
			}
			else
			{
				System.out.println("Please enter current boggiee number");
			}

		}
		in.close();
		

	}

}
