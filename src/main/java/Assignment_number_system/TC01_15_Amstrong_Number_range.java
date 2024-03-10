package Assignment_number_system;

import java.util.Scanner;

public class TC01_15_Amstrong_Number_range {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ll = sc.nextInt();
		int ul = sc.nextInt();
		int count = 0;
		for (int i = ll; i <= ul; i++) {
			if (IsArmstrong(i)) {
				System.out.println(i + " ");
			}
		}

	}

	public static boolean IsArmstrong(int num) {
		int digitcount = digit_count(num);
		int temp = num;
		int sum = 0;

		while (num != 0) {
			int rem = num % 10;
			sum += (int) Math.pow(rem, digitcount);
			num = num / 10;
		}
		if (sum == temp) {
			return true;
		}
		return false;
	}

	public static int digit_count(int num) {
		int count = 0;
		while (num != 0) {
			int rem = num % 10;
			count++;
			num /= 10;
		}

		return count;
	}
}
