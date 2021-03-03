package com.pe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pe.beans.Student;

public class PEtest {
public static void main(String[] args) {
	

	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/pe/common/application-context.xml"));
	
	Student student=factory.getBean("student", Student.class);
	System.out.println(student);
}
}
