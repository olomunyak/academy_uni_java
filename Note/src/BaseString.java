
public class BaseString {

	public static void main(String[] args) {
		// String 클래스의 메소드 substring 사용
		String s = "hello world!";

		System.out.println(s.substring(6));
		System.out.println(s.substring(2, 5));		
		System.out.println(s.substring(7, 9));
		
		// String 클래스의 메소드 replace 사용
		System.out.println(s.replace("ll", "ee"));
		
		// String 클래스의 메소드 lastIndexOf 사용
		System.out.println(s.lastIndexOf("o"));
		System.out.println(s.lastIndexOf("o", 6));
		
		// 지정한 위치의 문자를 대문자로 변환 substring, replace
		System.out.println(s.substring(0,6).replace("o", "O") + s.substring(6));
		
		// String 클래스의 메소드 length 사용
		System.out.println(s.length());
		
		// String 클래스의 메소드 trim 사용
		System.out.println(s.trim());
		
		// String 클래스의 toUpperCase, toLowerCase 사용
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		// String 클래스의 equals 사용
		String s1 = "a";
		String s2 = "a";
		if(s1.equals(s2)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		// StringBuffer 클래스의 append 사용
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hi");
		sb.append("Hello").append("World");		
		System.out.println(sb);
		
		// StringBuffer 클래스의 toString 사용
		String str = sb.toString();
		System.out.println(str);
		
		// StringBuffer 클래스의 insert 사용
		sb.insert(3, "테스트중");
		System.out.println(sb);
		
		// StringBuffer 클래스의 delete 사용
		sb.delete(5,6);
		System.out.println(sb);
		
		// StringBuffer 클래스의 setLength 사용
		sb.setLength(3);
		System.out.println(sb);

	}

}
