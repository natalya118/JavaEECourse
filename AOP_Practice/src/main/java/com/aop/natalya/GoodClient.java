package com.aop.natalya;

public class GoodClient implements Client{
	public void explainTask(){
		System.out.println("I want something like this, but totally different");
	}
	public void agreePrice(){
		System.out.println("I'll pay you more if you finish work in a week");
	}
	public void getWork(){
		System.out.println("Well done!");
	}
	
	public void grizzle(){
		System.out.println("I don't like this style at all.");
	}

}
