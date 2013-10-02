package com.uniwill.note.controller;

import com.uniwill.note.service.NotePolymorphismA;
import com.uniwill.note.service.NotePolymorphismB;

public class NotePolymorphismMain {

	public static void main(String[] args) {
		
		NotePolymorphismA a1 = new NotePolymorphismA();
		NotePolymorphismB b1 = new NotePolymorphismB();
		NotePolymorphismA a2 = new NotePolymorphismB();
		// NotePolymorphismB�� NotePolymorphismA���� �� ũ�� ������ ���� �Ұ�
		// NotePolymorphismB b2 = new NotePolymorphismA();
		
		a1.a();
		b1.a();
		a2.a(); // ������� NotePolymorphismA�ε� �˸��̴� NotePolymorphismB�� �ִ� ���� ���� ������
				// NotePolymorphismA�� �����ϴ� NotePolymorphismB�� ���븸 ȣ�� ����(���, �������̵�)
				// NotePolymorphismB�� �ִ� a()�� ȣ��
		
		b1.b();
		
		a1.c();
		b1.c();
		a2.c();

	}

}
