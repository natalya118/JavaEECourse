package com.aop.natalya;

public class BadProgrammer implements CopyPaster{

	private String code;
	
	public void copyAndPasteCode(String code) {
		System.out.println("I've just found sth on stack overflow...");
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
