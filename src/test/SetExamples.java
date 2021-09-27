package test;

import java.util.HashSet;

public class SetExamples {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("name1");
		set.add("name1");
		set.add("name2");
		set.add("name3");
		set.add("name3");
		set.add(" ");
		
		
		System.out.println(set);
		
		
	}

}
