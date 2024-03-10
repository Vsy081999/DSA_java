package Loops;

public class TC002_reverse_Integer {

	public static void main(String[] args) {

		int num = 12345;
		int temp=num;
		
		int newnum = 0;

		while (num > 0) {
			int rem = num % 10;
			newnum = newnum * 10 + rem;
//			System.out.println(newnum);
			num = num / 10;
		}

		System.out.println(newnum);

	}
}
