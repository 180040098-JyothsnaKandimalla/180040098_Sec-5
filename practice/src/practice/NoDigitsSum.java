package practice;
class DigitsSum
{
	int n;
	int sum=0;
	void setAssignment(int a)
	{
		int r;
		n=a;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
	}
	void display()
	{
		System.out.println(sum);
	}
}
public class NoDigitsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DigitsSum obj=new DigitsSum();
		obj.setAssignment(12345);
		obj.display();
	}

}
