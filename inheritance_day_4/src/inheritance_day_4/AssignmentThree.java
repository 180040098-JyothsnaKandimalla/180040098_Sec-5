package inheritance_day_4;
import java.util.*;
class Person1
{
	String name,dob;
	Person1()
	{
		System.out.println("This is a Super class");
	}
	Person1(String name,String dob)
	{
		this.name=name;
		this.dob=dob;
	}
}
class Teacher extends Person1
{
	int sal;
	String sub;
	Teacher()
	{
		System.out.println("This is a Teacher Sub class");
	}
	Teacher(String name,String dob,int sal,String sub)
	{
		super(name,dob);
		this.sal=sal;
		this.sub=sub;
	}
}
class Student extends Person1
{
	int stuid;
	Student()
	{
		System.out.println("This is a Student Sub class");
	}
	Student(String name,String dob,int id)
	{
		super(name,dob);
		stuid=id;
	}
}
class CollegeStudent extends Student
{
	String cname;
	int sy;
	CollegeStudent()
	{
		System.out.println("This is a CollegeStudent Sub class");
	}
	CollegeStudent(String name,String dob,int id,String name1,int y)
	{
		super(name,dob,id);
		cname=name1;
		sy=y;
	}
}
public class AssignmentThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String name,dob,sub,cname;
		int id,sal,sy;
		System.out.println("Enter name,dob,sub,cname,id,sal,sy");
		name=in.nextLine();
		dob=in.nextLine();
		sub=in.nextLine();
		cname=in.nextLine();
		id=in.nextInt();
		sal=in.nextInt();
		sy=in.nextInt();
		in.close();
		Teacher t1=new Teacher();
		Teacher t=new Teacher(name,dob,sal,sub);
		Student s1=new Student();
		Student s=new Student(name,dob,id);
		CollegeStudent c1=new CollegeStudent();
		CollegeStudent c=new CollegeStudent(name,dob,id,cname,sy);
		System.out.println("Student details are: "+s.name+" "+s.dob+" "+s.stuid);
		System.out.println("CollegeStudent details are: "+c.name+" "+c.dob+" "+c.stuid+" "+c.cname+" "+c.sy);
		System.out.println("Teacher details are: "+t.name+" "+t.dob+" "+t.sal+" "+t.sub);
		
	}

}
