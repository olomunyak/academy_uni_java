
public class ControlStatements2 {

	public static void main(String[] args) {
		// break ��
		int cnt = 0;

		while (true) {

			System.out.println("a" + cnt);
			cnt++;
			if (cnt == 20) {
				break;
			}
		}

		// continue ��
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

		// switch�� 1
		int n = 2;
		switch (n) {
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		default:
			System.out.println("�� �� ���Դϴ�.");
			break;
		}

		// switch�� 2
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
			System.out.println("������ �����Դϴ�.");
			break;
		}



	}

}
