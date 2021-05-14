package practice_day_2;
import java.util.Scanner;
class SumAvg
{
	int sum,i;
	float Avg;
	void SumAvg(int a[],int n)
	{
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		Avg=sum/n;
		System.out.println("Sum of array elements is:"+sum);
		System.out.println("Average of array elements is:"+Avg);
	}
}

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array values");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		SumAvg obj=new SumAvg();
		obj.SumAvg(a, n);

	}



	}
