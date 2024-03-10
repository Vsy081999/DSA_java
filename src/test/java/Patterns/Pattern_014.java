package Patterns;

import java.util.Scanner;

public class Pattern_014 {

/*
		
		 
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 


*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;

		while (row <= 2 * n - 1) {
			int i = 1;
			while (i <= nst) {
				System.out.print("*" + " ");
				i = i + 1;
			}

			if (row < n) {
				nst = nst + 1;
			} else {
				nst = nst - 1;
			}

			System.out.println();
			row += 1;
		}
	}
}