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
		
		
		// �Ź� bean��ü(�ڷ�����ü)�� �������� �ٸ��� �ؼ� ���� �������� �ʿ䰡 ����.
		List<NoteListBean> empList2 = new ArrayList<NoteListBean>();
		
		NoteListBean nb = new NoteListBean();
		
		nb.setEmpNo(1);
		nb.setEmpNm("ȫ�浿");
		nb.setPay(100);
		
		empList2.add(nb);
		
		nb = new NoteListBean();
		
		nb.setEmpNo(2);
		nb.setEmpNm("��ö��");
		nb.setPay(600);
		
		empList2.add(nb);
		
		nb = new NoteListBean();
		
		nb.setEmpNo(3);
		nb.setEmpNm("�迵��");
		nb.setPay(1000);
		
		empList2.add(nb);
		
		for(int i = 0 ; i < empList2.size() ; i++) {
			System.out.println("--------------------------------------");
			System.out.println("���2:" + empList2.get(i).getEmpNo());
			System.out.println("�̸�2:" + empList2.get(i).getEmpNm());
			System.out.println("�޿�2:" + empList2.get(i).getPay());
		}
		
		
		// for���� ����ؼ� bean��ü(�ڷ�����ü)�� �������ش�.
		List<NoteListBean> empList3 = new ArrayList<NoteListBean>();

		NoteListBean lb;
		for (int i = 0; i < 10; i++) {
			lb = new NoteListBean();

			lb.setEmpNo(i);
			lb.setEmpNm("��ö��");
			lb.setPay(100);
			
			empList3.add(lb);
		}

		for (int i = 0; i < empList3.size(); i++) {
			System.out.println("--------------------------------------");
			System.out.println("���3:" + empList3.get(i).getEmpNo());
			System.out.println("�̸�3:" + empList3.get(i).getEmpNm());
			System.out.println("�޿�3:" + empList3.get(i).getPay());
		}
	}

}
