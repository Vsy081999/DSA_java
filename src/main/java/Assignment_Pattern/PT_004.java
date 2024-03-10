package Assignment_Pattern;

import java.util.Scanner;

public class PT_004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int row_value = 1;

		while (row <= n) {
			int i = 1;
			int col_val = row_value;
			while (i <= nst) {
				System.out.print(col_val + "\t");
				col_val = col_val + 1;
				i = i + 1;
			}

			nst = nst + 1;
			row_value = col_val;

			System.out.println();
			row = row + 1;

		}
	}
}
