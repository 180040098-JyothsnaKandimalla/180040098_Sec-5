package strings_day_6;
import java.util.*;
class Matching
{
	public String wordEnds(String str, String word) {
		  int slen = str.length();
		        int wlen = word.length();
		        String result = "";

		        for (int i = 0; i < slen - wlen + 1; i++) {
		            if (str.substring(i, i + wlen).equals(word)) {
		                if (i != 0) {
		                    result += str.substring(i - 1, i);
		                }
		                if (i + wlen != slen) {
		                    result += str.substring(i + wlen, i + wlen + 1);
		                }
		            }
		        }
		        return result;
		}
}
public class StringMatchingandConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter two strings");
		Scanner in=new Scanner(System.in);
		String a,b;
		a=in.nextLine();
		b=in.nextLine();
		in.close();
		Matching m=new Matching();
		String s=m.wordEnds(a,b);
		System.out.println(s);


	}

}
