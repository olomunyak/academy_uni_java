package com.uniwill.note.controller;

import com.uniwill.note.service.NoteArrService;

public class NoteArrMain {

	public static void main(String[] args) {
		NoteArrService as = new NoteArrService();
		
		// ��Ű�� ������ ���߾� ����5���� ����ִ� 
		// �迭�� �����ϴ� �޼ҵ带 �����
		// �� �޼ҵ� ������� �޾� ����ϴ� �޼ҵ�
		int[] a = { 23, 9, 6, 35, 31, 21, 11 };
		as.setArray("forward", a);
		as.printArray(a);

		System.out.println();

		as.setArray("reverse", a);
		as.printArray(a);

		System.out.println();
		as.printArray(as.setArray("forward", a));	
		System.out.println();		
		as.printArray(as.setArray("reverse", a));
	}

}
