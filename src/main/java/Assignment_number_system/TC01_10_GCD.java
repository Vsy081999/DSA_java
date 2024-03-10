package Assignment_number_system;

import java.util.Scanner;

public class TC01_10_GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();

		while (dividend % divisor != 0) {

			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		
		System.out.println(divisor);
	}
}
