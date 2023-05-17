package _23Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestOne {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(30);
		li.add(10);
		li.add(41);
		li.add(21);
		System.out.println("List1 items are:"+li);
		li.add(100);
		System.out.println(li);
		
		
		//Difference is not modified this type of array we cannot modified this type of lists
		List<Integer> list2 = Arrays.asList(12,4,67,83,97,23,21);
		System.out.println("list2 elements are:"+list2);
		//list2.add(100);
		//System.out.println(list2);
		
		List<Integer> listEven = new ArrayList<Integer>();
		for(Integer i:li) {
			if(i%2==0) {
				listEven.add(i);
			}
		}
		System.out.println("List of even Using Normal collection is:"+listEven);
		
		//With Stream API
		Stream<Integer> stream = li.stream();
		List<Integer> newEvenList = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Using Stream API the even numbers is:"+newEvenList);
		
		//Using stream sorting
		List<Integer> sortedList = stream.sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
