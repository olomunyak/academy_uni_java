package com.uniwill.note.controller;

import com.uniwill.note.service.NoteConsService;

public class NoteConsMain {

	public static void main(String[] args) {
		NoteConsService nc1 = new NoteConsService(); // �⺻������ ȣ��
		NoteConsService nc2 = new NoteConsService("Hello World!"); // ���ڿ� ���ڰ��� �޴� ������ ȣ��

		nc1.printS(); // ts1 Ŭ������ ���� s���� ������ִ� �޼ҵ�
		nc2.printS(); // ts2 Ŭ������ ���� s���� ������ִ� �޼ҵ�
	}

}
