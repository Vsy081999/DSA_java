package Assignment_number_system;

import java.util.Scanner;

public class TC01_12_ReplaceThemAll {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		System.out.println(replace(num));
	}

	public static long replace(long num) {
		long ans = 0;
		int mul = 1;

		if (num == 0) {
			return 5;
		}
		while (num != 0) {
			long rem = num % 10;
			if (rem == 0) {
				rem = 5;
			}
//			ans += rem * (int) Math.pow(10, power);
			ans += rem * mul;
			mul = mul * 10;
			num = num / 10;
		}
		return ans;
	}
}
