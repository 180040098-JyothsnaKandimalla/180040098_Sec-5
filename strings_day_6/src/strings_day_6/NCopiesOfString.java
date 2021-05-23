package strings_day_6;
import java.util.*;
public class NCopiesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String str;
		str=in.nextLine();
		in.close();
		int n=str.length();
		String f=str.substring(0,2);
		for(int i=0;i<n;i++)
		{
			System.out.print(f);
		}

	}

}
