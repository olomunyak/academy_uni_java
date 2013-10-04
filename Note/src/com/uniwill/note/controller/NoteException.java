package com.uniwill.note.controller;

import com.uniwill.note.service.NoteExceptionService;

public class NoteException {

	public static void main(String[] args) {
		
		System.out.println("Start1");
		int[] a = { 1, 2, 3 };

		try {
			System.out.println(a[3]);
		} catch (Exception e) {
			System.out.println("====>" + e.toString());
			e.printStackTrace();
		}
		System.out.println("End1");
		
		
		System.out.println("Start2");
		int[] b = { 1, 2, 3 };

		try {
			System.out.println(b[3]);
		} catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			System.out.println("====>" + e.toString());
			e.printStackTrace();
		}
		System.out.println("End2");	
		
		
		System.out.println("Start3");
		int[] c = { 1, 2, 3 };

		try {
			System.out.println(c[2]);
			
			throw new NumberFormatException();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("====>" + e.toString());
			
			e.printStackTrace();
		}
		System.out.println("End3");	
		
		
		System.out.println("Start4");
		int[] d = {1, 2, 3};
		
		NoteExceptionService es = new NoteExceptionService();
		try {
			es.test(d);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End4");	

	}

}
