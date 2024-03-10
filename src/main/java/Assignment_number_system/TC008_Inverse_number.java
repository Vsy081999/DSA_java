package Assignment_number_system;

import java.util.Scanner;

public class TC008_Inverse_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(Inverse(num));
	}

	public static int Inverse(int num) {
		int pos = 1;
		int sum = 0;

		while (num != 0) {
			int rem = num % 10;

			sum = (int) (sum + pos * Math.pow(10, rem - 1));
			num /= 10;
			pos++;

		}

		return sum;

	}

}
