package practice;
class Prime
{
	int a;
	void printingNumbers(int p)
	{
		a=p;
		
	}
	void displayPrime()
	{
		int i,c=0;
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
			   c=c+1;
		}
		if(c==2)
			System.out.println("Prime");
		else
			System.out.println("NotPrime");
	}
}
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime obj=new Prime();
		obj.printingNumbers(10);
		obj.displayPrime();
		Prime obj1=new Prime();
		obj1.printingNumbers(23);
		obj1.displayPrime();
	}

}

