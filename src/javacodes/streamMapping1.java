package javacodes;

import java.util.Arrays;
import java.util.List;

public class streamMapping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> vechiles = Arrays.asList("bus","car","cycle","bike");
		
//		before java8 or without using streams
		
	/*	for(String n:vechiles) {
			System.out.println(n.length());
		}*/
		
//		using streams
		
		vechiles.stream().map(vn->vn.length()).forEach(System.out::println);
		
	}

}
