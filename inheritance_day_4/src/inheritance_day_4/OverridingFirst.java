package inheritance_day_4;
import java.util.*;
class Fruit
{
	String size,taste,name;
	void eat(String name,String taste,String size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
		System.out.println("Fruit name is:"+name);
		System.out.println("Fruit taste is:"+taste);
		System.out.println("Fruit size is:"+size);
	}
}
class Apple extends Fruit
{
	void eat(String name,String taste,String size)
	{
		super.eat(name, taste, size);
	}
}
class Orange extends Fruit
{
	void eat(String name,String taste,String size)
	{
		super.eat(name, taste, size);
	}
}

public class OverridingFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Fruit Name");
		Scanner in=new Scanner(System.in);
		String name,taste,size;
		name=in.nextLine();
		if(name.equals("Orange"))
		{
			System.out.println("Enter "+name+" fruit taste and size");
			taste=in.nextLine();
			size=in.nextLine();
			Orange o=new Orange();
			o.eat(name,taste,size);
		}
		else if(name.equals("Apple"))
		{
			System.out.println("Enter "+name+" fruit taste and size");
			taste=in.nextLine();
			size=in.nextLine();
			in.close();
			Apple a=new Apple();
			a.eat(name,taste,size);
		}
		else
		{
			System.out.println("Enter valid fruit Name");
		}

	}

}
