package practice;
class Reverse
{
	int n;
	int rev=0;
	void setAssignment(int a)
	{
		int r;
		n=a;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
	}
	void display()
	{
		System.out.println("Reversed Number is:"+rev);
	}
}
public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse obj=new Reverse();
		obj.setAssignment(1234);
		obj.display();
		Reverse obj1=new Reverse();
		obj1.setAssignment(1004);
		obj1.display();
	}

}

