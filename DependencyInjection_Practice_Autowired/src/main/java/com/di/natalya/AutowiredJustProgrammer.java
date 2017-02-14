package com.di.natalya;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutowiredJustProgrammer implements Programmer{

	@Autowired
	@Qualifier("java_language")
	private Language language;
	
	public AutowiredJustProgrammer(){}
	
	public AutowiredJustProgrammer(Language language){
		this.language = language;
	}
	
	
	public void setLanguage(Language language){
		this.language = language;
	}
	public void createBugs() {
		System.out.println("Just programmer autowired");
		language.learn();
		System.out.println("-------------------------------");
		
	}

}
