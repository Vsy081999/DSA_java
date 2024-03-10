package Patterns_1;

import java.util.Scanner;

public class doc_pattern_007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = n;
		int nsp;
		while (row <= n) {

			int i = 1;
			if (row == 1 || row == n) {
				nst = n;
			} else {
				nst = 1;
			}
			while (i <= nst) {
				System.out.print("*"+" ");
				i = i + 1;
			}

			int j = 1;
			if (row == 1 || row == n) {
				nsp = 0;
			} else {
				nsp = n - 2;
			}
			while (j <= nsp) {

				System.out.print(" "+" ");
				j = j + 1;
			}

			int k = 1;
			if (row == 1 || row == n) {
				nst = 0;
			} else {
				nst = 1;
			}
			while (k <= nst) {
				System.out.print("*");
				k = k + 1;
			}

			System.out.println();
			row = row + 1;

		}
	}
}
