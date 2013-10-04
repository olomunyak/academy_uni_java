package com.uniwill.note.service;

import java.util.List;

import com.uniwill.note.bean.NoteEmpBean2;

public class NoteEmpService2 {
	
	public List<NoteEmpBean2> mPay(List<NoteEmpBean2> list) {
		
		NoteEmpBean2 eb;
		
		for (int i = 0; i < list.size(); i++) {
			
			eb = new NoteEmpBean2();
					
			eb.setEmpNo(list.get(i).getEmpNo());
			eb.setEmpNm(list.get(i).getEmpNm());
			eb.setEmpPay(list.get(i).getEmpPay());
			eb.setEmpMPay( list.get(i).getEmpPay() / 13 * 0.89 );
			
			list.set(i, eb); // list<EmpBean> Ÿ������ �ش� �ε����� �����. ����� ������ ���� empMPay �� �߰��Ǿ���.
			
//			System.out.println( (float)(list.get(i).getEmpPay() / 13 * 0.89) );
		}

		return list;
	}
}
