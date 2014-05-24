package com.site.algo.fifolifo;

import java.util.*;

import org.springframework.stereotype.Component;

/* 
 * Stack time complexity :- Push:- O(1)
 * 				 			Pop :- O(1)
 * 			 	 			Peek:- O(1)
 * 							search :- O(1) - Best / O(n) - Avg
 */

@Component
public class StackData {
	private Stack<String> stack;

	public Stack<String> getStack() {
		return stack;
	}

	public void setStack(Stack<String> stack) {
		this.stack = stack;
	}

	/* Stack operations */

	public void putData(String data) {
		stack.push(data);
	}

	public String getData() {
		return stack.pop();
	}

	public String peekData() {
		return stack.peek();
	}

	/**
	 * call this function to reverse inplace stack
	 */
	void reverseStack() {
		if (!stack.isEmpty()) {
			String data = getData();
			reverseStack();
			pushInStack(data);
		}
	}

	void pushInStack(String a) {
		if (stack.isEmpty()) {
			putData(a);
			return;
		}
		String b = getData();
		pushInStack(a);
		putData(b);
	}
}
