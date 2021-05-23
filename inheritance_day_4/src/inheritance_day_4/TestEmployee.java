package inheritance_day_4;
import java.util.*;
class Person
{
	String pname;
	Person()
	{
		System.out.println("This is a Super class");
	}
	public Person(String name)
	{
		pname=name;
	}
}
class Employee extends Person
{
	double empsal;
	String insno;
	int year;
	public Employee(double empsal,int year,String insno,String name)
	{
		super(name);
		this.empsal=empsal;
		this.year=year;
		this.insno=insno;
	}
	Employee()
	{
		System.out.println("This is a Sub class");
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,insno;
		int year;
		double sal;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name,insno,year,sal");
		name=in.nextLine();
		insno=in.nextLine();
		year=in.nextInt();
		sal=in.nextDouble();
		in.close();
		Employee e1=new Employee();
		Employee e=new Employee(sal,year,insno,name);
		System.out.println("Employee name is:"+e.pname);
		System.out.println("Employee Salary is:"+e.empsal);
		System.out.println("Employee Starting year is:"+e.year);
		System.out.println("Employee Insurance no is:"+e.insno);
		}

}
