package practice;
class AlphabetNum
{
	char ch;
	void setAssignment(char ch)
	{
		this.ch=ch;
		if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
			System.out.println("Digit");
		else if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='?')
			System.out.println("Special Character");
		else
			System.out.println("Alphabet");
	}
}

public class AlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlphabetNum obj=new AlphabetNum();
		obj.setAssignment('8');
		AlphabetNum obj1=new AlphabetNum();
		obj1.setAssignment('#');
		AlphabetNum obj2=new AlphabetNum();
		obj2.setAssignment('A');

	}

}

