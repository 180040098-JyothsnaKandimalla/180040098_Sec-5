package strings_day_6;
import java.util.*;
public class FirstLastX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter a string");
		String str,f,l;
		str=in.nextLine();
		in.close();
		int n=str.length();
		f=str.substring(0,1);
		l=str.substring(n-1,n);
		if(f.equals("x") && l.equals("x"))
		{
			System.out.println(str.substring(1,n-1));
		}
		else
		{
			System.out.println(str);
		}

	}

}
