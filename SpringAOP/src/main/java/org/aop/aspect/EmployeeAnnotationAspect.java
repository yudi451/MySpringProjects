package org.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {
	
	@Before("annotation(org.aop.aspect.Loggable)")
	public void myAdvice() {
		System.out.println("Executing myAdvice");
	}
}
