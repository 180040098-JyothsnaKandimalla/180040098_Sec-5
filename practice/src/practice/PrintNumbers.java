package practice;
class Print
{
	int n;
	void printingNumbers(int p)
	{
		n=p;
	}
	void display()
	{
		int i;
		for(i=1;i<=n;i++)
		{
			System.out.printf("%d ",i);
		}
	}
}
public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print obj=new Print();
		obj.printingNumbers(10);
		obj.display();

	}

}

