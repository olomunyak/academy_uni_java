
public class BaseMethodA {

	public static void main(String[] args) {
		
		BaseMethodB b = new BaseMethodB();
				
		// �� ������ �޾Ƽ� ��Ģ����
		b.add(1,2);		
		b.sub(3,1);
		b.multi(2,3);		
		b.divid(7,2);
		
		// �ʱⰪ�� ���ᰪ�� �޾Ƽ� ���� ���ϴ� �޼ҵ�
		int sum = b.sum(1, 100);
		System.out.println(sum);
		System.out.println(b.sum(1,100));
			
		// ������ �޾Ƽ� ���ڿ��� ��ȯ
		String sc = b.toStr(101);
		System.out.println(sc);
		
		// ������
		b.makeupMultiplication(2);
	}

}
