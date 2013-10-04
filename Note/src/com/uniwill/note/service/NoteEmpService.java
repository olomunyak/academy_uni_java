package com.uniwill.note.service;

import java.util.ArrayList;
import java.util.List;

import com.uniwill.note.bean.NoteEmpBean;

public class NoteEmpService {
	public int[] setArray(String howDirection, int[] pay) {

		int temp = 0;

		if (howDirection.equals("forward")) {
			
			// ������ ����(��������)
			// �迭�� ���� ���ڰ� ���� ���ں��� Ŭ ��� �ڸ��� �ٲ��ش�.
			for (int i = 0; i < pay.length - 1; i++) {
				for (int j = i + 1; j < pay.length; j++) {
					if (pay[i] > pay[j]) {
						temp = pay[i];
						pay[i] = pay[j];
						pay[j] = temp;
					}
				}
			}
		} else if (howDirection.equals("reverse")) {

			// ������ ����(��������)
			// �迭�� ���� ���ڰ� ���� ���ں��� ���� ��� �ڸ��� �ٲ��ش�.
			for (int i = 0; i < pay.length - 1; i++) {
				for (int j = i + 1; j < pay.length; j++) {
					if (pay[i] < pay[j]) {
						temp = pay[i];
						pay[i] = pay[j];
						pay[j] = temp;
					}
				}
			}
		}

		return pay;
	}
	
	public long[] setArray(String howDirection, long[] pay) {

		long temp = 0;

		if (howDirection.equals("forward")) {
			
			// ������ ����(��������)
			// �迭�� ���� ���ڰ� ���� ���ں��� Ŭ ��� �ڸ��� �ٲ��ش�.
			for (int i = 0; i < pay.length - 1; i++) {
				for (int j = i + 1; j < pay.length; j++) {
					if (pay[i] > pay[j]) {
						temp = pay[i];
						pay[i] = pay[j];
						pay[j] = temp;
					}
				}
			}
		} else if (howDirection.equals("reverse")) {

			// ������ ����(��������)
			// �迭�� ���� ���ڰ� ���� ���ں��� ���� ��� �ڸ��� �ٲ��ش�.
			for (int i = 0; i < pay.length - 1; i++) {
				for (int j = i + 1; j < pay.length; j++) {
					if (pay[i] < pay[j]) {
						temp = pay[i];
						pay[i] = pay[j];
						pay[j] = temp;
					}
				}
			}
		}

		return pay;
	}

	public List<NoteEmpBean> setArray(String howDirection, List<NoteEmpBean> list) {
		
		List<NoteEmpBean> temp = new ArrayList<NoteEmpBean>();

		if (howDirection.equals("forward")) {
			
			// ������ ����(��������)
			// �迭�� ���� ���ڰ� ���� ���ں��� Ŭ ��� �ڸ��� �ٲ��ش�.
			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(i).getEmpPay() > list.get(j).getEmpPay()) {
						
						temp.add(list.get(i));
						list.set(i, list.get(j));
						list.set(j, temp.get(0));
						
						temp.remove(0);
					}
				}
			}
		} else if (howDirection.equals("reverse")) {

			// ������ ����(��������)
			// �迭�� ���� ���ڰ� ���� ���ں��� ���� ��� �ڸ��� �ٲ��ش�.
			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(i).getEmpPay() < list.get(j).getEmpPay()) {
						
						temp.add(list.get(i));
						list.set(i, list.get(j));
						list.set(j, temp.get(0));
						
						temp.remove(0);
					}
				}
			}
		}

		return list;
	}
	// �迭�� ����Ѵ� �޼ҵ�
	public void printArray(int[] pay) {
		for (int i = 0; i < pay.length; i++) {
			System.out.print(pay[i] + " ");
		}
	}
	
	public void printArrayList(List<NoteEmpBean> list) {
		
		for(int i = 0 ; i < list.size();i++) {
			System.out.print(list.get(i).getEmpNo());
			System.out.print(list.get(i).getEmpNm());
			System.out.print(list.get(i).getEmpPay());
			System.out.println();
		}		
	}
}
