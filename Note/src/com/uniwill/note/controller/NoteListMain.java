package com.uniwill.note.controller;

import java.util.ArrayList;
import java.util.List;

public class NoteListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("a"); // ������
		list.add("b");
		
		System.out.println(list.get(0)); // �����ö�
		System.out.println(list.size()); // ����
		
		list.remove(0); // ���ﶧ
		
		System.out.println(list.get(0));
		
		list.set(0, "a"); // ���� �����Ҷ� , ���� �ִٸ� �ִ� ���� ������.
		
		System.out.println(list.get(0));
		
//		list.isEmpty(); // list�� �����Ͱ� �ִ��� ������ Ȯ���Ѵ�.
		
		System.out.println(list.isEmpty());
		
//		list.contains("a") // list�� a��� ������ ���ԵǾ� �ִ��� Ȯ���Ѵ�.
		
		System.out.println(list.contains("a"));

	}

}
