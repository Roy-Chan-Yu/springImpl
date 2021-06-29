package com.pouchen.aop;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice{
	public void afterThrowing(Exception ex) {
		System.out.println("------------------");
		System.out.println("additional concern if exception occurs...");
	}
}
