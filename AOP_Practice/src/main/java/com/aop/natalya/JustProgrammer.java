package com.aop.natalya;

public class JustProgrammer implements Programmer{

	private Language language;
	
	public JustProgrammer(){}
	
	public JustProgrammer(Language language){
		this.language = language;
	}
	
	public void setLanguage(Language language){
		this.language = language;
	}
	public void writeCode() {
		System.out.println("Writing good code without bugs");
		language.learn();
		System.out.println("-------------------------------");
		
	}

}
