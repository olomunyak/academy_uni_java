
public class ControlStatements {

	public static void main(String[] args) {
		// ���ǹ� 1 (if)
		int a = 1;
		int b = 2;

		if (a > b) {
			System.out.println("a�� b���� ũ��.");
		} else if (a == b) {
			System.out.println("a�� b���� ����.");
		} else {
			System.out.println("a�� b���� �۴�.");
		}

		// ���ǹ� 2 (if)
		int score = 77;

		if (score <= 100 && score >= 90) {
			System.out.println("A");
		} else if (score < 90 && score >= 80) {
			System.out.println("B");
		} else if (score < 80 && score >= 70) {
			System.out.println("C");
		} else if (score < 70 && score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
