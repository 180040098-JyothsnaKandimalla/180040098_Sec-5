package practice;
class Even
{
	int a,b;
	void printingNumbers(int p,int q)
	{
		a=p;
		b=q;
	}
	void display()
	{
		int i;
		for(i=a;i<=b;i++)
		{
			if(i%2==0)
			   System.out.println(i);
		}
	}
}

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even obj=new Even();
		obj.printingNumbers(23,57);
		obj.display();

	}

}

