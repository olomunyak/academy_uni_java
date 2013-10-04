package com.uniwill.note.controller;

import java.util.ArrayList;
import java.util.List;

import com.uniwill.note.bean.NoteEmpBean3;
import com.uniwill.note.service.NoteEmpService3;

public class NoteEmpMain3 {

	public static void main(String[] args) {
		
		NoteEmpBean3 bean;
		List<NoteEmpBean3> list = new ArrayList<NoteEmpBean3>();
		
		String[] temp;
		for(int i = 0 ; i < args.length ; i++) {
			bean = new NoteEmpBean3();
			
			temp = args[i].split(",");
			
			bean.setEmpNo(Integer.parseInt(temp[0]));
			bean.setEmpName(temp[1]);
			bean.setEmpYSal(Double.parseDouble(temp[2]));
			
			list.add(bean);
		}
		
				
		NoteEmpService3 service = new NoteEmpService3();
		
		// �����ϱ��� ����Ʈ ���
		service.empPrintList(list);
		
		service.empListArray(list);
		
		// �����ϰ��� ����Ʈ ���
		service.empPrintList(list);
				
		service.empSetMPay(list);
		
		// �޿������ ����Ʈ ���
		service.empPrintList(list);		
	}
}
