package Patterns;

import java.util.Scanner;

public class Pattern_005 {
	
	/*pattern
    ----*
    ---**     
    --***  
    -****    
    *****
*/ 

/* remove " - " from line 29 then pattern

        *
       **  
      *** 
     ****
    ***** 

*/
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nsp = n - 1;
		int nst = n - 4;

		while (row <= n) {
			int i = 1;
			while (i <= nsp) {
//				System.out.print(" ");
				System.out.print("-");
				i = i + 1;
			}
			nsp = nsp - 1;

			int j = 1;
			while (j <= nst) {
				System.out.print("*");
				j = j + 1;
			}
			
			nst = nst + 1;
			System.out.println();
			row = row + 1;
		}
	}
}



