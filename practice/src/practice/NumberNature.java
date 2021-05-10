package practice;
class Number
{
	int n;
	void numberKind(int a)
	{
		n=a;
		if(n>0)
			System.out.println(n+" is a POSITIVE number");
		else if(n<0)
			System.out.println(n+" is a NEGATIVE number");
		else
			System.out.println(n+" is ZERO");
	}
}
public class NumberNature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number obj=new Number();
		obj.numberKind(6);
		Number obj1=new Number();
		obj1.numberKind(-89);
		Number obj2=new Number();
		obj2.numberKind(0);
	}

}
