
public class BaseArrays {

	public static void main(String[] args) {
		// Array
		// �����Ҵ��� ������ ����
		int[] i = new int[3];
		i[0] = 30;
		System.out.println(i[0]);
		
		// ������ ������ŭ ���� �Ҵ�
		int[] j = {20, 30, 10};
		System.out.println(j[1]);
		
		// split ���
		String a = "�����/�ɽ���/������";
		String[] b = a.split("/");
		System.out.println(b[2]);
		
		// split ��� 2
		String[] c = a.split("/", 2);
		System.out.println(c[1]);

	}

}
