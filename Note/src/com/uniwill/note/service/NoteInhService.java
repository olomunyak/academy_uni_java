package com.uniwill.note.service;

public class NoteInhService extends NoteInhExt {
	
	public String s = "B";  // 상속받는 전역변수를 덮어쓴다. 상속관계에서는 내가 가진 것이 우선이다.
	
	public void b(String msg) {
//		printMsg(msg);   // printMsg가 없어도 오류가 나지 않는다. 상속을 받았기 때문이다.
//		System.out.println(s + " : " + msg); // 상속받은 전역변수를 바로 사용할수 있다.
		System.out.println(this.s + " : " + msg); // this는 현재 클래스의 변수를 의미한다.
		System.out.println(super.s + " : " + msg); // super는 상속받은 클래스의 변수를 의미한다.(상위클래스, 부모클래스)
	}
	
	//@ <-- Annotation
	// 오버라이딩 & 오버로딩
	@Override  // override를 했다고 명시적으로 선언한다. (어노테이션: 머릿말이라고 한다.)
	public void printMsg(String msg) {
		System.out.println("@" + msg);
	}
	
	// 오버로딩  <-- 오버라이딩 한것도 오버로딩 할 수 있다.
	public void printMsg(int a) {
		System.out.println("@숫자:" + a);
	}
}
