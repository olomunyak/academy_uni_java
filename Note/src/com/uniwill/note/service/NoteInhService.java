package com.uniwill.note.service;

public class NoteInhService extends NoteInhExt {
	
	public String s = "B";  // ��ӹ޴� ���������� �����. ��Ӱ��迡���� ���� ���� ���� �켱�̴�.
	
	public void b(String msg) {
//		printMsg(msg);   // printMsg�� ��� ������ ���� �ʴ´�. ����� �޾ұ� �����̴�.
//		System.out.println(s + " : " + msg); // ��ӹ��� ���������� �ٷ� ����Ҽ� �ִ�.
		System.out.println(this.s + " : " + msg); // this�� ���� Ŭ������ ������ �ǹ��Ѵ�.
		System.out.println(super.s + " : " + msg); // super�� ��ӹ��� Ŭ������ ������ �ǹ��Ѵ�.(����Ŭ����, �θ�Ŭ����)
	}
	
	//@ <-- Annotation
	// �������̵� & �����ε�
	@Override  // override�� �ߴٰ� ��������� �����Ѵ�. (������̼�: �Ӹ����̶�� �Ѵ�.)
	public void printMsg(String msg) {
		System.out.println("@" + msg);
	}
	
	// �����ε�  <-- �������̵� �Ѱ͵� �����ε� �� �� �ִ�.
	public void printMsg(int a) {
		System.out.println("@����:" + a);
	}
}
