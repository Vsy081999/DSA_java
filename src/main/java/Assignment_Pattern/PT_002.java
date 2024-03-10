package Assignment_Pattern;

import java.util.Scanner;

public class PT_002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int row_val = 1;

		while (row <= n) {

			int j = 1;
			while (j <= nsp) {
				System.out.print(" " + "\t");
				j = j + 1;
			}

			int i = 1;
			int col_val = row_val;
			while (i <= nst) {
				System.out.print(col_val + "\t");

				if (i < (nst + 1) / 2) {
					col_val = col_val + 1;
				} else {
					col_val = col_val - 1;
				}
				i = i + 1;
			}

			nst = nst + 2;
			nsp = nsp - 1;
			row_val = row_val + 1;

			System.out.println();
			row = row + 1;

		}

	}

}
