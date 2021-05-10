package practice;
class Pattern
{
	int n;
	void setAssignment(int n)
	{
		this.n=n;
	}
	void display()
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.printf("* ");
			}
			System.out.println("\n");
		}
	}
}
public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern obj=new Pattern();
		obj.setAssignment(3);
		obj.display();
		
		Pattern obj1=new Pattern();
		obj1.setAssignment(5);
		obj1.display();
		

	}

}


