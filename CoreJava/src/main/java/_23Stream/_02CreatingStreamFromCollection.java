package _23Stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class _02CreatingStreamFromCollection {

	public static void main(String[] args) throws IOException{
		Collection<String> collecton = Arrays.asList("Java","J2EE","SPRING","HIBERANATE");
		
		//Normal Iteration
		for(String s:collecton) {
			System.out.println(s);
		}
		
		System.out.println("**********Using Streams************");
		Stream<String> stream = collecton.stream();
        
		//Types Of printing Stream
		stream.forEach(s -> System.out.println(s));
		//System.out.println(stream.collect(Collectors.toList()));
        //stream.forEach(System.out::println);
		
		List<String> list = Arrays.asList("Eshwar","Nani","Mammu");
		Stream<String> stream1 = list.stream();
		stream1.forEach(s->System.out.println("Using List convert to Stream:"+s));
		
		Set set = new HashSet<>(list);
		Stream stream2 = set.stream();
		stream2.forEach(System.out::println);
	}

}
