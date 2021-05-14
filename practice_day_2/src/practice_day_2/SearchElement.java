package practice_day_2;
import java.util.Scanner;
public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,flag=0,i;
		System.out.println("Enter n value");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		System.out.println("Enter Array Element Values");
		int a[]=new int[5];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter search element value");
		x=in.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
			System.out.println("Index of Searched Element is:"+i);
		else
			System.out.println(-1);

	}

}
