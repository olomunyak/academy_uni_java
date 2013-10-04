package com.uniwill.note.controller;

import java.util.ArrayList;
import java.util.List;

import com.uniwill.note.bean.NoteListBean;

public class NoteListBeanMain {

	public static void main(String[] args) {
		List<NoteListBean> empList = new ArrayList<NoteListBean>();
		
		NoteListBean nb1 = new NoteListBean();
		
		nb1.setEmpNo(1);
		nb1.setEmpNm("È«±æµ¿");
		nb1.setPay(100);
		
		empList.add(nb1);
		
		NoteListBean nb2 = new NoteListBean();
		
		nb2.setEmpNo(2);
		nb2.setEmpNm("±èÃ¶¼ö");
		nb2.setPay(600);
		
		empList.add(nb2);
		
		NoteListBean nb3 = new NoteListBean();
		
		nb3.setEmpNo(3);
		nb3.setEmpNm("±è¿µÈñ");
		nb3.setPay(1000);
		
		empList.add(nb3);
		
		for(int i = 0 ; i < empList.size() ; i++) {
			System.out.println("--------------------------------------");
			System.out.println("»ç¹ø:" + empList.get(i).getEmpNo());
			System.out.println("ÀÌ¸§:" + empList.get(i).getEmpNm());
			System.out.println("±Þ¿©:" + empList.get(i).getPay());
		}
	}

}
