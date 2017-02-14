package com.di.natalya;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args ){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		
		MiddleDev middle = (MiddleDev)context.getBean("middle");
		middle.createBugs();
		
		MiddleDev middle2 = (MiddleDev)context.getBean("middle2");
		middle2.createBugs();
		
		JustProgrammer prog = (JustProgrammer)context.getBean("prog");
		prog.createBugs();
		
		AutowiredJustProgrammer prog2 = (AutowiredJustProgrammer)context.getBean("prog_annotations");
		prog2.createBugs();
		
		}

}
