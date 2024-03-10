package Assignment_Pattern;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int row_val = 0;

		int temp=row_val;

		while (row <= n) {
			int i = 1;
			int col_val=row_val;
			while (i <= nst) {
				System.out.print(col_val+" ");
				
				col_val = row_val + col_val;
				col_val=col_val+1;
				
				
//				col_val = temp * (col_val + 1) / 2;
				i = i + 1;

			}

			nst = nst + 1;
			row_val = row_val + 1;
			System.out.println();
			row = row + 1;

		}

	}

}
