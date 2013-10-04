package com.uniwill.note.controller;

import java.util.ArrayList;
import java.util.List;

import com.uniwill.note.bean.NoteListBean;

public class NoteListBeanMain {

	public static void main(String[] args) {
		
		List<NoteListBean> empList = new ArrayList<NoteListBean>();
		
		NoteListBean nb1 = new NoteListBean();
		
		nb1.setEmpNo(1);
		nb1.setEmpNm("홍길동");
		nb1.setPay(100);
		
		empList.add(nb1);
		
		NoteListBean nb2 = new NoteListBean();
		
		nb2.setEmpNo(2);
		nb2.setEmpNm("김철수");
		nb2.setPay(600);
		
		empList.add(nb2);
		
		NoteListBean nb3 = new NoteListBean();
		
		nb3.setEmpNo(3);
		nb3.setEmpNm("김영희");
		nb3.setPay(1000);
		
		empList.add(nb3);
		
		for(int i = 0 ; i < empList.size() ; i++) {
			System.out.println("--------------------------------------");
			System.out.println("사번:" + empList.get(i).getEmpNo());
			System.out.println("이름:" + empList.get(i).getEmpNm());
			System.out.println("급여:" + empList.get(i).getPay());
		}
		
		
		// 매번 bean객체(자료형객체)의 변수명을 다르게 해서 새로 생성해줄 필요가 없다.
		List<NoteListBean> empList2 = new ArrayList<NoteListBean>();
		
		NoteListBean nb = new NoteListBean();
		
		nb.setEmpNo(1);
		nb.setEmpNm("홍길동");
		nb.setPay(100);
		
		empList2.add(nb);
		
		nb = new NoteListBean();
		
		nb.setEmpNo(2);
		nb.setEmpNm("김철수");
		nb.setPay(600);
		
		empList2.add(nb);
		
		nb = new NoteListBean();
		
		nb.setEmpNo(3);
		nb.setEmpNm("김영희");
		nb.setPay(1000);
		
		empList2.add(nb);
		
		for(int i = 0 ; i < empList2.size() ; i++) {
			System.out.println("--------------------------------------");
			System.out.println("사번2:" + empList2.get(i).getEmpNo());
			System.out.println("이름2:" + empList2.get(i).getEmpNm());
			System.out.println("급여2:" + empList2.get(i).getPay());
		}
		
		
		// for문을 사용해서 bean객체(자료형객체)를 생성해준다.
		List<NoteListBean> empList3 = new ArrayList<NoteListBean>();

		NoteListBean lb;
		for (int i = 0; i < 10; i++) {
			lb = new NoteListBean();

			lb.setEmpNo(i);
			lb.setEmpNm("김철수");
			lb.setPay(100);
			
			empList3.add(lb);
		}

		for (int i = 0; i < empList3.size(); i++) {
			System.out.println("--------------------------------------");
			System.out.println("사번3:" + empList3.get(i).getEmpNo());
			System.out.println("이름3:" + empList3.get(i).getEmpNm());
			System.out.println("급여3:" + empList3.get(i).getPay());
		}
	}

}
