package com.ldc.spring.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @className: SpringSampleApplication
 * @description: 启动类
 * @author: charles
 * @date: 2024/5/11 22:13
 **/
@ComponentScan("com.ldc.spring.sample.**")
public class SpringSampleApplication {

	private SpringSampleApplication() {}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringSampleApplication.class
		);

		IPersonService personService = context.getBean(IPersonService.class);
		personService.speak();
	}
}