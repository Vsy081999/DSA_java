package Assignment_Pattern;

import java.util.Scanner;

public class PT1_0012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = 2 * n - 1;
		int row_val = n;

		while (row <= (2 * n) + 1) {

			int i = 1;
			int col_val = row_val;
			while (i <= nst) {
				System.out.print(col_val+" ");
				col_val = col_val - 1;
				i = i + 1;
			}

			int j = 1;
			while (j <= nsp) {
				System.out.print(" "+" ");
				j = j + 1;
			}

			int k = 1;
			if (row == n + 1) {
				k = 2;
				col_val = 0;
			}
			while (k <= nst) {
				System.out.print(col_val + 1+" ");
				col_val = col_val + 1;
				k = k + 1;
			}

			if (row < n + 1) {
				nst = nst + 1;
				nsp = nsp - 2;

			} else {
				nst = nst - 1;
				nsp = nsp + 2;

			}

			System.out.println();
			row = row + 1;

		}

	}
}
