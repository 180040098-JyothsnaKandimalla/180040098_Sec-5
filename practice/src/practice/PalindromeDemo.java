package practice;
class Palindrome
{
	int n,t;
	int rev=0;
	void setAssignment(int a)
	{
		int r;
		n=a;
		t=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
	}
	void display()
	{
		if(t==rev)
		{
			System.out.println(t+" is a PALINDROME Number");
		}
		else
		{
			System.out.println(t+" is not a PALINDROME Number");
		}
		
	}
}

public class PalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome obj=new Palindrome();
		obj.setAssignment(1234);
		obj.display();
		Palindrome obj1=new Palindrome();
		obj1.setAssignment(110011);
		obj1.display();
	}

}



