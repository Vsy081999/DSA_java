package Arrays;

public class Swap_Demo_1 {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 5, 6, 7, 8, 9 };
		System.out.println(arr[0] + "    " + arr[1]);
		//3,2
		Swap(arr[0],arr[1]);
		System.out.println(arr[0] + "    " + arr[1]);
		//3,2
	}

	public static void Swap(int a, int b) {

		int temp=a;
		a=b;
		b=temp;
		
	}
}
