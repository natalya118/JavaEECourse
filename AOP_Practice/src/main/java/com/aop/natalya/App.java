package com.aop.natalya;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args ){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		
//		MiddleDev middle = (MiddleDev)context.getBean("middle");
//		middle.createBugs();
//		
//		MiddleDev middle2 = (MiddleDev)context.getBean("middle2");
//		middle2.createBugs();
//		
		Programmer prog = (Programmer)context.getBean("prog");
		prog.writeCode();
		StackOverflowMember som = (StackOverflowMember) context.getBean("so_guru");
		CopyPaster badProg = (CopyPaster)context.getBean("bad_coder");
		som.answerQuestion("i=0");
		System.out.println(badProg.getCode());
		
//		AutowiredJustProgrammer prog2 = (AutowiredJustProgrammer)context.getBean("prog_annotations");
//		prog2.createBugs();
		
		}

}
