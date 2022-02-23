package day13;

import java.util.LinkedList;
//import java.util.Stack;

public class JavaCollections {

	public static void main(String[] args) {
		LinkedList<Integer> oj = new LinkedList<>();
		oj.add(50);
		oj.add(100);
		oj.add(150);
		oj.add(200);
		oj.add(250);
		oj.add(300);
		
		System.out.println(oj);
		
		oj.removeFirst();
		System.out.println(oj);
		oj.addLast(500);
		System.out.println(oj);
		oj.set(3,999);
		System.out.println(oj);	
	}
}
