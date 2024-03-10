package Assignment_Pattern;

import java.util.Scanner;

public class PT_008 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = 2 * n - 3;
		int row_val = 1;

		while (row <= n) {

			int i = 1;
			int col_val = row_val;
			while (i <= nst) {
				System.out.print(col_val + "\t");
				col_val = col_val + 1;
				i = i + 1;
			}

			int j = 1;
			while (j <= nsp) {
				System.out.print("\t");
				j = j + 1;
			}

			int k = 1;
			if (row == n) {
				k = 2;
				col_val = col_val - 1;
			}

			while (k <= nst) {
				System.out.print(col_val - 1 + "\t");
				col_val = col_val - 1;
				k = k + 1;
			}

			nst = nst + 1;
			nsp = nsp - 2;
			System.out.println();
			row = row + 1;
		}

	}

}
