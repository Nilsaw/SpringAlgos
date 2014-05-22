package com.site.algo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.site.algo.fifolifo.QueueData;
import com.site.algo.fifolifo.StackData;

public class RunFile {
	private static QueueData queuedata;
	private static StackData stackdata;
	public static ApplicationContext context;

	public static void main(String[] args) {

		context = new FileSystemXmlApplicationContext("context.xml");
		
		queuedata = (QueueData) context.getBean("queueData");
		stackdata = (StackData) context.getBean("stackData");

	}
}
