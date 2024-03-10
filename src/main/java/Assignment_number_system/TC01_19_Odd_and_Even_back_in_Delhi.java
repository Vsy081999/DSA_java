package Assignment_number_system;

import java.util.Scanner;

public class TC01_19_Odd_and_Even_back_in_Delhi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		int sum = 0;

		while (num != 0) {
			int rem = (int) num % 10;
			sum += sum + rem;
			num=num/10;
		}

		if (sum % 2 == 0) {

			if (sum % 4 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} else if (sum % 3 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
