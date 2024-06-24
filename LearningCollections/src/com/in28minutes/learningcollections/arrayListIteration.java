package com.in28minutes.learningcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayListIteration {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 23, 34, 45, 56, 67, 78, 89, 90);
		
		List<Integer> intArrayList = new ArrayList<Integer>(numbers);
		
		System.out.println("Basic For Loop\n");
		for(int i =0; i < intArrayList.size(); i++)
		{
			System.out.println(intArrayList.get(i));
		}
		
		System.out.println("\nEnhanced For Loop\n");
		
		for(Integer numb: intArrayList)
		{
			
			System.out.println(numb);
		}
		
		System.out.println("\nMoving through loop using Iterator\n");
		
		Iterator intIterator = intArrayList.iterator();
		
		while (intIterator.hasNext())
		{
			System.out.println(intIterator.next());
		}

	}

}
