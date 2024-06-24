package com.in28minutes.learningcollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayVectorListIterator {

	public static void main(String[] args) {
		
		List<String> words = List.of("Faiz", "Mujawar", "Pune", "Cybage", "Brothers", "Silicon", "Stack");
		List<String> VectorList = new Vector <String> (words);
		
		
		System.out.println("\nNormal For Loop\n");
		for(int i =0; i< VectorList.size(); i++)
		{
			System.out.println(VectorList.get(i));
		}
		
		
		System.out.println("\nEnhanced For Loop\n");
		for(String word:VectorList)
		{
			System.out.println(word);
		}
		
		System.out.println("\nLooping through using Iterator \n");
		Iterator iteratorName = VectorList.iterator();
		while (iteratorName.hasNext())
		{
			System.out.println(iteratorName.next());
		}

	}

}
