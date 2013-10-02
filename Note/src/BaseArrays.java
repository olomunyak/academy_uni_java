
public class BaseArrays {

	public static void main(String[] args) {
		// Array
		// 공간할당후 데이터 삽입
		int[] i = new int[3];
		i[0] = 30;
		System.out.println(i[0]);
		
		// 데이터 갯수만큼 공간 할당
		int[] j = {20, 30, 10};
		System.out.println(j[1]);
		
		// split 사용
		String a = "배고파/심심해/조용해";
		String[] b = a.split("/");
		System.out.println(b[2]);
		
		// split 사용 2
		String[] c = a.split("/", 2);
		System.out.println(c[1]);

	}

}
