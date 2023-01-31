package com;

import java.util.ArrayList;
import java.util.List;

public class LearningArrayList {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
//		Adding new element in the list
		list.add(5);
		System.out.println(list);
		
//		Adding '50' to index level '1' in the list
		
		list.add(1,50);
		System.out.println(list);
		
//		adding new list in the current list
		List<Integer> newlist = new ArrayList();
		newlist.add(7);
		newlist.add(8);
		
		list.addAll(newlist);
		System.out.println(list);
		
//		ArrayList functions
		
		System.out.println(list.get(1));
		
//		Remove function using index number
		
		System.out.println(list.remove(0));
		System.out.println(list);
		
//		Remove function using element number
		list.remove(Integer.valueOf(50));
		System.out.println(list);
		
//		Clear the list
//		list.clear();
//		System.out.println(list);
//		
		
//		Replacing the values with indexing values
		list.set(2,100);
		System.out.println(list);
		
//		It contains wether the element is contained or not
		System.out.println(list.contains(100));
		
		
//		using For loop
		for(int i=0 ; i < list.size(); i++) {
			System.out.println("for element is" +list.get(i));
		}
	}

}



