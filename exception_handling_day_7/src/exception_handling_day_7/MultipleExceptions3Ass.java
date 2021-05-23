package exception_handling_day_7;

import java.util.Scanner;

public class MultipleExceptions3Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a array size");
		Scanner in=new Scanner(System.in);
		int n,i,x;
		n=in.nextInt();
		System.out.println("Enter a array elements");
        String a[]=new String[n];
		int b[]=new int[n];
		try
		{  
		    for(i=0;i<n;i++)
		   {
			   a[i]=in.next();
			   b[i]=Integer.parseInt(a[i]);
		   }
		}
		catch(NumberFormatException e1)
		{
			System.out.println(e1);
		}
		
		try
		{  
			System.out.println("Enter a index value you want to excess ");
			x=in.nextInt();
			System.out.println("Element at index "+x+" is "+a[x]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}

}
