package Patterns;

import java.util.Scanner;

/*      Pattern formed
  
 
         *  
       *   *  
     *   *   *  
   *   *   *   *  
 *   *   *   *   *  

 
 
 */


public class Pattern_011 {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nsp = n-1 ;
		int nst = n-4 ;

		while (row <= n) {
			
			int i = 1;
			while (i <= nsp) {
				System.out.print(" "+" ");
				i = i + 1;
			}
			nsp = nsp - 1;

			int j = 1;
			while (j <= nst) {
				System.out.print(" * "+" ");
				j = j + 2;

			}
			nst=nst+2;

			System.out.println();
			row = row + 1;
		}
	}
}
