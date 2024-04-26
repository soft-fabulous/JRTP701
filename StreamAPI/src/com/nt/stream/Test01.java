package com.nt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {
		List  <String>  list= new ArrayList();
		list.add("radha");
		list.add("bhoriSakhi");
		list.add("Lalita ju");
// filtering
	
List<String> newList =list.stream()
      .filter(name->name.startsWith("r"))
	  .collect(Collectors.toList());	
		
System.out.println(newList);

	
	
	// Sorting 
	
	List <Integer> list5 = List.of(100,20,30,40,50);
	  Integer i1 =list5.stream()
              .max((x,y)->x.compareTo(y))
	          .get();
	
	  System.out.println(i1);
	  
	  
	}
}
