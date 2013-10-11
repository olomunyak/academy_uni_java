package com.uniwill.note.controller;

import com.uniwill.note.service.NoteSingletonService;
import com.uniwill.note.util.NoteSingletonUtil;

public class NoteSingletonMain {

	public static void main(String[] args) {
		NoteSingletonUtil su = NoteSingletonUtil.getInstance();
		
		System.out.println("[1]" + su.flag);
		
		su.flag = 1;
		System.out.println("[1]" + su.flag);
		
		NoteSingletonService ns = new NoteSingletonService();
		
		ns.test();
		
		System.out.println("[1]" + su.flag);
	}

}
