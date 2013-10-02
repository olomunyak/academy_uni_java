package com.uniwill.note.service;

public class NoteArrService {
	// 배열을 정렬하는 메소드
	// forward <-- 순방향 정렬, reverse <-- 역방향 저렬
	public int[] setArray(String howDirection, int[] a) {

		int temp = 0;

		if (howDirection.equals("forward")) {
			
			// 순방향 정렬(오름차순)
			// 배열의 앞의 숫자가 뒤의 숫자보다 클 경우 자리르 바꿔준다.
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		} else if (howDirection.equals("reverse")) {

			// 역방향 정렬(내림차순)
			// 배열의 앞의 숫자가 뒤의 숫자보다 작을 경우 자리를 바꿔준다.
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] < a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}

		return a;
	}

	// 배열을 출력한는 메소드
	public void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}	
}
