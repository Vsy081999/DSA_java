package Patterns;

import java.util.Scanner;


/* pattern formed


    *
   *!*
  *!*!*
 *!*!*!*
*!*!*!*!*
                 


*/


public class Pattern_012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nsp = n-1;
		int nst = 1;

		while (row <= n) {

			int i = 1;
			while (i <= nsp) {
				System.out.print(" ");
				i = i + 1;
			}
			nsp = nsp - 1;

			int j = 1;
			while (j <= nst) {
				if (j % 2 == 0) {
					System.out.print("!");
				} else {
					System.out.print("*");
				}

				

				j = j + 1;

			}
			nst = nst + 2;


			System.out.println();
			row = row + 1;
		}

	}
}
