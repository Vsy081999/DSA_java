package Number_system;

public class Bin_to_Dec {

	public static void main(String[] args) {
		
		int n = 101011;
		int ans = 0;
		int mul = 1;

		while (n != 0) {

			int rem = n % 10;
			ans = ans + rem * mul;
			mul *= 2; // mul=mul*10;
			n /= 10; // n=n/2;
		}
		System.out.println(ans);

		
		
		
	}
}
