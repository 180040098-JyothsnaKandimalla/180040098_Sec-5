package practice;
class Main
{
	int n;
	void evenOdd(int n)
	{
		this.n=n;
		if(n%2==0)
			System.out.println(n+" is a EVEN number");
		else
			System.out.println(n+" is a ODD number");
	}
}

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj=new Main();
		obj.evenOdd(6);
		Main obj1=new Main();
		obj1.evenOdd(15);
		
	}

}

