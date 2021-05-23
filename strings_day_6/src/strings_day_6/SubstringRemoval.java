package strings_day_6;
import java.util.*;
public class SubstringRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String name");
		String str;
		str=in.nextLine();
		int n=str.length();
		in.close();
		int i;
		for(i=0;i<n;i++)
		{
			String f=str.substring(i,i+1);
			if(f.equals("*"))
			{
				
				break;
			}
		}
		System.out.println(str.substring(0,i-1)+str.substring(i+2,n));
		

	}

}
