package com.uniwill.note.service;

public class NoteArrService {
	// �迭�� �����ϴ� �޼ҵ�
	// forward <-- ������ ����, reverse <-- ������ ����
	public int[] setArray(String howDirection, int[] a) {

		int temp = 0;

		if (howDirection.equals("forward")) {
			
			// ������ ����(��������)
			// �迭�� ���� ���ڰ� ���� ���ں��� Ŭ ��� �ڸ��� �ٲ��ش�.
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		} else if (howDirection.equals("reverse")) {

			// ������ ����(��������)
			// �迭�� ���� ���ڰ� ���� ���ں��� ���� ��� �ڸ��� �ٲ��ش�.
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] < a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}

		return a;
	}

	// �迭�� ����Ѵ� �޼ҵ�
	public void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}	
}
