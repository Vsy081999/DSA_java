package Patterns;

import java.util.Scanner;

public class Pattern_003 {

/* pattern
	 
	 *****
     ****
     ***
     **
     *
	 
*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = n;
		

		while (row <= n) {

			int i = 1;
			while (i <= nst) {
				System.out.print("*");

				i = i + 1;
			}
			nst = nst - 1;
	
			System.out.println();
			row = row + 1;
		}

	}

}
