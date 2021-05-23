package strings_day_6;
import java.util.Scanner;
public class FirstLatRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		s=in.nextLine();
		in.close();
	    int n=s.length();
	    System.out.println(s.substring(1,n-1));
	}

}
