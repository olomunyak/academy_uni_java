
public class BaseOperator {

	public static void main(String[] args) {
		// ���ڿ� ���
		String s = "Hello World!";
		System.out.println(s);

		// ������ ��
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println(c);
		System.out.println("c:" + c);

		// ���ڿ� ������ ���� ��ȭ
		String s1 = "Hello";
		String s2 = " World!";
		s1 += s2;
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);

		// ������ ���ڿ��� ��
		int ia = 10;
		int ib = 20;
		String sc = "30";
		System.out.println(ia + ib + sc);
		System.out.println(ia + sc + ib);
		System.out.println(sc + ia + ib);

		// ����������
		int num = 10;
		System.out.println(++num); // ������ ������ ���� ����
		System.out.println(num++); // ������ ������ ���� ����
		System.out.println(--num);
		System.out.println(num--);		
	}

}
