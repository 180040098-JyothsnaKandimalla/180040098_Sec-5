package practice;
import java.util.*;
public class Assignment19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("enter n value");
		n=in.nextInt();
		in.close();
		int count=0,i=0;
		while(count!=n)
		{
			i++;
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println(i);
				count++;
			}
		}

	}

}
