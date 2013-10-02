package com.uniwill.note.controller;

import com.uniwill.note.bean.NoteBean;
import com.uniwill.note.service.NoteService;

public class NoteMain {

	public static void main(String[] args) {
		NoteService ns = new NoteService();
		
		NoteBean nb = new NoteBean();
		nb.setA(1);
		nb.setS("Hello World!");
		nb.setB(false);

		NoteBean nb2 = new NoteBean();
		nb2.setA(1);
		nb2.setS("Hello World!");
		nb2.setB(false);
		
		ns.printBean(nb);
		ns.printBean(nb2);

	}

}
