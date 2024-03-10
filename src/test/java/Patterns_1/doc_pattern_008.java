package Patterns_1;

import java.util.Scanner;

public class doc_pattern_008 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp_in = n - 2;
		int nsp_out = -1;

		while (row <= n) {
			int i = 1;
			while (i <= nst) {
				System.out.print("*" + " ");
				i = i + 1;
			}

			int j = 1;
			while (j <= nsp_in) {
				System.out.print(" " + " ");
				j = j + 1;
			}

			int k = 1;
			while (k <= nst) {
				System.out.print("*");
				k = k + 1;
			}

			nsp_in  = nsp_in - 1;
			nsp_out = nsp_out + 2;

			System.out.println();
			row = row + 1;

		}
	}
}
