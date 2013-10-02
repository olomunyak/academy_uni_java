import java.util.Arrays;


public class SortArray {

	public static void main(String[] args) {
		// 문자열 배열 테스트
		String[] s = new String[3];
		s[0] = "a";
		System.out.println(s[0]);

		// 정렬
		int m = 9;
		int n = 110;
		int o = 5;
		int tmpr = 0;

		if (m > n) {
			tmpr = m;
			m = n;
			n = tmpr;
		}
		if (n > o) {
			tmpr = n;
			n = o;
			o = tmpr;
		}
		if (m > n) {
			tmpr = m;
			m = n;
			n = tmpr;
		}

		System.out.println(m + ", " + n + ", " + o);
		
		// 배열 정렬 1
		int[] a = { 17, 114, 11};
		int tmp;

		if (a[0] > a[1]) {

			tmp = a[0];
			a[0] = a[1];
			a[1] = tmp;
		}
		if (a[0] > a[2]) {

			tmp = a[0];
			a[0] = a[2];
			a[2] = tmp;
		}
		if (a[1] > a[2]) {

			tmp = a[1];
			a[1] = a[2];
			a[2] = tmp;
		}

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		// 배열 정렬 2
		int[] arr = { 117, 4, 22, 91, 23, 101, 34, 124, 3, 35, 98, 22};
		int temp;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = arr.length-1 ; j > i ; j--) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
		
		// 배열 정렬 3
		int[] arr2 = {12, 391, 2, 1, 9, 42};
		int temp2;
		
		for(int i = 0 ; i < arr2.length; i++) {
			for(int j = 0 ; j < i ; j++) {
				if(arr2[i] < arr2[j]) {
					temp2 = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp2;					
				}
			}
		}
		
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		// 배열 정렬 4
		int[] arr3 = { 17, 114, 11};
		int temp3;

		for (int i = 0; i < arr3.length - 1; i++) {
			for (int j = i + 1; j < arr3.length; j++) {
				if (arr3[i] > arr3[j]) {
					temp3 = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp3;
				}
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		// 배열 정렬 5
		int[] so = { 17, 114, 11};
		Arrays.sort(so);

		for (int i = 0; i < so.length; i++) {
			System.out.print(so[i] + " ");
		}

	}

}
