
public class CastStatement {

	public static void main(String[] args) {
		// ����ȯ casting
//		int castnum = 0.9f; <-- error
		int castnum = (int)0.9f;
		System.out.println(castnum);
		
		float f = 1;
		System.out.println(f);
		
		// ���ڿ��� intŸ������ ��ȯ
//		int as = (String)"11"; <-- error
		int as = Integer.parseInt("11");
		System.out.println(as);
		
		//���ڿ��� floatŸ������ ��ȯ
//		float f = "1.1"; <-- error
		float cf = Float.parseFloat("1.1");
		System.out.println(cf);
		
		// floatŸ���� ���ڿ��� ��ȯ
//		String s = 1.1f; <-- error
		String s = Float.toString(1.1f);
		System.out.println(s);

	}

}
