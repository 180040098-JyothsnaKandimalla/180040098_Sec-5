package inheritance_day_4;
class Animal
{
	void eat()
	{
		System.out.println("Animals can eat");
	}
	void sleep()
	{
		System.out.println("Animal can sleeps");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Birds can eat");
	}
	void sleep()
	{
		System.out.println("Birds can sleep");
	}
	void fly()
	{
		System.out.println("Birds fly in the air");
	}
}

public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}

}
