package Patterns;

import java.util.Scanner;

public class Pattern_doc_17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = (n - 1) / 2;
		int nsp = 1;

		while (row <= n) {

			int i = 1;
			while (i <= nst) {
				System.out.print("*"+" ");
				i = i + 1;
			}

			int j = 1;
			while (j <= nsp) {
				System.out.print(" "+" ");
				j = j + 1;
			}

			int k = 1;
			while (k <= nst) {
				System.out.print("*"+" ");
				k = k + 1;
			}

			if (row < (n + 1) / 2) {

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
