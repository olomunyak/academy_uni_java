package com.uniwill.note.service;

import com.uniwill.note.common.NoteInhCalcCommon;

public class NoteInhCalcService extends NoteInhCalcCommon {
	// 아규먼트로 입력받은 문자열을 계산해준다.
	public float fnCalculators(String[] args) {

		int oprArrNum = args.length / 2; // 연산자의 개수
		int opndArrNum = (args.length / 2) + 1; // 피연산자의 개수

		String[] operatorArr = new String[oprArrNum]; // 연산자저장배열 생성 (부호)
		float[] operandArr = new float[opndArrNum]; // 피연산자저장배열 생성 (숫자)

		// 연산자와 피연산자를 각각의 배열에 넣어준다.
		int j = 0; // 피연산자의 인덱스번호 0부터 시작한다.
		int k = 0; // 연산자의 인덱스번호 1부터 시작한다.
		for (int i = 0; i < args.length; i++) {
			if ((i % 2) == 0) {
				operandArr[j++] = Float.parseFloat(args[i]); // 문자열에서 피연산자만 뽑아서 배열에 집어넣는다.
			} else {
				operatorArr[k++] = args[i]; // 문자열에서 연산자만 뽑아서 배열에 집어넣는다.
			}
		}

		float result = operandArr[0]; // 피연산자의 0번 인덱스의 값을 결과값에 넣어준다.(초기값)
		for (int i = 1; i < operandArr.length; i++) {

			result = fnArithmetic(result, operandArr[i], operatorArr[i - 1]); // 결과값에 다음숫자를 계속해서 연산해준다.
		}

		return result;
	}
}
