package practice_day_2;
import java.util.*;
public class Reverse2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,i,j;
		System.out.println("Enter row and column size");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		m=in.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter array elements values");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		System.out.println("Printing array elements in reverse order");
		for(i=m-1;i>=0;i--)
		{
			for(j=n-1;j>=0;j--)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.println();
		}
	}

}
