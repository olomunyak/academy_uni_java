package com.uniwill.note.controller;

import com.uniwill.note.common.NoteStaticFinalCommon;

public class NoteStaticFinal {

	public static void main(String[] args) {
		
//		NoteStaticFinalCommon nc = new NoteStaticFinalCommon();
		
//		System.out.println(nc.s); // 덩어리를 만들고 호출했다. 객체생성을 하고 호출했다.
		System.out.println(NoteStaticFinalCommon.s); // 객체생성 없이 바로 사용한다.
		
		NoteStaticFinalCommon.s = "졸려";
		System.out.println(NoteStaticFinalCommon.s); // 객체생성 없이 바로 사용한다.
		
		final int TEMP = 1;
//		TEMP = 2; // final로 선언된 값은 바꿀수 없다. 
		System.out.println(TEMP);
		System.out.println(NoteStaticFinalCommon.LOG);

	}

}
