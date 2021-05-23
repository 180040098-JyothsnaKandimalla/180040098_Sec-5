package strings_day_6;
import java.util.*;
public class StringReturning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str;
		System.out.println("Enter a string");
		str=in.nextLine();
		in.close();
        int n=str.length();
        if(n%2==0)
        	System.out.println(str.substring(0,n/2));
        else
        	System.out.println("null");

	}

}
