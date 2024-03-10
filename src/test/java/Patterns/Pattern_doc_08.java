package Patterns;

import java.util.Scanner;

public class Pattern_doc_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 5;
		int nsp = 1;

		while (row <= n) {

			int i = 1;
			while (i <= nst) {

				System.out.print("*");
				i = i + 1;
			}

			int j = 1;
			while (j <= nsp) {
				System.out.print(" ");
				j = j + 1;
			}

			System.out.println();
			row = row + 1;
		}
	}
}
