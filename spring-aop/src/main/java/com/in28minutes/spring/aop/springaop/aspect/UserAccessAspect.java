package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class UserAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());


	//what kind of method I would intercept
	//execution(* PACKAGE.*.*(..)) //this is pointcut point cut is a experssions
	          
	//@Before("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	//using commonconfig
	@Before("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void before(JoinPoint joinPoint) {
		//Advice
		logger.info("Check for user access");
		logger.info("Allow execution for {}",joinPoint);
	}
}
