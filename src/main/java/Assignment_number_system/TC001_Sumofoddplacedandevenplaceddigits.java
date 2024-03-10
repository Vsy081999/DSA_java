package Assignment_number_system;

import java.util.Scanner;

public class TC001_Sumofoddplacedandevenplaceddigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int pos = 1;
		int evensum = 0;
		int oddsum = 0;

		while (n != 0) {
			long rem = n % 10;
			if (pos % 2 == 0) {
				evensum += rem;
			} else {
				oddsum += rem;
			}
			n /= 10;
			pos++;
		}
		
		System.out.println("oddsum    :" + oddsum);
		System.out.println("evensum   :" + evensum);
	}
}
