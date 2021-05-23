package strings_day_6;
import java.util.*;

public class MultipleLastNCopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String str;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string and an Integer");
		str=in.nextLine();
		n=in.nextInt();
		in.close();
		int n1=str.length();
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(str.substring(n1-n,n1));
	    }
		
		

	}

}
