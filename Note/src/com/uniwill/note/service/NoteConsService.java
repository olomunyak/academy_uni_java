package com.uniwill.note.service;

public class NoteConsService {
	private String s = "Test";

	// 기본생성자 선언
	public NoteConsService() { }
	
	// 생성자 선언
	public NoteConsService(String msg) {
		s = msg;
	}

	// 어디서나 작동가능하고 반환값이 없는 printS다.
	// 변수s를 출력해준다.
	public void printS() {
		System.out.println(s);
	}
}
