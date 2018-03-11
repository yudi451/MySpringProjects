package org.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {
	
	@After("args(name)")
	public void logStringArguments(String name) {
		System.out.println("Running after advice. String arguments passed=" + name);
	}
	
	@AfterThrowing("within(org.aop.model.Employee)")
	public void logExceptions(JoinPoint joinPoint) {
		System.out.println("Exception thrown in Employee method=" + joinPoint.toString());
	}
	
	@AfterReturning(pointcut="execution(* getName())", returning="returnString")
	public void getNameReturningAdvice(String returnString) {
		System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
	}
}
