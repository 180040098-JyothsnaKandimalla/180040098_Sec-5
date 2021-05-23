package exception_handling_day_7;
import java.util.*;

public class NumberFormatexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		String str;
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		in.close();
		try
		{
			int n=Integer.parseInt(str);
			System.out.println(n*n);
			System.out.println("The work has been done successfully");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered input is not a valid format for an integer");
		}
		

	}

}
