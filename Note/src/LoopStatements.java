
public class LoopStatements {

	public static void main(String[] args) {
		// 반복문을 사용해서 1부터 10까지 출력 (while)
		int num = 1;

		while (num <= 10) {
			System.out.println(num);

			num++;
		}
		
		// 1에서 100까지 홀수 출력
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}

		for (int i = 1; i < 100; i++) {
			if ((i % 2) == 1) {
				System.out.println(i);
			}
		}

		for (int i = 1; i < 100; i++) {
			System.out.println(i);
			i++;
		}

		for (int i = 1; i <= 50; i++) {
			System.out.println((i * 2) - 1);
		}

		for (int i = 0; i < 50; i++) {
			System.out.println((i * 2) + 1);
		}

		// 1부터 100까지의 합
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		int sum2 = 0;

		for (int i = 1; i <= 100; i++) {

			sum2 += i;

			for (int j = 1; j <= 100; j++) {
				while (j <= i) {
					if (j != 1) {
						System.out.print(" + " + j);
					} else {
						System.out.print(j);
					}
					j++;
				}

			}

			System.out.println(" = " + sum2);
		}

		// 반복문을 사용해서 구구단(2) 출력 (for)
		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
		}
		
		// 1부터 100 까지 짝수의 합과 홀수의 합
		int oddSum = 0;
		int evenSum = 0;

		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 1) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}

		System.out.println("odd sum --> " + oddSum);
		System.out.println("even sum --> " + evenSum);

		int tmpOdd = 0;
		int tmpEven = 0;

		for (int i = 1; i <= 50; i++) {
			tmpOdd += (i * 2) - 1;
			tmpEven += i * 2;
		}

		System.out.println("odd sum --> " + tmpOdd);
		System.out.println("even sum --> " + tmpEven);

		int sumOdd = 0;
		int sumEven = 0;

		for (int i = 1; i <= 100; i += 2) {
			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.print(" + " + i);
			}
			sumOdd += i;
		}

		System.out.println(" = " + sumOdd);

		for (int j = 2; j <= 100; j += 2) {
			if (j == 2) {
				System.out.print(j);
			} else {
				System.out.print(" + " + j);
			}
			sumEven += j;
		}

		System.out.println(" = " + sumEven);
		
		// 1에서 100 까지 7의 배수를 출력
		int m = 0;

		for (int i = 1; i <= 100; i++) {
			m = i * 7;
			if (m < 100) {
				System.out.println(m);
			}
		}

		for (int i = 1; i <= 100; i++) {
			if ((i % 7) == 0) {
				System.out.println(i);
			}
		}

		// 구구단 출력
		for (int i = 2; i < 10; i++) {

			System.out.println("------------------------------------");
			System.out.println("<<  " + i + "  >>");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		// 구구단 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}		
	}
	
}
