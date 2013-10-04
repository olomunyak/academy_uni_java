package com.uniwill.note.controller;

import java.util.ArrayList;
import java.util.List;

public class NoteListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("a"); // 넣을때
		list.add("b");
		
		System.out.println(list.get(0)); // 가져올때
		System.out.println(list.size()); // 길이
		
		list.remove(0); // 지울때
		
		System.out.println(list.get(0));
		
		list.set(0, "a"); // 값을 설정할때 , 값이 있다면 있는 값을 덮어씌운다.
		
		System.out.println(list.get(0));
		
//		list.isEmpty(); // list에 데이터가 있는지 없는지 확인한다.
		
		System.out.println(list.isEmpty());
		
//		list.contains("a") // list에 a라는 내용이 포함되어 있는지 확인한다.
		
		System.out.println(list.contains("a"));

	}

}
