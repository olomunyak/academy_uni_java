package com.uniwill.note.service;

import com.uniwill.note.util.NoteSingletonUtil;

public class NoteSingletonService {
	public void test() {
		NoteSingletonUtil su = NoteSingletonUtil.getInstance();
		
		System.out.println("[2]" + su.flag);
		
		su.flag = 2;
		System.out.println("[2]" + su.flag);
	}
}
