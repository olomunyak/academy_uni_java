package com.uniwill.note.controller;

import com.uniwill.note.service.NotePolymorphismA;
import com.uniwill.note.service.NotePolymorphismB;

public class NotePolymorphismMain {

	public static void main(String[] args) {
		
		NotePolymorphismA a1 = new NotePolymorphismA();
		NotePolymorphismB b1 = new NotePolymorphismB();
		NotePolymorphismA a2 = new NotePolymorphismB();
		// NotePolymorphismB가 NotePolymorphismA보다 더 크기 때문에 생성 불가
		// NotePolymorphismB b2 = new NotePolymorphismA();
		
		a1.a();
		b1.a();
		a2.a(); // 껍데기는 NotePolymorphismA인데 알맹이는 NotePolymorphismB에 있는 것을 쓰기 때문에
				// NotePolymorphismA에 존재하는 NotePolymorphismB의 내용만 호출 가능(상속, 오버라이딩)
				// NotePolymorphismB에 있는 a()를 호출
		
		b1.b();
		
		a1.c();
		b1.c();
		a2.c();

	}

}
