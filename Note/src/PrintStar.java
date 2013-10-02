
public class PrintStar {

	public static void main(String[] args) {
		// * 출력 1 (5개씩 5줄 출력)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		// * 출력 2
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		// * 출력 3
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}

		// * 출력 4
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(' ');
			}
			for (int k = 1; k <= i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}

		// * 출력 4 다른방법
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

		// * 출력 5
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
		
		// * 출력 5 다릉방법
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(' ');
			}
			for (int k = 5; k >= i; k--) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// * 다이아몬드
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
		
		// * 를 이용해서 문자출력
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
