
public class BaseMethodB {
	
	// ���� ���� �޾Ƽ� �����ִ� �żҵ�
	public void add(int i, int j) {
		System.out.println(i + j);
	}

	// �������� �޾Ƽ� ���ִ� �޼ҵ�
	public void sub(int i, int j) {
		System.out.println(i - j);
	}
	
	// �������� �޾Ƽ� �����ִ� �޼ҵ�
	public void multi(int i, int j) {
		System.out.println(i * j);
	}
	
	// �������� �޾Ƽ� �����ִ� �޼ҵ�
	public void divid(int i, int j) {
		System.out.println(i / j);
	}
	
	// i���� j���� ���� ���ϴ� �޼ҵ�
	// i - �ʱⰪ, j - ���ᰪ
	public int sum(int i, int j) {
		int sum = 0;
		
		for(int a = i; a <= j ; a++) {
			sum += a;
		}
		
		return sum;
	}
	
	// ������ �޾Ƽ� ���ڿ��� ��ȯ�ϴ� �޼ҵ� �����	
	public String toStr(int a) {
		return Integer.toString(a);
	}

	public String toStr2(int a) {
		String s = "";
		s = Integer.toString(a);
		
		return s;
	}
	
	// ������
	// Ư�����ڸ� �޾Ƽ� �������� ����ϴ� �޼ҵ�
	public void makeupMultiplication(int a) {
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}
}
