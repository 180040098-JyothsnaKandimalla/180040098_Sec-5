package practice;
import java.util.*;

public class PrimeNosBet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		m=in.nextInt();
		in.close();
		for (int i = n; i <= m; i++) {
			if (isPrime(i)) System.out.println(i);
		}

	}
	
	public static boolean isPrime(int no) {
		if (no < 0) no *= -1;
		
		Boolean isPrime = true;
		
		for (int i = 2; i < no/2+1; i++) {
			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (no == 0 || no == 1) isPrime = false;
		
		return isPrime;

	}

}
