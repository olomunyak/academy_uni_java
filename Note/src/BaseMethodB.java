
public class BaseMethodB {
	
	// 정수 값을 받아서 더해주는 매소드
	public void add(int i, int j) {
		System.out.println(i + j);
	}

	// 정수값을 받아서 빼주는 메소드
	public void sub(int i, int j) {
		System.out.println(i - j);
	}
	
	// 정수값을 받아서 곱해주는 메소드
	public void multi(int i, int j) {
		System.out.println(i * j);
	}
	
	// 정수값을 받아서 나눠주는 메소드
	public void divid(int i, int j) {
		System.out.println(i / j);
	}
	
	// i부터 j까지 합을 구하는 메소드
	// i - 초기값, j - 종료값
	public int sum(int i, int j) {
		int sum = 0;
		
		for(int a = i; a <= j ; a++) {
			sum += a;
		}
		
		return sum;
	}
	
	// 정수를 받아서 문자열로 반환하는 메소드 만들기	
	public String toStr(int a) {
		return Integer.toString(a);
	}

	public String toStr2(int a) {
		String s = "";
		s = Integer.toString(a);
		
		return s;
	}
	
	// 구구단
	// 특정숫자를 받아서 구구단을 출력하는 메소드
	public void makeupMultiplication(int a) {
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}
}
