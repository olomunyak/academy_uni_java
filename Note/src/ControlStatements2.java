
public class ControlStatements2 {

	public static void main(String[] args) {
		// break 문
		int cnt = 0;

		while (true) {

			System.out.println("a" + cnt);
			cnt++;
			if (cnt == 20) {
				break;
			}
		}

		// continue 문
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

		// switch문 1
		int n = 2;
		switch (n) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		default:
			System.out.println("그 외 수입니다.");
			break;
		}

		// switch문 2
		int a = 30;
		int b = 20;

		int oper = 1;

		switch (oper) {
		case 1:
			System.out.println("a + b = " + (a + b));
			break;
		case 2:
			System.out.println("a - b = " + (a - b));
			break;
		case 3:
			System.out.println("a * b = " + (a * b));
			break;
		case 4:
			System.out.println("a / b = " + (a / b));
			break;
		default:
			System.out.println("연산자 오류입니다.");
			break;
		}



	}

}
