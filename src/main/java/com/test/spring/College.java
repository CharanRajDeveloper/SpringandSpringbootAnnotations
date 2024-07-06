package com.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// if we don't give component name(beanName) by default it will take the
// className obviously first letter would be in small case.
@Component("colBean")
public class College {

	private Principal principal;
	private Teacher teacher;
	private String collegeName;

	@SuppressWarnings("deprecation")
	@Value("${com.collegeName}")
	@Required
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Autowired
	@Qualifier(value = "mathTeacher") // when we have @primary annoatation,but we need to use the implementation of
										// some other class.then we can use @Qualifier
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	/*
	 * This is by using constructor injection public College(Principal principal) {
	 * this.principal = principal; }
	 */
	@Value("Charan Raj MS")
	private String studentName;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Autowired
	public void setPrincipal(Principal principal) { // Setter Injection
		this.principal = principal;
	}

	public void display() {
		this.principal.principalInfo();
		teacher.teach();
		System.out.println("College Display Method and student name is:" + studentName + " collegeName:" + collegeName);
	}

}
