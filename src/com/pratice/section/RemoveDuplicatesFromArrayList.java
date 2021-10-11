package com.pratice.section;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(40);
		System.out.println(al);
		
//		for(int i = 0 ; i < al.size() ; i++)
//		{
//		int count = 0;
//		for(int j = 0 ; j < al.size() ; j++)
//		{
//			if(al.get(i).equals(al.get(j)) && i > j)
//			{
//				break;
//			}
//			if(al.get(i).equals(al.get(j)))
//			{
//				count++;
//			}
//			if (count > 1)
//			{
//				al.remove(i);
//			}
//				
//			}
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(al);
		System.out.println(lhs);
		}
		
	}

