package com.aop.natalya;

import org.aspectj.lang.annotation.*;

public class ClientAnnotated implements Client{
	@Pointcut("execution(* com.di.natalya.Programmer.writeCode(..))")

	@Before("writeCode()")
	public void explainTask(){
		System.out.println("I want something like this, but totally different");
	}
	@Before("writeCode()")
	public void agreePrice(){
		System.out.println("I'll pay you more if you finish work in a week");
	}
	@AfterReturning("writeCode()")
	public void getWork(){
		System.out.println("Well done!");
	}
	@AfterThrowing("writeCode()")
	public void grizzle(){
		System.out.println("I don't like this style at all.");
	}
}
