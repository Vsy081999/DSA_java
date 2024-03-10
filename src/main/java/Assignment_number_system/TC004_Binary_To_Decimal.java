package Assignment_number_system;

import java.util.Scanner;

public class TC004_Binary_To_Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = 0;
		int mul = 1;

		while (n != 0) {
			int rem = n % 10;
			ans = ans + rem * mul;
			mul = mul * 2;
			n = n / 10;
		}
		System.out.println(ans);
	}
}
