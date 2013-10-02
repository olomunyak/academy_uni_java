public class SandGlass {

	public static void main(String[] args) {

		// 모래시계
		for (int i = 0; i < 2; i++) { // 처음 2줄 출력
			for (int j = 1; j <= 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) { // 위 역삼각형 부분 출력
			for (int j = 1; j <= 7; j++) {
				if (((i + j) >= (i * 2)) && ((i + j) <= 8)) { // i+j 의 값이 i의 2배수와 크거나 같고 
					System.out.print("*");                    // i+j 의 값이 8보다 작거나 같은 값은 모드 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 4; i <= 7; i++) { // 아래 삼각형 부분 출력, i는 4부터 시작한다 
			for (int j = 1; j <= 7; j++) {  
				if (((i + j) <= (i * 2)) && ((i + j) >= 8)) { // i+j 의 값이 i의 2배수와 작거나 같고
					System.out.print("*");                    // i+j 의 값이 8보다 크거나 같은 값은 모두 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 2; i++) { // 마지막 2줄 출력
			for (int j = 1; j <= 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// 모래시계 테두리
		for (int i = 0; i < 2; i++) { // 처음 2줄 출력
			for (int j = 1; j <= 7; j++) {
				if ((i == 0) || (j == 1) || (j == 7)) { // 첫째줄은 모두 '*'를 출력한다.
					System.out.print("*");              // 둘째줄은 첫 문자와 마지막 문자만 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) { // 위 역삼각형 부분 출력
			for (int j = 1; j <= 7; j++) {
				if (((i + j) == (i * 2)) || ((i + j) == 8)) { // i+j 의 값이 i의 2배수와 같거나
					System.out.print("*");                    // i+j 의 값이 8인 값은 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 4; i <= 7; i++) { // 아래 삼각형 부분 출력, i는 4부터 시작한다 
			for (int j = 1; j <= 7; j++) {
				if (((i + j) == (i * 2)) || ((i + j) == 8)) { // i+j 의 값이 i의 2배수와 같거나
					System.out.print("*");                    // i+j 의 값이 8인 값은 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 2; i++) { // 마지막 2줄 출력
			for (int j = 1; j <= 7; j++) {
				if ((i == 1) || (j == 1) || (j == 7)) { // 아래줄은 모두 '*'를 출력한다.
					System.out.print("*");              // 위줄은 첫 문자와 마지막 문자만 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// 가변 모래시계
		int size = 15; // 가변 사이즈값

		int iniVal;    // 초기값
		int oddIniVal = (size / 2) + 1; // 사이즈값이 홀수일 경우 
		int EvenIniVal = size / 2;      // 사이즈값이 짝수일 경우

		if ((size % 2) == 1) { // 사이즈 값이 홀수인지 짝수인지 검사해서 초기값을 셋팅한다.
			iniVal = oddIniVal;
		} else {
			iniVal = EvenIniVal;
		}

		for (int i = 0; i < 2; i++) { // 처음 2줄 출력
			for (int j = 1; j <= size; j++) { // 사이즈에 맞춰서 j의 최대값이 셋팅된다.
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= iniVal; i++) { // 위 역삼각형 부분 출력
			for (int j = 1; j <= size; j++) {
				if (((i + j) >= (i * 2)) && ((i + j) <= (size + 1))) { // i+j 의 값이 i의 2배수와 크거나 같고
					System.out.print("*");                             // i+j 의 값이 (size+1)보다 작거나 같은 값은 모드 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = (size / 2) + 1; i <= size; i++) { // 아래 삼각형 부분 출력, i는 ((size / 2) + 1)부터 시작한다. 
			for (int j = 1; j <= size; j++) {
				if (((i + j) <= (i * 2)) && ((i + j) >= (size + 1))) { // i+j 의 값이 i의 2배수와 작거나 같고
					System.out.print("*");                             // i+j 의 값이 (size+1)보다 크거나 같은 값은 모두 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < 2; i++) { // 마지막 2줄 출력
			for (int j = 1; j <= size; j++) { // 사이즈에 맞춰서 j의 최대값이 셋팅된다.
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// 가변 모래시계 테두리
		int lsize = 22; // 가변 사이즈값

		int LiniVal;    // 초기값
		int LoddIniVal = (lsize / 2) + 1; // 사이즈값이 홀수일 경우 
		int LEvenIniVal = lsize / 2;      // 사이즈값이 짝수일 경우

		if ((lsize % 2) == 1) { // 사이즈 값이 홀수인지 짝수인지 검사해서 초기값을 셋팅한다.
			LiniVal = LoddIniVal;
		} else {
			LiniVal = LEvenIniVal;
		}

		for (int i = 0; i < 2; i++) { // 처음 2줄 출력
			for (int j = 1; j <= lsize; j++) { // 사이즈에 맞춰서 j의 최대값이 셋팅된다.
				if ((i == 0) || (j == 1) || (j == lsize)) { // 첫째줄은 모두 '*'를 출력한다.
					System.out.print("*");                  // 둘째줄은 첫 문자와 마지막 문자만 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 1; i <= LiniVal; i++) { // 위 역삼각형 부분 출력
			for (int j = 1; j <= lsize; j++) {
				if (((i + j) == (i * 2)) || ((i + j) == (lsize + 1))) { // i+j 의 값이 i의 2배수와 같거나
					System.out.print("*");                              // i+j 의 값이 (lsize+1)인 값은 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = (lsize / 2) + 1; i <= lsize; i++) { // 아래 삼각형 부분 출력, i는 ((lsize / 2) + 1)부터 시작한다.
			for (int j = 1; j <= lsize; j++) {
				if (((i + j) == (i * 2)) || ((i + j) == (lsize + 1))) { // i+j 의 값이 i의 2배수와 같거나
					System.out.print("*");                              // i+j 의 값이 (lsize+1)인 값은 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < 2; i++) { // 마지막 2줄 출력
			for (int j = 1; j <= lsize; j++) {// 사이즈에 맞춰서 j의 최대값이 셋팅된다.
				if ((i == 1) || (j == 1) || (j == lsize)) { // 아래줄은 모두 '*'를 출력한다.
					System.out.print("*");                  // 위줄은 첫 문자와 마지막 문자만 '*'를 출력한다.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
