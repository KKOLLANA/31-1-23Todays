package com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListJava {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();
		al.add("kiran");
		al.add("kumar");
		al.add("hello");
		al.add("srikanth");
	
		
		for(String fruit:al)  
		System.out.println(fruit);  
		System.out.println(al);
	}

}
