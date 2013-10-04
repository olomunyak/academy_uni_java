package com.uniwill.note.controller;

import java.util.ArrayList;
import java.util.List;

import com.uniwill.note.bean.NoteEmpBean2;
import com.uniwill.note.service.NoteEmpService2;

public class NoteEmpMain2 {

	public static void main(String[] args) {
		
		List<NoteEmpBean2> list = new ArrayList<NoteEmpBean2>();
		NoteEmpBean2 eb;
		
		String[] str;
		
		for(int i = 0 ; i < args.length ; i++) {

			str = args[i].split(",");

			eb = new NoteEmpBean2();
			
			eb.setEmpNo(Integer.parseInt(str[0]));
			eb.setEmpNm(str[1]);
			eb.setEmpPay(Double.parseDouble(str[2]));
			
			list.add(eb);			
		}
		
		NoteEmpService2 as = new NoteEmpService2();

		as.mPay(list);
		
		for(int i = 0 ; i < args.length ; i++) {
			System.out.print(list.get(i).getEmpNo() + " ");
			System.out.print(list.get(i).getEmpNm() + " ");
			System.out.print(list.get(i).getEmpPay() + " ");
			System.out.print(list.get(i).getEmpMPay() + " ");
			System.out.println();
		}		
	}

}
