package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;



public class ListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String> ();
		
		list.add("cars");
		list.add("bikes");
		list.add("cylces");
		
		
		
		System.out.println(list);
		System.out.println(list.get(0));
		
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
		Iterator <String> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
		for(String data:list) {
			System.out.println(data);
		}
		
		
		Collections.sort(list);
		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		
		list1.add("banana");
		list1.add("banana");
		list1.add("banana");
		list1.add("banana");
		
		list1.addFirst("tomato");
		list1.addLast("apples");
		
		System.out.println(list1);
		
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("t1");
		stack.push("t2");
		stack.pop();
		stack.push("t3");
		stack.push("t4");
		
		System.out.println(stack.peek());
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("n1");
		vector.add("n2");
	}

}
