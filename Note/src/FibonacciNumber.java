
public class FibonacciNumber {

	public static void main(String[] args) {
		int front = 0;
		int back = 1;
		int sum = 0;
		int temp = 0;

		for (int i = 0; i < 20; i++) {
			sum = front + back;

			System.out.print(" " + sum);

			temp = back;
			front = temp;
			back = sum;
		}

	}

}
