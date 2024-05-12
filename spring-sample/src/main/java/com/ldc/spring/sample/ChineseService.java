package com.ldc.spring.sample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @className: ChineseService
 * @description: 中文
 * @author: charles
 * @date: 2024/5/11 22:13
 **/
@Component
@Primary
public class ChineseService implements IPersonService {
	@Override
	public void speak() {
		System.out.println("Say Chinese!");
	}
}
