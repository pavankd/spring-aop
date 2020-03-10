package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	
	// if we want to intercept  daolayer us this method in aspect  
	@Pointcut("execution(* com.in28minutes.spring.aop.springaop.dao.*.*(..))")
	public void dataLayerExecution() {}
	
	// if we want to intercept  business us this method in aspect  
	@Pointcut("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void allLayerExecution() {}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {}
	
	@Pointcut("within(com.in28minutes.spring.aop.springaop.dao..*)")
	public void dataLayerExecutionWithWithin() {}
	
	@Pointcut("@annotation(com.in28minutes.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
	

}
