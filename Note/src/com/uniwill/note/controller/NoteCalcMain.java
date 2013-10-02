package com.uniwill.note.controller;

import com.uniwill.note.service.NoteCalcService;

public class NoteCalcMain {

	public static void main(String[] args) {

//		System.out.println(args.length);
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		
		NoteCalcService cs = new NoteCalcService();
		
		// 사칙연산 계산기1
		String operatorArr[] = new String[args.length/2];
		int operandArr[] = new int[(args.length/2) + 1];
		
		int j = 0;
		int k = 0;
		for(int i = 0 ; i < args.length ; i++) {
			if( (i % 2) == 0) {
				operandArr[j++] = Integer.parseInt(args[i]);
			}
			else {
				operatorArr[k++] = args[i];
			}
		}			
		
		int result = operandArr[0];
		for(int i = 1 ; i < operandArr.length ; i++) {

			result = cs.setSignOperation(result, operandArr[i], operatorArr[i-1]);
		}
		System.out.println(result);
		
		// 사칙연산 계산기2
		cs.calc(args);
	}

}
