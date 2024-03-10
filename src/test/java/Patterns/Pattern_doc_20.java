package Patterns;

import java.util.Scanner;

public class Pattern_doc_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;

		while (row <= n) {

			int j = 1;
			while (j <= nsp) {
				System.out.print(" " + " ");
				j = j + 1;
			}

			int i = 1;
			while (i <= nst) {
				if (i == 1 || i == nst) {
					System.out.print("*" + " ");

				} else {
					System.out.print(" " + " ");

				}

				i = i + 1;
			}

			if (row < (n + 1) / 2) {

				nst = nst + 2;
				nsp = nsp - 1;
			} else {

				nst = nst - 2;
				nsp = nsp + 1;

			}

			System.out.println();
			row = row + 1;

		}

	}

}
