
public class Factorial {

	public static void main(String[] args) {
		// 팩토리얼
		int num = 6;
		int result = 1;

		for (int i = num; i >= 1; i--) {
			result *= i;
			if (i == num) {
				System.out.print(i);
			} else {
				System.out.print(" * " + i);
			}
		}
		System.out.println(" = " + result);

		// 1에서 100 까지의 소수 출력 (소수 -> 1과 자기 자신으로만 나누어지는 수)
		int count = 0;

		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i % j) == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
			count = 0;
		}		
		
		// 1 ~ 100 까지 2의 배수이면서 3의 배수인 숫자의 개수
		int acnt = 0;

		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 0) {
				if ((i % 3) == 0) {
					acnt++;
					System.out.print(i + ", ");
				}
			}
		}
		System.out.println();
		System.out.println("cnt --> " + acnt);

		// 1 ~ 100 까지 2의 배수이면서 3의 배수인 숫자의 개수
		int cnt = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (((i % 2) == 0) && ((i % 3) == 0)) {
				cnt++;
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.print("cnt --> " + cnt);
		
		// 1 + 2 - 3 + 4 - 5 + ...
		// 1 ~ 100 까지 계산결과 출력
		int rslt = 0;
		
		for(int i = 1 ; i <= 3 ; i++) {
			if((i % 2) == 1) {
				rslt -= i;
				System.out.print(i + " + ");
			} else {
				rslt += i;
				System.out.print(i + " - ");
			}
		}
		System.out.println();
		System.out.println("result --> " + rslt);
		
		// 1 + 2 - 3 + 4 - 5 + ...
		// 1 ~ 100 까지 계산결과 출력
		int oddResult = 0;
		int evenResult = 1;
		int rlt = 0;
		
		for(int i = 2 ; i <= 5 ; i++) {
			if(((i % 2) == 1)) {
				oddResult += i;
			} else {
				evenResult += i;
			}
		}
		rlt = evenResult - oddResult;
		System.out.print("even(" + evenResult + ") - odd(" + oddResult + ") = " + rlt);

	}

}
