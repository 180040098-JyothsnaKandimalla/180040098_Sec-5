package practice_day_2;
import java.util.Arrays;
import java.util.Scanner;
public class LargeSmallTwoValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n value");
		n=in.nextInt();
		System.out.println("Enter Array Elements value");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		System.out.println("First two large values are:"+a[n-1]+" "+a[n-2]);
		System.out.println("First two small values are:"+a[0]+" "+a[1]);
		

	}

}
