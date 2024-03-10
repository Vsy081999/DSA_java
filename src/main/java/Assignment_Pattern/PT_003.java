package Assignment_Pattern;

import java.util.Scanner;

public class PT_003 {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
	
			int row = 1;
			int nst = 1;
			int nsp = n - 2;
	
			while (row <= n && n%2!=0) {
	
				int j = 1;
				while (j <= nsp) {
					System.out.print("\t");
					j = j + 1;
				}
	
				int i = 1;
				while (i <= nst) {
					System.out.print("*"+"\t");
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
