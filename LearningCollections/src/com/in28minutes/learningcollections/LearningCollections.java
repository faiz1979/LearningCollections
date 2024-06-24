package com.in28minutes.learningcollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LearningCollections {

	public static void main(String[] args) {
		
		List<String> words = List.of("Asma", "Faiz", "Sahil");
		
		List<String> list1 = List.of("Asma", "Faiz", "Sahil");
		List<String> list2 = List.of("Zainab", "Tuba", "Masira");
		List<String> list3 = List.of("Ammi", "Abbu", "Fatima");
		
		List<String> mergedList = new LinkedList<String>();
		mergedList.addAll(list1);
		mergedList.addAll(list2);
		mergedList.addAll(list3);
		System.out.println(mergedList);
		
		List<Integer> numbers = List.of(12, 23, 34, 45, 56, 67, 78, 89, 90);
		
		System.out.println(words.isEmpty());

		System.out.println(words.size());
		
		
		List<String> wordArrayList = new ArrayList<String>(words);
		
		List<String> wordLinkedList = new LinkedList<String>(words);
		
		List<String> wordVectorList = new Vector<String>(words);
		
		wordArrayList.add("Dog");
		wordArrayList.add(1, "Ball");
		wordArrayList.contains("sasd");
		//wordArrayList.clear();
		
		System.out.println(wordArrayList.get(0));
		System.out.println(wordArrayList);
		System.out.println(wordArrayList.indexOf("Dog"));
		
		wordLinkedList.add("Friend");
		System.out.println(wordLinkedList);
		wordLinkedList.add(1, "Kondhwa");
		wordLinkedList.add(2, "Kondhwa");
		wordLinkedList.add("Kondhwa");
		wordLinkedList.add("Kondhwa");
		wordLinkedList.addAll(2, words);
		System.out.println(wordLinkedList);
		wordLinkedList.set(6, "Fish");
		System.out.println(wordLinkedList);
		wordLinkedList.remove("Kondhwa");
		System.out.println(wordLinkedList);
		wordLinkedList.removeAll(words);
		System.out.println(wordLinkedList);
		
		List<Integer> numVectorList = new Vector<Integer>(numbers);
		System.out.println(numVectorList.contains(89));
		
		
	}

}
