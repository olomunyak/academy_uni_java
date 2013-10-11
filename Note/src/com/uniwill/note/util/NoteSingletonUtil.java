package com.uniwill.note.util;

public class NoteSingletonUtil {
	private static final NoteSingletonUtil instance = new NoteSingletonUtil();
	
	public static final String LOG = "[Test]";
	public int flag = 0;
	
	public static NoteSingletonUtil getInstance() {
		return instance;
	}
}
