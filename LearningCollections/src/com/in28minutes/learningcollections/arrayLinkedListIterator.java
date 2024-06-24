package com.in28minutes.learningcollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class arrayLinkedListIterator {

	public static void main(String[] args) {
		List<String> words = List.of("Faiz", "Mujawar", "Pune", "Cybage", "Brothers", "Silicon", "Stack");
		List<String> linkedList = new LinkedList <String> (words);
		
		for(int i =0; i < linkedList.size(); i++)
		{
			System.out.println(linkedList.get(i));
		}
		
		System.out.println("\nEnhanced For Loop\n");
		
		for(String alpha:linkedList)
		{
			System.out.println(alpha);
		}
		
		Iterator iteratorName = linkedList.iterator();
		while(iteratorName.hasNext())
		{
			System.out.println(iteratorName.next());
		}
		

	}

}
