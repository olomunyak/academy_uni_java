package com.uniwill.note.controller;

import com.uniwill.note.service.NoteInhCalcService;

public class NoteInhCalcMain {

	public static void main(String[] args) {
		NoteInhCalcService cs = new NoteInhCalcService();
		System.out.println(cs.fnCalculators(args));
	}

}
