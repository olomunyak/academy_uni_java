
public class BaseMethodA {

	public static void main(String[] args) {
		
		BaseMethodB b = new BaseMethodB();
				
		// 두 정수를 받아서 사칙연산
		b.add(1,2);		
		b.sub(3,1);
		b.multi(2,3);		
		b.divid(7,2);
		
		// 초기값과 종료값을 받아서 합을 구하는 메소드
		int sum = b.sum(1, 100);
		System.out.println(sum);
		System.out.println(b.sum(1,100));
			
		// 점수를 받아서 문자열로 변환
		String sc = b.toStr(101);
		System.out.println(sc);
		
		// 구구단
		b.makeupMultiplication(2);
	}

}
