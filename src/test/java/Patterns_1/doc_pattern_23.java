package Patterns_1;

import java.util.Scanner;

public class doc_pattern_23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;

		while (row <= n) {
			int j = 1;
			while (j <= nsp) {
				System.out.print(" " + "\t");
				j = j + 1;
			}

			int i = 1;
			while (i <= nst) {
				System.out.print("1" + "\t");
				i = i + 1;
			}

			nst = nst + 2;
			nsp = nsp - 1;
			System.out.println();
			row = row + 1;
		}
	}

}
