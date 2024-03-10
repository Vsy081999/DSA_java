package Number_system;

public class Dec_to_Bin {

	public static void main(String[] args) {

//		int n = 43;
//		int n = 300;
		int n = 428;
		
		int ans = 0;
		int mul = 1;

		while (n != 0) {

			int rem = n % 2;
			ans = ans + rem * mul;
			mul *= 10; // mul=mul*10;
			n /= 2; // n=n/2;
		}
		System.out.println(ans);
	}
}
