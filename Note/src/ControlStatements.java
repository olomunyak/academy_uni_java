
public class ControlStatements {

	public static void main(String[] args) {
		// 조건문 1 (if)
		int a = 1;
		int b = 2;

		if (a > b) {
			System.out.println("a가 b보다 크다.");
		} else if (a == b) {
			System.out.println("a는 b보다 같다.");
		} else {
			System.out.println("a는 b보다 작다.");
		}

		// 조건문 2 (if)
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
