package Assignment_Pattern;

import java.util.Scanner;

public class PT1_0013_pascal_triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 0;
		int nst = 1;

		while (row < n) {

			int i = 0;
			int ncr = 1;
			while (i < nst) {
				System.out.print(ncr + "\t");
				ncr = ((row - i) * (ncr)) / (i + 1);
				i = i + 1;
			}
			nst = nst + 1;
			System.out.println();
			row = row + 1;
		}

	}
}
