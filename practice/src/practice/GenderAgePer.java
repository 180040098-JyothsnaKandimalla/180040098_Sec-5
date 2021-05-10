package practice;
class Percent
{
	String gen;
	int age;
	float per;
	void setAssignment(String gen,int age)
	{
		this.gen=gen;
		this.age=age;
		if(gen=="Male")
		{
			if(age>=1&&age<=50)
				per=8.2f;
			else
				per=9.2f;
					
		}
		else if(gen=="Female")
		{
			if(age>=1&&age<=50)
				per=8.4f;
			else
				per=10.5f;
		}
	}
	void display()
	{
		System.out.println("Percentage is:"+per+"%");
	}
}

public class GenderAgePer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percent obj=new Percent();
		obj.setAssignment("Male",68);
		obj.display();
		Percent obj1=new Percent();
		obj1.setAssignment("Female",48);
		obj1.display();

	}

}


