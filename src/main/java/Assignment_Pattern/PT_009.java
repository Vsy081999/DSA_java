package Assignment_Pattern;

import java.util.Scanner;

public class PT_009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = n;
		int nsp = -1;

		while (row <= 2 * n - 1) {

			int i = 1;
			while (i <= nst) {
				System.out.print("*");
				i = i + 1;
			}

			int j = 1;
			while (j <= nsp) {
				System.out.print(" ");
				j = j + 1;
			}

			int k = 1;
			if (row == 1 || row == 2*n-1) {
				k = 2;
			}

			while (k <= nst) {
				System.out.print("*");
				k = k + 1;
			}

			if (row < n) {
				nst = nst - 1;
				nsp = nsp + 2;
			} else {
				nst = nst + 1;
				nsp = nsp - 2;
			}

			System.out.println();
			row = row + 1;
		}
	}
}
