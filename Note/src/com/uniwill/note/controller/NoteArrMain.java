package com.uniwill.note.controller;

import com.uniwill.note.service.NoteArrService;

public class NoteArrMain {

	public static void main(String[] args) {
		NoteArrService as = new NoteArrService();
		
		// 패키지 구조에 맞추어 숫자5개가 들어있는 
		// 배열을 정렬하는 메소드를 만들고
		// 그 메소드 결과값을 받아 출력하는 메소드
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
