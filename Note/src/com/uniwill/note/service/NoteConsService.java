package com.uniwill.note.service;

public class NoteConsService {
	private String s = "Test";

	// �⺻������ ����
	public NoteConsService() { }
	
	// ������ ����
	public NoteConsService(String msg) {
		s = msg;
	}

	// ��𼭳� �۵������ϰ� ��ȯ���� ���� printS��.
	// ����s�� ������ش�.
	public void printS() {
		System.out.println(s);
	}
}
