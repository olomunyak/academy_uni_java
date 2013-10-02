package com.uniwill.note.service;

import com.uniwill.note.bean.NoteBean;

public class NoteService {
	public void printBean(NoteBean tb) {
		
		System.out.println(tb.getA());
		System.out.println(tb.getS());
		System.out.println(tb.isB());
	}
}
