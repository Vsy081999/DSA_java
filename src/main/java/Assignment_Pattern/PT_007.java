package Assignment_Pattern;

import java.util.Scanner;

public class PT_007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int row_val = 1;

		while (row <= n) {

			int i = 1;
			int col_val = row_val;
			while (i <= nst) {
				System.out.print(col_val + "\t");
				if (i < (nst + i) / 2) {
					col_val = 0;
				} else {
					col_val = row_val;

				}
				i = i + 1;
			}

			nst = nst + 1;
			row_val = row_val + 1;
			System.out.println();
			row = row + 1;

		}
	}
}
