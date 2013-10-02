package com.uniwill.note.service;

import com.uniwill.note.common.NoteInhCalcCommon;

public class NoteInhCalcService extends NoteInhCalcCommon {
	// �ƱԸ�Ʈ�� �Է¹��� ���ڿ��� ������ش�.
	public float fnCalculators(String[] args) {

		int oprArrNum = args.length / 2; // �������� ����
		int opndArrNum = (args.length / 2) + 1; // �ǿ������� ����

		String[] operatorArr = new String[oprArrNum]; // ����������迭 ���� (��ȣ)
		float[] operandArr = new float[opndArrNum]; // �ǿ���������迭 ���� (����)

		// �����ڿ� �ǿ����ڸ� ������ �迭�� �־��ش�.
		int j = 0; // �ǿ������� �ε�����ȣ 0���� �����Ѵ�.
		int k = 0; // �������� �ε�����ȣ 1���� �����Ѵ�.
		for (int i = 0; i < args.length; i++) {
			if ((i % 2) == 0) {
				operandArr[j++] = Float.parseFloat(args[i]); // ���ڿ����� �ǿ����ڸ� �̾Ƽ� �迭�� ����ִ´�.
			} else {
				operatorArr[k++] = args[i]; // ���ڿ����� �����ڸ� �̾Ƽ� �迭�� ����ִ´�.
			}
		}

		float result = operandArr[0]; // �ǿ������� 0�� �ε����� ���� ������� �־��ش�.(�ʱⰪ)
		for (int i = 1; i < operandArr.length; i++) {

			result = fnArithmetic(result, operandArr[i], operatorArr[i - 1]); // ������� �������ڸ� ����ؼ� �������ش�.
		}

		return result;
	}
}
