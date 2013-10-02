package com.uniwill.note.common;

public class NoteInhCalcCommon {
	// 문자열부호를 입력받아서 부호에 맞게 연산을 해 준다.
	// float 출력
	public float fnArithmetic(float a, float b, String sign) {

		float result = 0;

		if (sign.equals("+")) { // sign이 '+' 면 a와 b를 더해준다.
			result = a + b;

		} else if (sign.equals("-")) { // sign이 '-' 면 a에서 b를 빼준다.
			result = a - b;

		} else if (sign.equals("/")) { // sign이 '/' 면 a를 b로 나눠준다.
			result = a / b;

		} else if (sign.equals("x")) { // sign이'x' 면 a와 b를 곱해준다.
			result = a * b;

		}

		return result;
	}
}
