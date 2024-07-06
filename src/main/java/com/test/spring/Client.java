package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// by default bean id is same as class name(name starts with lower case)
public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		System.out.println("xml file recognised");
		College college = context.getBean("colBean", College.class);
		System.out.println("College object created:" + college);
		college.display();
		((AnnotationConfigApplicationContext) context).close();
	}

}
