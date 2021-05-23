package exception_handling_day_7;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MultipleCatch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the arrays");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array: ");
		try 
		{
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
				
			 System.out.println("Enter the index of the array element you want to access");
             int index = sc.nextInt();
			 System.out.println("The array element at index " + index + " = " + arr[index]);
			 System.out.println("The array element successfully accessed");
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			 System.out.println(e);
		} 
		catch (InputMismatchException e1) 
		{
			 System.out.println(e1);
		}
      
       sc.close();

	}
}

	
