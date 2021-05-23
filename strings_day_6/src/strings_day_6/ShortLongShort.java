package strings_day_6;
import java.util.*;
public class ShortLongShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a two string namse");
		String str,str1;
		str=in.nextLine();
		str1=in.nextLine();
		int n,n1;
		n=str.length();
		n1=str1.length();
		in.close();
		if(n>n1)
		{
			System.out.println(str1+str+str1);
		}
		else if(n1>n)
		{
			System.out.println(str+str1+str);
		}
		else
		{
			System.out.println("Enter two strings with different lengths");
		}

	}

}
