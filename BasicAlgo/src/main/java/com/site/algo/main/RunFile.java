package com.site.algo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunFile {

	public static ApplicationContext context;
	public static void main(String[] args){
		
		context=new ClassPathXmlApplicationContext ("context.xml");
	}
}
