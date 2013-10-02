package com.uniwill.note.controller;

import com.uniwill.note.service.NoteConsService;

public class NoteConsMain {

	public static void main(String[] args) {
		NoteConsService nc1 = new NoteConsService(); // 기본생성자 호출
		NoteConsService nc2 = new NoteConsService("Hello World!"); // 문자열 인자값을 받는 생성자 호출

		nc1.printS(); // ts1 클래스의 변수 s값을 출력해주는 메소드
		nc2.printS(); // ts2 클래스의 변수 s값을 출력해주는 메소드
	}

}
