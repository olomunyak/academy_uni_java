
public class BaseOperator {

	public static void main(String[] args) {
		// 문자열 출력
		String s = "Hello World!";
		System.out.println(s);

		// 정수의 합
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println(c);
		System.out.println("c:" + c);

		// 문자열 변수의 값의 변화
		String s1 = "Hello";
		String s2 = " World!";
		s1 += s2;
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);

		// 정수와 문자열의 합
		int ia = 10;
		int ib = 20;
		String sc = "30";
		System.out.println(ia + ib + sc);
		System.out.println(ia + sc + ib);
		System.out.println(sc + ia + ib);

		// 증감연산자
		int num = 10;
		System.out.println(++num); // 라인이 끝나기 전에 실행
		System.out.println(num++); // 라인이 끝나고 나서 실행
		System.out.println(--num);
		System.out.println(num--);		
	}

}
