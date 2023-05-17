package _23Stream;

import java.util.stream.Stream;

public class _01StramCreating {

	public static void main(String[] args) {
		Stream <String> stream = Stream.empty();
//		for(String n:stream) {
//			System.out.println(n);
//		}
		
		stream.forEach(System.out::println);
	}

}
