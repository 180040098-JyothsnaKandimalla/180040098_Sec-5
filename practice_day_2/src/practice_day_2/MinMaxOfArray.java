package practice_day_2;
import java.util.Arrays;
import java.util.Scanner;
public class MinMaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n Value");
		n=in.nextInt();
		System.out.println("Enter array Element Values");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
        Arrays.sort(a);
        System.out.println("Minimum Element of the Array is:"+a[0]);
        System.out.println("Maximum Element of the Array is:"+a[n-1]);
	}

}

