package Assignment_number_system;

import java.util.Scanner;

public class TC005_LCM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextInt();
		long n2 = sc.nextInt();
		System.out.println(Find_LCM(n1, n2));
	}

	public static int Find_LCM(long num1, long num2) {
		int divisor = (int) num1;
		int dividend = (int) num2;

		while (dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}

		int lcm = (int) (num1 * num2) / divisor;
		return lcm;
	}
}
