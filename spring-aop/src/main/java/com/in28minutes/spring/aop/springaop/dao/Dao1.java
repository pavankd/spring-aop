package com.in28minutes.spring.aop.springaop.dao;

import org.springframework.stereotype.Repository;

import com.in28minutes.spring.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}

}
