package com.site.algo.fifolifo;

import java.util.*;

import org.springframework.stereotype.Component;
/* 
 * Stack time complexity :- insert :- O(1)
 * 				 			remove :- O(1)
 * 			 	 			size   :- O(1)
 * 							search :- O(1) - Best / O(n) - Avg
*/


@Component
public class QueueData {
	
	private LinkedList<String> queue;

	
	public LinkedList<String> getQueue() {
		return queue;
	}

	public void setQueue(LinkedList<String> queue) {
		this.queue = queue;
	}

	
	/*	Queue operations*/

	public void enQueue(String data){
		
	}
	
	public String deQueue(String data){
		return null;
	}
}
