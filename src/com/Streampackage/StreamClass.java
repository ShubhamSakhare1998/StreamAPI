package com.Streampackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {
	
	
	public static void main(String[] args) {
		
		List<Student>stu=new ArrayList<Student>();
//		rivate int id;
//		  private String name;
//		  private String address;
//		  private String clg;
		
		
		
		 stu.add(new Student(1,"shubham","sakhare","at.pune","gsg clg"));
		 stu.add(new Student(2,"a","aaa","at.aaaa","a clg"));

		 stu.add(new Student(3,"b","bbb","at.bbbb","b clg"));

		 stu.add(new Student(4,"d","ddd","at.dddd","d clg"));
		   	 
		 //Function Interface use Here map the getId method.
      List<Integer>i=stu.stream().map(Student::getId ).collect(Collectors.toList());

    

for (Integer integer : i) {
	System.out.println(integer);
	
	
}

      

    /*
     * use is the OneToOne Mapping
     * To work with map(), the lambda should have one parameter in, 
representing one element from the source list. 
Choose a suitable name for the parameter, like n 
for a list of numbers, s for a list of strings. 
The result of map() is an "iterable" 
map object which mostly works like a list, but it does not print.*/

//map is the stateless
	List<String>d=stu.stream().map(u->u.getClg() +"dd").collect(Collectors.toList());
	
	for (String string : d) {
		System.out.print(" "+string);
	}
		
	  //use flatMap
	//it is use to OneToMany Mapping
	
	
	// list of even numbers
	List<Integer> even = Arrays.asList( 2, 4, 6, 8, 10);

	// list of odd numbers
	List<Integer> odd = Arrays.asList( 3, 5, 7, 9, 11);

	// list of prime numbers
	List<Integer> primes = Arrays.asList(17, 19, 23, 29, 31);


	// list of numbers
	List<List<Integer>> listOfNumbers = new ArrayList<>();
	listOfNumbers.add(even);
	listOfNumbers.add(odd);
	listOfNumbers.add(primes);

	System.out.println("list of numbers: " + listOfNumbers);
	  
	List<Integer> flattenedList  =listOfNumbers.stream().flatMap(u->u.stream()).collect(Collectors.toList());
	
	
		for (Integer integer : flattenedList) {
			System.out.print(integer);
		}
	
		
		
		
		
	}
	
  
	

}
