package Assignment_number_system;

import java.util.Scanner;

public class TC002_Count_Digits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int find_num = sc.nextInt();
		System.out.println(digit_count(find_num,num));
	}

	public static int digit_count(int find_num, int num) {
		int count = 0;
		while (num != 0) {
			int rem = num % 10;
			if (find_num == rem) {
				count++;
			}
			num /= 10;
		}

		return count;
	}
}
