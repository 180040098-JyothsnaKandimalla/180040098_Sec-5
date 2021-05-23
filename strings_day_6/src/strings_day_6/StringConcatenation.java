package strings_day_6;
import java.util.Scanner;
public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two Strings");
		String str,str1;
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		str1=in.nextLine();
		in.close();
		str=str.concat(str1);
		System.out.println(str.toLowerCase());

	}

}
