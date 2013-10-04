package com.uniwill.note.controller;

import java.util.ArrayList;
import java.util.List;

import com.uniwill.note.bean.NoteEmpBean;
import com.uniwill.note.service.NoteEmpService;

public class NoteEmpMain {

	public static void main(String[] args) {
		
		List<NoteEmpBean> list = new ArrayList<NoteEmpBean>();

		NoteEmpBean eb;
		String[] str;

		for(int i = 0 ; i < args.length; i++) {
			
			str = args[i].split(",");
			
			eb = new NoteEmpBean();
					
			eb.setEmpNo(Integer.parseInt(str[0]));
			eb.setEmpNm(str[1]);
			eb.setEmpPay(Long.parseLong(str[2]));
			
			list.add(eb);
		}
		
		NoteEmpService as = new NoteEmpService();
		
		System.out.println("============ before sort============");
		as.printArrayList(list);
		System.out.println("---------------------------");
		
		as.setArray("forward", list);
		System.out.println("============ after forward ============");
		as.printArrayList(list);
		System.out.println("---------------------------");
	
		as.setArray("reverse", list);
		System.out.println("============ after reverse ============");
		as.printArrayList(list);
		System.out.println("---------------------------");
				
		int[] a = { 23, 9, 6, 35, 31, 21, 11 };
		as.setArray("forward", a);
		as.printArray(a);

		System.out.println();

		as.setArray("reverse", a);
		as.printArray(a);
	}
}
