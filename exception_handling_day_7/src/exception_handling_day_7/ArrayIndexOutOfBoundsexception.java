package exception_handling_day_7;
import java.util.*;
public class ArrayIndexOutOfBoundsexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a array size");
		Scanner in=new Scanner(System.in);
		int n,i,x;
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter a array elements");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
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
