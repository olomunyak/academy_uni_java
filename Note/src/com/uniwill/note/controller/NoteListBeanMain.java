package com.uniwill.note.controller;

import java.util.ArrayList;
import java.util.List;

import com.uniwill.note.bean.NoteListBean;

public class NoteListBeanMain {

	public static void main(String[] args) {
		List<NoteListBean> empList = new ArrayList<NoteListBean>();
		
		NoteListBean nb1 = new NoteListBean();
		
		nb1.setEmpNo(1);
		nb1.setEmpNm("ȫ�浿");
		nb1.setPay(100);
		
		empList.add(nb1);
		
		NoteListBean nb2 = new NoteListBean();
		
		nb2.setEmpNo(2);
		nb2.setEmpNm("��ö��");
		nb2.setPay(600);
		
		empList.add(nb2);
		
		NoteListBean nb3 = new NoteListBean();
		
		nb3.setEmpNo(3);
		nb3.setEmpNm("�迵��");
		nb3.setPay(1000);
		
		empList.add(nb3);
		
		for(int i = 0 ; i < empList.size() ; i++) {
			System.out.println("--------------------------------------");
			System.out.println("���:" + empList.get(i).getEmpNo());
			System.out.println("�̸�:" + empList.get(i).getEmpNm());
			System.out.println("�޿�:" + empList.get(i).getPay());
		}
	}

}
