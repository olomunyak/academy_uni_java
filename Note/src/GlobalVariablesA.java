public class GlobalVariablesA {
	int a1 = 20;

	public static void main(String[] args) {
		int a2 = 30;
		
		GlobalVariablesA a = new GlobalVariablesA(); // main함수 밖의 전역변수에 접근하기 위해서 객체를 생성해준다.
		
		System.out.println(a.a1); // main함수 밖의 전역변수의 경우 객체를 통해서 접근을 해야 한다. 바로 접근이 불가능하다.
		System.out.println(a2); // 지역변수의 경우 바로 접근이 가능하다.
		
		GlobalVariablesB b = new GlobalVariablesB(); // 외부객체의 메소드에 접근하기 위해서 객체를 생성한다.
		
		System.out.println(b.b);
	}

}