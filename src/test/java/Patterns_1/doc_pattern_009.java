package Patterns_1;

import java.util.Scanner;

public class doc_pattern_009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= n) {

			int j = 1;
			while (j <= nsp) {
				System.out.print(" "+" ");
				j = j + 1;
			}

			int i = 1;
			while (i <= nst) {
				System.out.print("*"+" ");
				i = i + 1;
			}

			nsp = nsp - 1;
			nst = nst + 2;

			System.out.println();
			row = row + 1;
		}
	}
}
