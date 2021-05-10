package practice;
class Color
{
	char ch;
	void setAssignment(char ch)
	{
		this.ch=ch;
		switch(ch)
		{
		    case 'R':System.out.println("Red");break;
		    case 'B':System.out.println("Blue");break;
		    case 'G':System.out.println("Green");break;
		    case 'O':System.out.println("Orange");break;
		    case 'Y':System.out.println("Yellow");break;
		    case 'W':System.out.println("White");break;
		    default:
		    	System.out.println("Invalid Input");break;
		}
	}
}
public class Colorscode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color obj=new Color();
		obj.setAssignment('R');
		Color obj1=new Color();
		obj1.setAssignment('G');
		Color obj2=new Color();
		obj2.setAssignment('O');
		Color obj3=new Color();
		obj3.setAssignment('j');

	}

}


