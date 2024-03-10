package Patterns;

import java.util.Scanner;

public class Pattern_number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;

		while (row <= n) {

			int i = 1;
			while (i <= nsp) {
				System.out.print(" "+"\t");
				i = i + 1;
			}

			int j = 1;
			while (j <= nst) {
				System.out.print(""+j+""+"\t");
				j = j + 1;
			}

			nsp = nsp - 1;
			nst = nst + 2;

			System.out.println();
			row += 1;
		}																									

	}

}
