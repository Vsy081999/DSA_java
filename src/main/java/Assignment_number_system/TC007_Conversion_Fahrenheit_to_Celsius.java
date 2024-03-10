package Assignment_number_system;

import java.util.Scanner;

public class TC007_Conversion_Fahrenheit_to_Celsius {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ll = sc.nextInt();
		int ul = sc.nextInt();
		int step = sc.nextInt();

		for (int i = ll; i <= ul; i = i + step) {

			int c = (int) ((5.0 / 9) * (i - 32));
			System.out.println(i + "\t" + c);

		}
	}
}
