public class SandGlass {

	public static void main(String[] args) {

		// �𷡽ð�
		for (int i = 0; i < 2; i++) { // ó�� 2�� ���
			for (int j = 1; j <= 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) { // �� ���ﰢ�� �κ� ���
			for (int j = 1; j <= 7; j++) {
				if (((i + j) >= (i * 2)) && ((i + j) <= 8)) { // i+j �� ���� i�� 2����� ũ�ų� ���� 
					System.out.print("*");                    // i+j �� ���� 8���� �۰ų� ���� ���� ��� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 4; i <= 7; i++) { // �Ʒ� �ﰢ�� �κ� ���, i�� 4���� �����Ѵ� 
			for (int j = 1; j <= 7; j++) {  
				if (((i + j) <= (i * 2)) && ((i + j) >= 8)) { // i+j �� ���� i�� 2����� �۰ų� ����
					System.out.print("*");                    // i+j �� ���� 8���� ũ�ų� ���� ���� ��� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 2; i++) { // ������ 2�� ���
			for (int j = 1; j <= 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// �𷡽ð� �׵θ�
		for (int i = 0; i < 2; i++) { // ó�� 2�� ���
			for (int j = 1; j <= 7; j++) {
				if ((i == 0) || (j == 1) || (j == 7)) { // ù°���� ��� '*'�� ����Ѵ�.
					System.out.print("*");              // ��°���� ù ���ڿ� ������ ���ڸ� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) { // �� ���ﰢ�� �κ� ���
			for (int j = 1; j <= 7; j++) {
				if (((i + j) == (i * 2)) || ((i + j) == 8)) { // i+j �� ���� i�� 2����� ���ų�
					System.out.print("*");                    // i+j �� ���� 8�� ���� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 4; i <= 7; i++) { // �Ʒ� �ﰢ�� �κ� ���, i�� 4���� �����Ѵ� 
			for (int j = 1; j <= 7; j++) {
				if (((i + j) == (i * 2)) || ((i + j) == 8)) { // i+j �� ���� i�� 2����� ���ų�
					System.out.print("*");                    // i+j �� ���� 8�� ���� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 2; i++) { // ������ 2�� ���
			for (int j = 1; j <= 7; j++) {
				if ((i == 1) || (j == 1) || (j == 7)) { // �Ʒ����� ��� '*'�� ����Ѵ�.
					System.out.print("*");              // ������ ù ���ڿ� ������ ���ڸ� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// ���� �𷡽ð�
		int size = 15; // ���� �����

		int iniVal;    // �ʱⰪ
		int oddIniVal = (size / 2) + 1; // ������� Ȧ���� ��� 
		int EvenIniVal = size / 2;      // ������� ¦���� ���

		if ((size % 2) == 1) { // ������ ���� Ȧ������ ¦������ �˻��ؼ� �ʱⰪ�� �����Ѵ�.
			iniVal = oddIniVal;
		} else {
			iniVal = EvenIniVal;
		}

		for (int i = 0; i < 2; i++) { // ó�� 2�� ���
			for (int j = 1; j <= size; j++) { // ����� ���缭 j�� �ִ밪�� ���õȴ�.
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= iniVal; i++) { // �� ���ﰢ�� �κ� ���
			for (int j = 1; j <= size; j++) {
				if (((i + j) >= (i * 2)) && ((i + j) <= (size + 1))) { // i+j �� ���� i�� 2����� ũ�ų� ����
					System.out.print("*");                             // i+j �� ���� (size+1)���� �۰ų� ���� ���� ��� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = (size / 2) + 1; i <= size; i++) { // �Ʒ� �ﰢ�� �κ� ���, i�� ((size / 2) + 1)���� �����Ѵ�. 
			for (int j = 1; j <= size; j++) {
				if (((i + j) <= (i * 2)) && ((i + j) >= (size + 1))) { // i+j �� ���� i�� 2����� �۰ų� ����
					System.out.print("*");                             // i+j �� ���� (size+1)���� ũ�ų� ���� ���� ��� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < 2; i++) { // ������ 2�� ���
			for (int j = 1; j <= size; j++) { // ����� ���缭 j�� �ִ밪�� ���õȴ�.
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// ���� �𷡽ð� �׵θ�
		int lsize = 22; // ���� �����

		int LiniVal;    // �ʱⰪ
		int LoddIniVal = (lsize / 2) + 1; // ������� Ȧ���� ��� 
		int LEvenIniVal = lsize / 2;      // ������� ¦���� ���

		if ((lsize % 2) == 1) { // ������ ���� Ȧ������ ¦������ �˻��ؼ� �ʱⰪ�� �����Ѵ�.
			LiniVal = LoddIniVal;
		} else {
			LiniVal = LEvenIniVal;
		}

		for (int i = 0; i < 2; i++) { // ó�� 2�� ���
			for (int j = 1; j <= lsize; j++) { // ����� ���缭 j�� �ִ밪�� ���õȴ�.
				if ((i == 0) || (j == 1) || (j == lsize)) { // ù°���� ��� '*'�� ����Ѵ�.
					System.out.print("*");                  // ��°���� ù ���ڿ� ������ ���ڸ� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 1; i <= LiniVal; i++) { // �� ���ﰢ�� �κ� ���
			for (int j = 1; j <= lsize; j++) {
				if (((i + j) == (i * 2)) || ((i + j) == (lsize + 1))) { // i+j �� ���� i�� 2����� ���ų�
					System.out.print("*");                              // i+j �� ���� (lsize+1)�� ���� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = (lsize / 2) + 1; i <= lsize; i++) { // �Ʒ� �ﰢ�� �κ� ���, i�� ((lsize / 2) + 1)���� �����Ѵ�.
			for (int j = 1; j <= lsize; j++) {
				if (((i + j) == (i * 2)) || ((i + j) == (lsize + 1))) { // i+j �� ���� i�� 2����� ���ų�
					System.out.print("*");                              // i+j �� ���� (lsize+1)�� ���� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < 2; i++) { // ������ 2�� ���
			for (int j = 1; j <= lsize; j++) {// ����� ���缭 j�� �ִ밪�� ���õȴ�.
				if ((i == 1) || (j == 1) || (j == lsize)) { // �Ʒ����� ��� '*'�� ����Ѵ�.
					System.out.print("*");                  // ������ ù ���ڿ� ������ ���ڸ� '*'�� ����Ѵ�.
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
