package inheritance_day_4;
import java.util.*;
class Shape
{
	void draw(String name)
	{
		System.out.println("Drawing "+name);
	}
	void erase(String name)
	{
		System.out.println("Erasing "+name);

	}
}
class Circle extends Shape
{
	String shape;
	Circle(String name)
	{
		this.shape=name;
	}
	void draw(String shape)
	{
	  super.draw(shape);
	}
	void erase(String shape)
	{
	   super.erase(shape);
	}
}
class Triangle extends Shape
{
	String shape;
	Triangle(String name)
	{
		this.shape=name;
	}
	void draw(String shape)
	{
	  super.draw(shape);
	}
	void erase(String shape)
	{
	   super.erase(shape);
	}
}
class Square extends Shape
{
	String shape;
	Square(String name)
	{
		this.shape=name;
	}
	void draw(String shape)
	{
	  super.draw(shape);
	}
	void erase(String shape)
	{
	   super.erase(shape);
	}
}
public class OverridingSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in=new Scanner(System.in);
     String shape;
     System.out.println("Enter shape name");
     shape=in.nextLine();
     in.close();
     if(shape.equals("circle"))
     {
    	 Shape c=new Circle(shape);
    	 c.draw(shape);
    	 c.erase(shape);
     }
     else if(shape.equals("triangle"))
     {
    	 Shape t=new Triangle(shape);
    	 t.draw(shape);
    	 t.erase(shape);
     }
     else if(shape.equals("square"))
     {
    	 Shape s=new Square(shape);
    	 s.draw(shape);
    	 s.erase(shape);
     }
     else
     {
    	 System.out.println("Enter a valid shape");
     }
	}

}
