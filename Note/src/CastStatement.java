
public class CastStatement {

	public static void main(String[] args) {
		// 형변환 casting
//		int castnum = 0.9f; <-- error
		int castnum = (int)0.9f;
		System.out.println(castnum);
		
		float f = 1;
		System.out.println(f);
		
		// 문자열을 int타입으로 변환
//		int as = (String)"11"; <-- error
		int as = Integer.parseInt("11");
		System.out.println(as);
		
		//문자열을 float타입으로 변환
//		float f = "1.1"; <-- error
		float cf = Float.parseFloat("1.1");
		System.out.println(cf);
		
		// float타입을 문자열로 변환
//		String s = 1.1f; <-- error
		String s = Float.toString(1.1f);
		System.out.println(s);

	}

}
