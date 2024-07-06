package com.test.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.test.spring")
@PropertySource(value = { "classpath:application.properties" })
public class ProjectConfig {
	/*@Bean
	public Teacher mathTeacher() {
		return new MathTeacher();
	}

	@Bean
	public Principal principalBean() {
		Principal principalBean = new Principal();
		return principalBean;
	}

	@Bean("colBean")
	public College collegeBean() { // use @Bean annotation before the method
		College collegeBean = new College();
		collegeBean.setPrincipal(principalBean()); // methodName will be used as beanId
		collegeBean.setStudentName("Raj");
		collegeBean.setTeacher(mathTeacher());
		return collegeBean;
	} */

	@Bean(name = { "studentBean", "studentBean1" }) // In order to override default beanName(methodName) we can change
													// we can use name attribute and change it.
	public Student studentBean1() {
		return new Student();
	}
}
