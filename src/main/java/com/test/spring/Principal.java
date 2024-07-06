package com.test.spring;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Principal {

	public void principalInfo() {
		LoggerFactory.getLogger(this.getClass()).info("Principal Info class invoked using logger");
		;

		System.out.println("College Principal Info\nName:Charan\nExperience:14 years");
	}

}
