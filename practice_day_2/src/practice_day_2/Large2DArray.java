package practice_day_2;

import java.util.Arrays;
import java.util.Scanner;

public class Large2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,i,j,max=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter row and column size");
		m=in.nextInt();
		n=in.nextInt();
		System.out.println("Enter Array Elements value");
		int a[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=in.nextInt();
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println("Largest Element in 2D Array is:"+max);

	}

}
