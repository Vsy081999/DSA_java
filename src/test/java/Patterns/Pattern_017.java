package Patterns;

import java.util.Scanner;

public class Pattern_017 {

	/*
	  
 
       * * * * * 
      * * * * 
    * * * 
  * * 
* 
  * * 
    * * * 
      * * * * 
        * * * * * 

 	  
	 */
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = n;
		int nsp = n-1;

		while (row <= 2*n-1) {

			int i = 1;
			while (i <= nsp) {
				System.out.print(" "+" ");
				i = i + 1;
			}

			int j = 1;
			while (j <= nst) {
				System.out.print("*"+" ");
				j = j + 1;
			}

					
			if (row<n) {
				nst = nst - 1;
				nsp = nsp - 1;
						
				
			} else {

				nst = nst + 1;
				nsp = nsp + 1;
		
						
			}
			
			System.out.println();
			row += 1;
		}
	}
}
