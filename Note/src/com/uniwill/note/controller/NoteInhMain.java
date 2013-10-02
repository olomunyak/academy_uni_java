package com.uniwill.note.controller;

import com.uniwill.note.service.NoteInhService;

public class NoteInhMain {

	public static void main(String[] args) {
		
		NoteInhService is = new NoteInhService();
		
		is.printMsg("Hello World!"); // 상속받은 클래스에 있는 메소드를 사용, b라는 이름으로 CommonTest 클래스에 있는 메소드를 사용할수 있다.
		is.printMsg(1);
		is.b("Hello World!"); // B에 있는 메소드를 사용
	}

}
