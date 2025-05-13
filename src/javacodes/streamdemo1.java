package javacodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;      //Filter method

public class streamdemo1 {

	public static void main(String[] args) {
		
		List <String> words = Arrays.asList("cup",null,"sky","book",null,"rain");
		
		List<String> result = words.stream().filter(p->p!=null).collect(Collectors.toList());
		
		System.out.println(result);

	}

}
