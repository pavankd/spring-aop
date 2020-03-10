package com.in28minutes.spring.aop.springaop.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.spring.aop.springaop.aspect.TrackTime;
import com.in28minutes.spring.aop.springaop.dao.Dao1;

@Service
public class Business1 {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	Dao1 dao1;
	
	@TrackTime
	public String calculateSomething() {
		String result = dao1.retrieveSomething();
		logger.info("In Business layer {}", result);
		return result;
	}

}
