package com.uniwill.note.service;

public class NoteCalcService {
	
	public int setSignOperation(int frontNum, int backNum, String sign) {

		int result = 0;

		if (sign.equals("+")) {
			result = frontNum + backNum;
		} else if (sign.equals("-")) {
			result = frontNum - backNum;
		} else if (sign.equals("/")) {
			result = frontNum / backNum;
		} else if (sign.equals("x")) {
			result = frontNum * backNum;
		}

		return result;
	}
	
	// 사칙연산2
	public float plus(float a, float b) {
		return a + b;
	}
	
	public float minus(float a, float b) {
		return a - b;
	}
	
	public float mul(float a, float b) {
		return a * b;
	}
	
	public float div(float a, float b) {
		return a / b;
	}
	
	public void calc(String[] args) {
		float result = Float.parseFloat(args[0]);
		
		for(int i = 1 ; i < args.length ; i+=2) {
			
			if(args[i].equals("+")) {
				result = plus(result, Float.parseFloat(args[i+1]));
				
			} else if(args[i].equals("-")) {
				result = minus(result, Float.parseFloat(args[i+1]));
				
			} else if(args[i].equals("x")) {
				result = mul(result, Float.parseFloat(args[i+1]));
				
			} else if(args[i].equals("/")) {				
				result = div(result, Float.parseFloat(args[i+1]));
				
			}			
		}
		
		System.out.println(result);
	}	
}
