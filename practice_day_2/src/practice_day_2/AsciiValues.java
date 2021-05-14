package practice_day_2;
import java.util.*;
public class AsciiValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n value");
		n=in.nextInt();
		int a[]=new int[5];
		System.out.println("Enter ArrayElement values");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.printf("%c ",a[i]);
		}

	}

}
