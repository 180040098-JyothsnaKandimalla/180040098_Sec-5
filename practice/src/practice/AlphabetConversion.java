package practice;
class Conversion
{
	char ch;
	char ch1;
	void allocation(char x)
	{
		ch=x;
		int p=(int)ch;
		int z=p;
		if(p>=65&&p<=90)
			z=z+32;
		else if(p>=97&&p<=122)
			z=z-32;
	    ch1=(char)z;
		
	}
	void display()
	{
		System.out.println(ch1);
	}
}
public class AlphabetConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conversion obj=new Conversion();
		obj.allocation('p');
		obj.display();
		Conversion obj1=new Conversion();
		obj1.allocation('E');
		obj1.display();
	}

}


