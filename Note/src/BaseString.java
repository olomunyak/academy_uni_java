
public class BaseString {

	public static void main(String[] args) {
		// String Ŭ������ �޼ҵ� substring ���
		String s = "hello world!";

		System.out.println(s.substring(6));
		System.out.println(s.substring(2, 5));		
		System.out.println(s.substring(7, 9));
		
		// String Ŭ������ �޼ҵ� replace ���
		System.out.println(s.replace("ll", "ee"));
		
		// String Ŭ������ �޼ҵ� lastIndexOf ���
		System.out.println(s.lastIndexOf("o"));
		System.out.println(s.lastIndexOf("o", 6));
		
		// ������ ��ġ�� ���ڸ� �빮�ڷ� ��ȯ substring, replace
		System.out.println(s.substring(0,6).replace("o", "O") + s.substring(6));
		
		// String Ŭ������ �޼ҵ� length ���
		System.out.println(s.length());
		
		// String Ŭ������ �޼ҵ� trim ���
		System.out.println(s.trim());
		
		// String Ŭ������ toUpperCase, toLowerCase ���
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		// String Ŭ������ equals ���
		String s1 = "a";
		String s2 = "a";
		if(s1.equals(s2)) {
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}
		
		// StringBuffer Ŭ������ append ���
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hi");
		sb.append("Hello").append("World");		
		System.out.println(sb);
		
		// StringBuffer Ŭ������ toString ���
		String str = sb.toString();
		System.out.println(str);
		
		// StringBuffer Ŭ������ insert ���
		sb.insert(3, "�׽�Ʈ��");
		System.out.println(sb);
		
		// StringBuffer Ŭ������ delete ���
		sb.delete(5,6);
		System.out.println(sb);
		
		// StringBuffer Ŭ������ setLength ���
		sb.setLength(3);
		System.out.println(sb);

	}

}
