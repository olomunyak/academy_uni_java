
public class PrintStar {

	public static void main(String[] args) {
		// * ��� 1 (5���� 5�� ���)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		// * ��� 2
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		// * ��� 3
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}

		// * ��� 4
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(' ');
			}
			for (int k = 1; k <= i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}

		// * ��� 4 �ٸ����
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((5 - i) < j) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}

		// * ��� 5
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j < i) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		// * ��� 5 �ٸ����
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(' ');
			}
			for (int k = 5; k >= i; k--) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// * ���̾Ƹ��
		for (int i = 5; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				if (i + j <= 9) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for (int i = 8; i >= 5; i--) {
			for (int j = 1; j <= i; j++) {
				if (i + j <= 9) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// * �� �̿��ؼ� �������
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 11; j++) {

				if (j <= 4) {
					if ((i + j == 4) || (i == 0) || (i == 4)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					if ((i + 6 == j) || (i + j == 10)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}		
	}

}
