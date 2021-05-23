package strings_day_6;
import java.util.*;
public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("Enter a String name");
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		int n,i;
		n=str.length();
		in.close();
		String rev="";
		for(i=n-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	    if(str.equals(rev))
	    {
	    	System.out.println(str+" "+"is a palindrome");
	    }
	    else
	    	System.out.println(str+"is not a palindrome");

	}

}
