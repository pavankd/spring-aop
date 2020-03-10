package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class AfterAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	          
//	@AfterReturning(
//			value ="execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))",
//			returning = "result"
//			)
	//using commonconfig
	@AfterReturning(
			value ="com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			returning = "result"
			)
	public void after(JoinPoint joinPoint,Object result) {
		logger.info("{} returned the value {}. ",joinPoint,result);
	}
	
//	@AfterThrowing(
//			value ="execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))",
//			throwing ="exception"
//			)
	//using commonconfig
	@AfterThrowing(
			value ="com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			throwing ="exception"
			)
	public void afterThrowing(JoinPoint joinPoint,Exception exception) {
		logger.info("{} returned the exception {}. ",joinPoint,exception);
	}
	
//	@After(
//			value ="execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))"
//			)
	//using commonconfig
	@After(
			value ="com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()"
			)
	public void after(JoinPoint joinPoint) {
		logger.info("After execution {}. ",joinPoint);
	}
}
