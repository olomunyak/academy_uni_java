package com.uniwill.note.controller;

import com.uniwill.note.service.NoteInhService;

public class NoteInhMain {

	public static void main(String[] args) {
		
		NoteInhService is = new NoteInhService();
		
		is.printMsg("Hello World!"); // ��ӹ��� Ŭ������ �ִ� �޼ҵ带 ���, b��� �̸����� CommonTest Ŭ������ �ִ� �޼ҵ带 ����Ҽ� �ִ�.
		is.printMsg(1);
		is.b("Hello World!"); // B�� �ִ� �޼ҵ带 ���
	}

}
