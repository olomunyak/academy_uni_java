package com.uniwill.note.service;

import java.util.ArrayList;
import java.util.List;

import com.uniwill.note.bean.NoteEmpBean3;

public class NoteEmpService3 {
	
	public List<NoteEmpBean3> empListArray(List<NoteEmpBean3> list) {
		
		List<NoteEmpBean3> tempList = new ArrayList<NoteEmpBean3>();
		
		for(int i = 0 ; i < list.size() - 1 ; i++) {
			for(int j = i + 1 ; j < list.size(); j++) {
				if(list.get(i).getEmpNo() > list.get(j).getEmpNo()) {
	
					tempList.add(list.get(i));
					list.set(i, list.get(j));
					list.set(j, tempList.get(0));
					tempList.remove(0);
				}
			}			
		}
		
		return list;
	}
	
	public List<NoteEmpBean3> empSetMPay(List<NoteEmpBean3> list) {
				
		for(int i = 0 ; i < list.size() ; i++) {
			list.get(i).setEmpMSal(list.get(i).getEmpYSal() / 13);
		}		
		
		return list;
	}
	
	public void empPrintList(List<NoteEmpBean3> list) {
		
		System.out.println("------ result ---------");
		for(int i = 0 ; i < list.size() ;i ++) {
			System.out.print(list.get(i).getEmpNo() + " / ");
			System.out.print(list.get(i).getEmpName() + " / ");
			System.out.print(list.get(i).getEmpYSal() + " / ");
			System.out.print(list.get(i).getEmpMSal() + " / ");
			System.out.println();
		}		
	}
}
