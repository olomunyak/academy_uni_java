package com.uniwill.note.controller;

import java.util.HashMap;
import java.util.Map;

public class NoteMapMain {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("a", 1);
		map.put("b", 2);
		
		System.out.println(map.get("a"));
		
		map.put("a", 4);
		
		System.out.println(map.get("a"));
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.size());
		
		System.out.println(map.containsKey("a"));
		System.out.println(map.containsValue(3));
		
		map.remove("a");
		
		System.out.println(map.size());
		
		map.clear();
		
		System.out.println(map.size());
	}

}
