package com.uniwill.note.service;

import java.util.ArrayList;
import java.util.List;

import com.uniwill.note.bean.NoteEmpBean;

public class NoteEmpService {
	public int[] setArray(String howDirection, int[] pay) {

		int temp = 0;

		if (howDirection.equals("forward")) {
			
			// 순방향 정렬(오름차순)
			// 배열의 앞의 숫자가 뒤의 숫자보다 클 경우 자리르 바꿔준다.
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

			// 역방향 정렬(내림차순)
			// 배열의 앞의 숫자가 뒤의 숫자보다 작을 경우 자리를 바꿔준다.
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
			
			// 순방향 정렬(오름차순)
			// 배열의 앞의 숫자가 뒤의 숫자보다 클 경우 자리르 바꿔준다.
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

			// 역방향 정렬(내림차순)
			// 배열의 앞의 숫자가 뒤의 숫자보다 작을 경우 자리를 바꿔준다.
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
			
			// 순방향 정렬(오름차순)
			// 배열의 앞의 숫자가 뒤의 숫자보다 클 경우 자리르 바꿔준다.
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

			// 역방향 정렬(내림차순)
			// 배열의 앞의 숫자가 뒤의 숫자보다 작을 경우 자리를 바꿔준다.
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
	// 배열을 출력한는 메소드
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
