package practice;
class Character
{
	char ch,ch1;
	
	void characterAssignment(char x,char y)
	{   
		ch=x;
		ch1=y;
		int p=(int)ch;
		int q=(int)ch1;
		if(p>q)
			System.out.println(ch1+" "+ch);
		else
			System.out.println(ch+" "+ch1);
		
			
	}
}

public class CharactersOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character obj=new Character();
		obj.characterAssignment('s','e');
		Character obj1=new Character();
		obj1.characterAssignment('a','e');
	}

}


