package practice_day_2;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySorting {

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
		System.out.println("Sorted Array Elements are:");
		for(i=0;i<n;i++)
		{
			System.out.printf("%d ",a[i]);
		}

	}

}
