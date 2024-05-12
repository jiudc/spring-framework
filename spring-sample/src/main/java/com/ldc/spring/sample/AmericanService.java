package com.ldc.spring.sample;

import org.springframework.stereotype.Component;

/**
 * @className: AmericanService
 * @description: 英文
 * @author: charles
 * @date: 2024/5/11 22:13
 **/
@Component
public class AmericanService implements IPersonService{
	@Override
	public void speak() {
		System.out.println("Say English!");
	}
}
