package p07_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

public class J201222_04_Queue_Stack {

	public static void main(String[] args) {
		//큐 : FIFO => 선입선출
		
		Queue<String> que = new LinkedList<>();
		que.offer("python");
		que.offer("java");
		System.out.println("peek: "+que.peek());
		
		
		
		//스택 : LIFO => 후입후출
		Stack<String> stack = new Stack<>();
		stack.push("python");
		stack.push("java");
		System.out.println("peek: "+stack.peek());
		
		
	}

}
