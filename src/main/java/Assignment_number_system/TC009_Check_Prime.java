package Assignment_number_system;

import java.util.Scanner;

public class TC009_Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}

		}
		if (count >= 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}

}
