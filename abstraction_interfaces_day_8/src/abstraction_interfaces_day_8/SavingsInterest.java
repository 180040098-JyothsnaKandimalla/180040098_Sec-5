package abstraction_interfaces_day_8;
abstract class GeneralBank
{
	abstract void getSavingsInterestRate();
	abstract void getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank
{
	void getSavingsInterestRate()
	{
		System.out.println("ICICI Bank Savings Interest is: 4%");
		
	}
	void getFixedDepositInterestRate()
	{
		System.out.println("ICICI Bank FixedDeposit Interest is: 8.5%");
	}
}
class KotMBank extends GeneralBank
{
	void getSavingsInterestRate()
	{
		System.out.println("KotMBank Bank Savings Interest is: 6%");
		
	}
	void getFixedDepositInterestRate()
	{
		System.out.println("KotMBank Bank FixedDeposit Interest is: 9%");
	}
}

public class SavingsInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		i.getSavingsInterestRate();
		i.getFixedDepositInterestRate();
		k.getSavingsInterestRate();
		k.getFixedDepositInterestRate();*/
		GeneralBank g=new ICICIBank();
		g.getFixedDepositInterestRate();
		g.getSavingsInterestRate();
		
		

	}

}
