public class GlobalVariablesA {
	int a1 = 20;

	public static void main(String[] args) {
		int a2 = 30;
		
		GlobalVariablesA a = new GlobalVariablesA(); // main�Լ� ���� ���������� �����ϱ� ���ؼ� ��ü�� �������ش�.
		
		System.out.println(a.a1); // main�Լ� ���� ���������� ��� ��ü�� ���ؼ� ������ �ؾ� �Ѵ�. �ٷ� ������ �Ұ����ϴ�.
		System.out.println(a2); // ���������� ��� �ٷ� ������ �����ϴ�.
		
		GlobalVariablesB b = new GlobalVariablesB(); // �ܺΰ�ü�� �޼ҵ忡 �����ϱ� ���ؼ� ��ü�� �����Ѵ�.
		
		System.out.println(b.b);
	}

}