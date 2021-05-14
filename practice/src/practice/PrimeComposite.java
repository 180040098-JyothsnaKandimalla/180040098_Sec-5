package practice;
import java.util.*;
public class PrimeComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n value");
        n=in.nextInt();
        in.close();
        if(n==0 || n==1)
        {
        	System.out.println(n+" is neither prime or composite number");
        }
        else
        {
        	int i,flag=0;
        	for(i=2;i<n/2;i++)
        	{
        		if(n%i==0)
        		{
        			flag=1;
        			break;
        		}
        	}
        	if(flag==0)
        	{
        		System.out.println(n+" is a prime number");
        	}
        	else if(flag==1)
        	{
        		System.out.println(n+" is a composite number");
        	}
        }
	}

}
