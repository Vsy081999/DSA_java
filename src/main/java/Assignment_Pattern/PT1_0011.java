package Assignment_Pattern;

import java.util.Scanner;

public class PT1_0011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int csp = -1;
		int row_val = 1;
		while (row <= n) {

			int j = 1;
			while (j <= nsp) {
				System.out.print(" " + " ");
				j = j + 1;
			}

			int i = 1;
			int col_val = row_val;
			while (i <= nst) {
				System.out.print(col_val + " ");
				col_val = col_val - 1;
				i = i + 1;
			}

			int q = 1;
			while (q <= csp) {
				System.out.print(" " + " ");
				q = q + 1;
			}

			int k = 1;
			col_val = 1;
			if (row == 1 || row == n) {
				k = 2;
			}

			while (k <= nst) {
				System.out.print(col_val + " ");
				col_val = col_val + 1;
				k = k + 1;
			}

			if (row < (n + 1) / 2) {
				nst = nst + 1;
				nsp = nsp - 2;
				csp = csp + 2;
				row_val = row_val + 1;

			} else {
				nst = nst - 1;
				nsp = nsp + 2;
				csp = csp - 2;
				row_val = row_val - 1;
			}

			System.out.println();
			row = row + 1;
		}

	}
}
