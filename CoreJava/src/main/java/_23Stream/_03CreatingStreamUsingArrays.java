package _23Stream;

import java.util.Arrays;
import java.util.stream.Stream;
//Convertin from array to Stream
public class _03CreatingStreamUsingArrays {

	public static void main(String[] args) {
		String[] str = new String[] {"a","b","c","d"};
		Stream<String> streams = Arrays.stream(str);
		streams.forEach(System.out::println);
		
		System.out.println("-------------------------------");
		Stream<String> streamstr = Stream.of("p","q","r","s");
		streamstr.forEach(System.out::println);
		
		Stream<String> streammix = Arrays.stream(str,3,4);
		streammix.forEach(System.out::println);
	}
}
