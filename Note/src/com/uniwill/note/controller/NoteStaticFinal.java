package com.uniwill.note.controller;

import com.uniwill.note.common.NoteStaticFinalCommon;

public class NoteStaticFinal {

	public static void main(String[] args) {
		
//		NoteStaticFinalCommon nc = new NoteStaticFinalCommon();
		
//		System.out.println(nc.s); // ����� ����� ȣ���ߴ�. ��ü������ �ϰ� ȣ���ߴ�.
		System.out.println(NoteStaticFinalCommon.s); // ��ü���� ���� �ٷ� ����Ѵ�.
		
		NoteStaticFinalCommon.s = "����";
		System.out.println(NoteStaticFinalCommon.s); // ��ü���� ���� �ٷ� ����Ѵ�.
		
		final int TEMP = 1;
//		TEMP = 2; // final�� ����� ���� �ٲܼ� ����. 
		System.out.println(TEMP);
		System.out.println(NoteStaticFinalCommon.LOG);

	}

}
