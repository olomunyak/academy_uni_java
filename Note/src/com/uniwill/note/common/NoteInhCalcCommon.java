package com.uniwill.note.common;

public class NoteInhCalcCommon {
	// ���ڿ���ȣ�� �Է¹޾Ƽ� ��ȣ�� �°� ������ �� �ش�.
	// float ���
	public float fnArithmetic(float a, float b, String sign) {

		float result = 0;

		if (sign.equals("+")) { // sign�� '+' �� a�� b�� �����ش�.
			result = a + b;

		} else if (sign.equals("-")) { // sign�� '-' �� a���� b�� ���ش�.
			result = a - b;

		} else if (sign.equals("/")) { // sign�� '/' �� a�� b�� �����ش�.
			result = a / b;

		} else if (sign.equals("x")) { // sign��'x' �� a�� b�� �����ش�.
			result = a * b;

		}

		return result;
	}
}
