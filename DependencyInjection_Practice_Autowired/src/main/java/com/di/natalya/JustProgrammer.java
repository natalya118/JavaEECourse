package com.di.natalya;

public class JustProgrammer implements Programmer{

	private Language language;
	
	public JustProgrammer(){}
	
	public JustProgrammer(Language language){
		this.language = language;
	}
	
	public void setLanguage(Language language){
		this.language = language;
	}
	public void createBugs() {
		System.out.println("Just programmer");
		language.learn();
		System.out.println("-------------------------------");
		
	}

}
