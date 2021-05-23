package abstraction_interfaces_day_8;
import java.util.*;
abstract class Instrument
{
	public abstract void functionplay();
}
class Piano extends Instrument
{
	public void functionplay()
	{
		System.out.println("Piano is playing  tan tan tan tan");
	}
}
class Flute extends Instrument
{
	public void functionplay()
	{
		System.out.println("Flute is playing  toot toot toot toot");
	}
}
class Guitar extends Instrument
{
	public void functionplay()
	{
		System.out.println("Guitar is playing  tin  tin  tin ");
	}
}

public class InstrumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piano p=new Piano();
		Flute f=new Flute();
		Guitar g=new Guitar();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=Integer.parseInt(in.nextLine());
		System.out.println("Enter array elements");
		String ins[]=new String[n];
		for(int i=0;i<n;i++)
		{
			ins[i]=in.nextLine();
			if(ins[i].equals("piano"))
			{
				p.functionplay();
			}
			else if(ins[i].equals("flute"))
			{
				f.functionplay();
			}
			else if(ins[i].equals("guitar"))
			{
				g.functionplay();
			}
			
			else
			{
				System.out.println("Please enter current instrument name");
			}

		}
		in.close();
		

	}

}
