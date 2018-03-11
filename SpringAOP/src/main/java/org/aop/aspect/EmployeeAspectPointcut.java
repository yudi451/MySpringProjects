package org.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointcut {
	
	@Before("getNamePointcut()")
	public void loggingAdvice() {
		System.out.println("Executing logging advice on getName()");
	}
	
	@Before("getNamePointcut()")
	public void secondAdvice() {
		System.out.println("Executing second advice on getName()");
	}
	
	@Pointcut("execution(public String getName())")
	public void getNamePointcut() {
		
	}
	
	@Before("allMethodsPointcut()")
	public void allServiceMethodsAdvice() {
		System.out.println("Before executing service method");
	}
	
	@Pointcut("within(org.aop.service.*)")
	public void allMethodsPointcut() {
		
	}
}
