package com.aop.natalya;

public class StackOverflowGuru implements StackOverflowMember {

	private String code;

	public void answerQuestion(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
